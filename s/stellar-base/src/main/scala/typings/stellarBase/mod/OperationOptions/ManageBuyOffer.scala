package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod._OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManageBuyOffer
  extends BaseOptions
     with _OperationOptions {
  
  var buyAmount: String = js.native
  
  var buying: Asset = js.native
  
  var offerId: js.UndefOr[Double | String] = js.native
  
  var price: Double | String | js.Object = js.native
  
  var selling: Asset = js.native
}
object ManageBuyOffer {
  
  @scala.inline
  def apply(buyAmount: String, buying: Asset, price: Double | String | js.Object, selling: Asset): ManageBuyOffer = {
    val __obj = js.Dynamic.literal(buyAmount = buyAmount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageBuyOffer]
  }
  
  @scala.inline
  implicit class ManageBuyOfferMutableBuilder[Self <: ManageBuyOffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuyAmount(value: String): Self = StObject.set(x, "buyAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuying(value: Asset): Self = StObject.set(x, "buying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferId(value: Double | String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferIdUndefined: Self = StObject.set(x, "offerId", js.undefined)
    
    @scala.inline
    def setPrice(value: Double | String | js.Object): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelling(value: Asset): Self = StObject.set(x, "selling", value.asInstanceOf[js.Any])
  }
}
