package typings.stellarBase.mod.OperationOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeClaimableBalanceSponsorship extends BaseOptions {
  
  var balanceId: String = js.native
}
object RevokeClaimableBalanceSponsorship {
  
  @scala.inline
  def apply(balanceId: String): RevokeClaimableBalanceSponsorship = {
    val __obj = js.Dynamic.literal(balanceId = balanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeClaimableBalanceSponsorship]
  }
  
  @scala.inline
  implicit class RevokeClaimableBalanceSponsorshipOps[Self <: RevokeClaimableBalanceSponsorship] (val x: Self) extends AnyVal {
    
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
