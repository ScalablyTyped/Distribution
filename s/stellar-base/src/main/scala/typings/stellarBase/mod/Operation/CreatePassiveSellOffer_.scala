package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.Asset
import typings.stellarBase.mod.OperationType.CreatePassiveSellOffer
import typings.stellarBase.mod._Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePassiveSellOffer_
  extends BaseOperation[CreatePassiveSellOffer]
     with _Operation {
  
  var amount: String = js.native
  
  var buying: Asset = js.native
  
  var price: String = js.native
  
  var selling: Asset = js.native
}
object CreatePassiveSellOffer_ {
  
  @scala.inline
  def apply(amount: String, buying: Asset, price: String, selling: Asset, `type`: CreatePassiveSellOffer): CreatePassiveSellOffer_ = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePassiveSellOffer_]
  }
  
  @scala.inline
  implicit class CreatePassiveSellOffer_MutableBuilder[Self <: CreatePassiveSellOffer_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuying(value: Asset): Self = StObject.set(x, "buying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelling(value: Asset): Self = StObject.set(x, "selling", value.asInstanceOf[js.Any])
  }
}
