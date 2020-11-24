package typings.pubnub.mod

import typings.pubnub.anon.Custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembershipsInputParameters extends GetObjectsParameters {
  
  var spaces: js.Array[Custom] = js.native
  
  var userId: String = js.native
}
object MembershipsInputParameters {
  
  @scala.inline
  def apply(spaces: js.Array[Custom], userId: String): MembershipsInputParameters = {
    val __obj = js.Dynamic.literal(spaces = spaces.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MembershipsInputParameters]
  }
  
  @scala.inline
  implicit class MembershipsInputParametersOps[Self <: MembershipsInputParameters] (val x: Self) extends AnyVal {
    
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
    def setSpacesVarargs(value: Custom*): Self = this.set("spaces", js.Array(value :_*))
    
    @scala.inline
    def setSpaces(value: js.Array[Custom]): Self = this.set("spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
}
