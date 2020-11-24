package typings.restIo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ADMIN extends js.Object {
  
  var ADMIN: String = js.native
  
  var MODERATOR: String = js.native
  
  var SUPER_USER: String = js.native
  
  var USER: String = js.native
}
object ADMIN {
  
  @scala.inline
  def apply(ADMIN: String, MODERATOR: String, SUPER_USER: String, USER: String): ADMIN = {
    val __obj = js.Dynamic.literal(ADMIN = ADMIN.asInstanceOf[js.Any], MODERATOR = MODERATOR.asInstanceOf[js.Any], SUPER_USER = SUPER_USER.asInstanceOf[js.Any], USER = USER.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADMIN]
  }
  
  @scala.inline
  implicit class ADMINOps[Self <: ADMIN] (val x: Self) extends AnyVal {
    
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
    def setADMIN(value: String): Self = this.set("ADMIN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMODERATOR(value: String): Self = this.set("MODERATOR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSUPER_USER(value: String): Self = this.set("SUPER_USER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSER(value: String): Self = this.set("USER", value.asInstanceOf[js.Any])
  }
}
