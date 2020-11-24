package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUSER_FIND_RESULT extends js.Object {
  
  var users: js.Array[SFSUser] = js.native
}
object IUSER_FIND_RESULT {
  
  @scala.inline
  def apply(users: js.Array[SFSUser]): IUSER_FIND_RESULT = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUSER_FIND_RESULT]
  }
  
  @scala.inline
  implicit class IUSER_FIND_RESULTOps[Self <: IUSER_FIND_RESULT] (val x: Self) extends AnyVal {
    
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
    def setUsersVarargs(value: SFSUser*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[SFSUser]): Self = this.set("users", value.asInstanceOf[js.Any])
  }
}
