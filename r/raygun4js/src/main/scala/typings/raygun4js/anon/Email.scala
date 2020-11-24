package typings.raygun4js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Email extends js.Object {
  
  var Email: js.UndefOr[String] = js.native
  
  var FirstName: js.UndefOr[String] = js.native
  
  var FullName: js.UndefOr[String] = js.native
  
  var Identifier: js.UndefOr[String] = js.native
  
  var IsAnonymous: js.UndefOr[Boolean] = js.native
  
  var UUID: js.UndefOr[js.Any] = js.native
}
object Email {
  
  @scala.inline
  def apply(): Email = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Email]
  }
  
  @scala.inline
  implicit class EmailOps[Self <: Email] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("Email", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("FirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstName: Self = this.set("FirstName", js.undefined)
    
    @scala.inline
    def setFullName(value: String): Self = this.set("FullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullName: Self = this.set("FullName", js.undefined)
    
    @scala.inline
    def setIdentifier(value: String): Self = this.set("Identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("Identifier", js.undefined)
    
    @scala.inline
    def setIsAnonymous(value: Boolean): Self = this.set("IsAnonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAnonymous: Self = this.set("IsAnonymous", js.undefined)
    
    @scala.inline
    def setUUID(value: js.Any): Self = this.set("UUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUUID: Self = this.set("UUID", js.undefined)
  }
}
