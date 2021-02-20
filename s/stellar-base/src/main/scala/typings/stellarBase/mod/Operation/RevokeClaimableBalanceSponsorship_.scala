package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType.RevokeSponsorship
import typings.stellarBase.mod._Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeClaimableBalanceSponsorship_
  extends BaseOperation[RevokeSponsorship]
     with _Operation {
  
  var balanceId: String = js.native
}
object RevokeClaimableBalanceSponsorship_ {
  
  @scala.inline
  def apply(balanceId: String, `type`: RevokeSponsorship): RevokeClaimableBalanceSponsorship_ = {
    val __obj = js.Dynamic.literal(balanceId = balanceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeClaimableBalanceSponsorship_]
  }
  
  @scala.inline
  implicit class RevokeClaimableBalanceSponsorship_MutableBuilder[Self <: RevokeClaimableBalanceSponsorship_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBalanceId(value: String): Self = StObject.set(x, "balanceId", value.asInstanceOf[js.Any])
  }
}
