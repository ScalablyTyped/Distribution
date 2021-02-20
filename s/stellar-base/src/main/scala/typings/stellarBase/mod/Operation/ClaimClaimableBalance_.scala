package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType.ClaimClaimableBalance
import typings.stellarBase.mod._Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimClaimableBalance_
  extends BaseOperation[ClaimClaimableBalance]
     with _Operation {
  
  var balanceId: String = js.native
}
object ClaimClaimableBalance_ {
  
  @scala.inline
  def apply(balanceId: String, `type`: ClaimClaimableBalance): ClaimClaimableBalance_ = {
    val __obj = js.Dynamic.literal(balanceId = balanceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimClaimableBalance_]
  }
  
  @scala.inline
  implicit class ClaimClaimableBalance_MutableBuilder[Self <: ClaimClaimableBalance_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBalanceId(value: String): Self = StObject.set(x, "balanceId", value.asInstanceOf[js.Any])
  }
}
