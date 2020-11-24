package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod.SignerKeyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeSignerSponsorship extends BaseOptions {
  
  var account: String = js.native
  
  var signer: SignerKeyOptions = js.native
}
object RevokeSignerSponsorship {
  
  @scala.inline
  def apply(account: String, signer: SignerKeyOptions): RevokeSignerSponsorship = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], signer = signer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeSignerSponsorship]
  }
  
  @scala.inline
  implicit class RevokeSignerSponsorshipOps[Self <: RevokeSignerSponsorship] (val x: Self) extends AnyVal {
    
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
    def setAccount(value: String): Self = this.set("account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigner(value: SignerKeyOptions): Self = this.set("signer", value.asInstanceOf[js.Any])
  }
}
