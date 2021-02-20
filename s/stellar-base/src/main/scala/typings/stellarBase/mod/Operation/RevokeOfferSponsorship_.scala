package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType.RevokeSponsorship
import typings.stellarBase.mod._Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeOfferSponsorship_
  extends BaseOperation[RevokeSponsorship]
     with _Operation {
  
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
  implicit class RevokeOfferSponsorship_MutableBuilder[Self <: RevokeOfferSponsorship_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeller(value: String): Self = StObject.set(x, "seller", value.asInstanceOf[js.Any])
  }
}
