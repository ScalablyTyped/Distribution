package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod.SignerKeyOptions
import typings.stellarBase.mod._OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeSignerSponsorship
  extends BaseOptions
     with _OperationOptions {
  
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
  implicit class RevokeSignerSponsorshipMutableBuilder[Self <: RevokeSignerSponsorship] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigner(value: SignerKeyOptions): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
  }
}
