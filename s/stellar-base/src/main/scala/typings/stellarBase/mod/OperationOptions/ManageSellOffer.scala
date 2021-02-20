package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod.Asset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.stellarBase.mod._OperationOptions because Already inherited */ @js.native
trait ManageSellOffer extends CreatePassiveSellOffer {
  
  var offerId: js.UndefOr[Double | String] = js.native
}
object ManageSellOffer {
  
  @scala.inline
  def apply(amount: String, buying: Asset, price: Double | String | js.Object, selling: Asset): ManageSellOffer = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageSellOffer]
  }
  
  @scala.inline
  implicit class ManageSellOfferMutableBuilder[Self <: ManageSellOffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOfferId(value: Double | String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferIdUndefined: Self = StObject.set(x, "offerId", js.undefined)
  }
}
