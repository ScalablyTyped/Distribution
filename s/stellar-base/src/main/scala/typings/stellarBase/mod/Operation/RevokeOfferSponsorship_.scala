package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType.RevokeSponsorship
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeOfferSponsorship_ extends BaseOperation[RevokeSponsorship] {
  
  var offerId: String = js.native
  
  var seller: String = js.native
}
object RevokeOfferSponsorship_ {
  
  @scala.inline
  def apply(offerId: String, seller: String, `type`: RevokeSponsorship): RevokeOfferSponsorship_ = {
    val __obj = js.Dynamic.literal(offerId = offerId.asInstanceOf[js.Any], seller = seller.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeOfferSponsorship_]
  }
  
  @scala.inline
  implicit class RevokeOfferSponsorship_Ops[Self <: RevokeOfferSponsorship_] (val x: Self) extends AnyVal {
    
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
    def setOfferId(value: String): Self = this.set("offerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeller(value: String): Self = this.set("seller", value.asInstanceOf[js.Any])
  }
}
