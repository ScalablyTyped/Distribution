package typings.pubnub.mod

import typings.pubnub.anon.Custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembersInputParameters extends GetObjectsParameters {
  
  var spaceId: String = js.native
  
  var users: js.Array[Custom] = js.native
}
object MembersInputParameters {
  
  @scala.inline
  def apply(spaceId: String, users: js.Array[Custom]): MembersInputParameters = {
    val __obj = js.Dynamic.literal(spaceId = spaceId.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembersInputParameters]
  }
  
  @scala.inline
  implicit class MembersInputParametersOps[Self <: MembersInputParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSpaceId(value: String): Self = this.set("spaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersVarargs(value: Custom*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[Custom]): Self = this.set("users", value.asInstanceOf[js.Any])
  }
}
