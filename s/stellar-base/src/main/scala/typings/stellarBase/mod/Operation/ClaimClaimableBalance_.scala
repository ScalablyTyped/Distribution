package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType.ClaimClaimableBalance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimClaimableBalance_ extends BaseOperation[ClaimClaimableBalance] {
  
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
  implicit class ClaimClaimableBalance_Ops[Self <: ClaimClaimableBalance_] (val x: Self) extends AnyVal {
    
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
    def setBalanceId(value: String): Self = this.set("balanceId", value.asInstanceOf[js.Any])
  }
}
