package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod.OperationType.ManageBuyOffer
import typings.stellarBase.mod._Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManageBuyOffer_
  extends BaseOperation[ManageBuyOffer]
     with _Operation {
  
  var buyAmount: String = js.native
  
  var buying: Asset = js.native
  
  var offerId: String = js.native
  
  var price: String = js.native
  
  var selling: Asset = js.native
}
object ManageBuyOffer_ {
  
  @scala.inline
  def apply(
    buyAmount: String,
    buying: Asset,
    offerId: String,
    price: String,
    selling: Asset,
    `type`: ManageBuyOffer
  ): ManageBuyOffer_ = {
    val __obj = js.Dynamic.literal(buyAmount = buyAmount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], offerId = offerId.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageBuyOffer_]
  }
  
  @scala.inline
  implicit class ManageBuyOffer_MutableBuilder[Self <: ManageBuyOffer_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuyAmount(value: String): Self = StObject.set(x, "buyAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuying(value: Asset): Self = StObject.set(x, "buying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelling(value: Asset): Self = StObject.set(x, "selling", value.asInstanceOf[js.Any])
  }
}
