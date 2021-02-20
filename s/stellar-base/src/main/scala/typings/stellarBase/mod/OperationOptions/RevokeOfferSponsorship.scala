package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod._OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeOfferSponsorship
  extends BaseOptions
     with _OperationOptions {
  
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
  implicit class RevokeOfferSponsorshipMutableBuilder[Self <: RevokeOfferSponsorship] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeller(value: String): Self = StObject.set(x, "seller", value.asInstanceOf[js.Any])
  }
}
