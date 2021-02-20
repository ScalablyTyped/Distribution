package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod._OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimClaimableBalance
  extends BaseOptions
     with _OperationOptions {
  
  var balanceId: String = js.native
}
object ClaimClaimableBalance {
  
  @scala.inline
  def apply(balanceId: String): ClaimClaimableBalance = {
    val __obj = js.Dynamic.literal(balanceId = balanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimClaimableBalance]
  }
  
  @scala.inline
  implicit class ClaimClaimableBalanceMutableBuilder[Self <: ClaimClaimableBalance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBalanceId(value: String): Self = StObject.set(x, "balanceId", value.asInstanceOf[js.Any])
  }
}
