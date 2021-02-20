package typings.stellarBase.mod.OperationOptions

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod._OperationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePassiveSellOffer
  extends BaseOptions
     with _OperationOptions {
  
  var amount: String = js.native
  
  var buying: Asset = js.native
  
  var price: Double | String | js.Object = js.native
  
  var selling: Asset = js.native
}
object CreatePassiveSellOffer {
  
  @scala.inline
  def apply(amount: String, buying: Asset, price: Double | String | js.Object, selling: Asset): CreatePassiveSellOffer = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePassiveSellOffer]
  }
  
  @scala.inline
  implicit class CreatePassiveSellOfferMutableBuilder[Self <: CreatePassiveSellOffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuying(value: Asset): Self = StObject.set(x, "buying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: Double | String | js.Object): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelling(value: Asset): Self = StObject.set(x, "selling", value.asInstanceOf[js.Any])
  }
}
