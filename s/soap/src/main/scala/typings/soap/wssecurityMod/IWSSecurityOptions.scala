package typings.soap.wssecurityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWSSecurityOptions extends js.Object {
  
  var actor: js.UndefOr[String] = js.native
  
  var hasNonce: js.UndefOr[Boolean] = js.native
  
  var hasTimeStamp: js.UndefOr[Boolean] = js.native
  
  var hasTokenCreated: js.UndefOr[Boolean] = js.native
  
  var mustUnderstand: js.UndefOr[js.Any] = js.native
  
  var passwordType: js.UndefOr[String] = js.native
}
object IWSSecurityOptions {
  
  @scala.inline
  def apply(): IWSSecurityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWSSecurityOptions]
  }
  
  @scala.inline
  implicit class IWSSecurityOptionsOps[Self <: IWSSecurityOptions] (val x: Self) extends AnyVal {
    
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
    def setActor(value: String): Self = this.set("actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActor: Self = this.set("actor", js.undefined)
    
    @scala.inline
    def setHasNonce(value: Boolean): Self = this.set("hasNonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasNonce: Self = this.set("hasNonce", js.undefined)
    
    @scala.inline
    def setHasTimeStamp(value: Boolean): Self = this.set("hasTimeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasTimeStamp: Self = this.set("hasTimeStamp", js.undefined)
    
    @scala.inline
    def setHasTokenCreated(value: Boolean): Self = this.set("hasTokenCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasTokenCreated: Self = this.set("hasTokenCreated", js.undefined)
    
    @scala.inline
    def setMustUnderstand(value: js.Any): Self = this.set("mustUnderstand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMustUnderstand: Self = this.set("mustUnderstand", js.undefined)
    
    @scala.inline
    def setPasswordType(value: String): Self = this.set("passwordType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordType: Self = this.set("passwordType", js.undefined)
  }
}
