package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType.RevokeSponsorship
import typings.stellarBase.mod.SignerKeyOptions
import typings.stellarBase.mod._Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeSignerSponsorship_
  extends BaseOperation[RevokeSponsorship]
     with _Operation {
  
  var account: String = js.native
  
  var signer: SignerKeyOptions = js.native
}
object RevokeSignerSponsorship_ {
  
  @scala.inline
  def apply(account: String, signer: SignerKeyOptions, `type`: RevokeSponsorship): RevokeSignerSponsorship_ = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], signer = signer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeSignerSponsorship_]
  }
  
  @scala.inline
  implicit class RevokeSignerSponsorship_MutableBuilder[Self <: RevokeSignerSponsorship_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigner(value: SignerKeyOptions): Self = StObject.set(x, "signer", value.asInstanceOf[js.Any])
  }
}
