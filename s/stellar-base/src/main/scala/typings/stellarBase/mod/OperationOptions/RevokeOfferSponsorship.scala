package typings.stellarBase.mod.OperationOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeOfferSponsorship extends BaseOptions {
  
  var offerId: String = js.native
  
  var seller: String = js.native
}
object RevokeOfferSponsorship {
  
  @scala.inline
  def apply(offerId: String, seller: String): RevokeOfferSponsorship = {
    val __obj = js.Dynamic.literal(offerId = offerId.asInstanceOf[js.Any], seller = seller.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeOfferSponsorship]
  }
  
  @scala.inline
  implicit class RevokeOfferSponsorshipOps[Self <: RevokeOfferSponsorship] (val x: Self) extends AnyVal {
    
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
