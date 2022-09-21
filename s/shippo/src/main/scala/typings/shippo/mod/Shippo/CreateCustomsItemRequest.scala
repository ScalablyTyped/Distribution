package typings.shippo.mod.Shippo

import typings.shippo.shippoStrings.g
import typings.shippo.shippoStrings.kg_
import typings.shippo.shippoStrings.lb_
import typings.shippo.shippoStrings.oz
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomsItemRequest extends StObject {
  
  var description: String
  
  var mass_unit: g | oz | lb_ | kg_ | String
  
  var net_weight: Double
  
  var origin_country: Country
  
  var quantity: Double
  
  var value_amount: Double
  
  var value_currency: String
}
object CreateCustomsItemRequest {
  
  inline def apply(
    description: String,
    mass_unit: g | oz | lb_ | kg_ | String,
    net_weight: Double,
    origin_country: Country,
    quantity: Double,
    value_amount: Double,
    value_currency: String
  ): CreateCustomsItemRequest = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], mass_unit = mass_unit.asInstanceOf[js.Any], net_weight = net_weight.asInstanceOf[js.Any], origin_country = origin_country.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], value_amount = value_amount.asInstanceOf[js.Any], value_currency = value_currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomsItemRequest]
  }
  
  extension [Self <: CreateCustomsItemRequest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setMass_unit(value: g | oz | lb_ | kg_ | String): Self = StObject.set(x, "mass_unit", value.asInstanceOf[js.Any])
    
    inline def setNet_weight(value: Double): Self = StObject.set(x, "net_weight", value.asInstanceOf[js.Any])
    
    inline def setOrigin_country(value: Country): Self = StObject.set(x, "origin_country", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setValue_amount(value: Double): Self = StObject.set(x, "value_amount", value.asInstanceOf[js.Any])
    
    inline def setValue_currency(value: String): Self = StObject.set(x, "value_currency", value.asInstanceOf[js.Any])
  }
}
