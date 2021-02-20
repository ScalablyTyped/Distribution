package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Int64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Price extends StObject {
  
  var amount: Int64 = js.native
  
  var buying: typings.stellarBase.xdrMod.xdr.Asset = js.native
  
  var price: typings.stellarBase.xdrMod.xdr.Price = js.native
  
  var selling: typings.stellarBase.xdrMod.xdr.Asset = js.native
}
object Price {
  
  @scala.inline
  def apply(
    amount: Int64,
    buying: typings.stellarBase.xdrMod.xdr.Asset,
    price: typings.stellarBase.xdrMod.xdr.Price,
    selling: typings.stellarBase.xdrMod.xdr.Asset
  ): Price = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], buying = buying.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], selling = selling.asInstanceOf[js.Any])
    __obj.asInstanceOf[Price]
  }
  
  @scala.inline
  implicit class PriceMutableBuilder[Self <: Price] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Int64): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuying(value: typings.stellarBase.xdrMod.xdr.Asset): Self = StObject.set(x, "buying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: typings.stellarBase.xdrMod.xdr.Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelling(value: typings.stellarBase.xdrMod.xdr.Asset): Self = StObject.set(x, "selling", value.asInstanceOf[js.Any])
  }
}
