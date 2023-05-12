package typings.shippo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomsItem
  extends StObject
     with Metadata {
  
  var description: String
  
  var eccn_ear99: js.UndefOr[String] = js.undefined
  
  var mass_unit: MassUnit
  
  var metadata: js.UndefOr[String] = js.undefined
  
  var net_weight: /* template literal string: ${number} */ String
  
  var object_state: ObjectState
  
  var origin_country: Country
  
  var quantity: Double
  
  var sku_code: js.UndefOr[String] = js.undefined
  
  var tariff_number: js.UndefOr[String] = js.undefined
  
  var test: js.UndefOr[Boolean] = js.undefined
  
  var value_amount: /* template literal string: ${number} */ String
  
  var value_currency: String
}
object CustomsItem {
  
  inline def apply(
    description: String,
    mass_unit: MassUnit,
    net_weight: /* template literal string: ${number} */ String,
    object_created: String,
    object_id: String,
    object_owner: String,
    object_state: ObjectState,
    object_updated: String,
    origin_country: Country,
    quantity: Double,
    value_amount: /* template literal string: ${number} */ String,
    value_currency: String
  ): CustomsItem = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], mass_unit = mass_unit.asInstanceOf[js.Any], net_weight = net_weight.asInstanceOf[js.Any], object_created = object_created.asInstanceOf[js.Any], object_id = object_id.asInstanceOf[js.Any], object_owner = object_owner.asInstanceOf[js.Any], object_state = object_state.asInstanceOf[js.Any], object_updated = object_updated.asInstanceOf[js.Any], origin_country = origin_country.asInstanceOf[js.Any], quantity = quantity.asInstanceOf[js.Any], value_amount = value_amount.asInstanceOf[js.Any], value_currency = value_currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomsItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomsItem] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEccn_ear99(value: String): Self = StObject.set(x, "eccn_ear99", value.asInstanceOf[js.Any])
    
    inline def setEccn_ear99Undefined: Self = StObject.set(x, "eccn_ear99", js.undefined)
    
    inline def setMass_unit(value: MassUnit): Self = StObject.set(x, "mass_unit", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNet_weight(value: /* template literal string: ${number} */ String): Self = StObject.set(x, "net_weight", value.asInstanceOf[js.Any])
    
    inline def setObject_state(value: ObjectState): Self = StObject.set(x, "object_state", value.asInstanceOf[js.Any])
    
    inline def setOrigin_country(value: Country): Self = StObject.set(x, "origin_country", value.asInstanceOf[js.Any])
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setSku_code(value: String): Self = StObject.set(x, "sku_code", value.asInstanceOf[js.Any])
    
    inline def setSku_codeUndefined: Self = StObject.set(x, "sku_code", js.undefined)
    
    inline def setTariff_number(value: String): Self = StObject.set(x, "tariff_number", value.asInstanceOf[js.Any])
    
    inline def setTariff_numberUndefined: Self = StObject.set(x, "tariff_number", js.undefined)
    
    inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    inline def setValue_amount(value: /* template literal string: ${number} */ String): Self = StObject.set(x, "value_amount", value.asInstanceOf[js.Any])
    
    inline def setValue_currency(value: String): Self = StObject.set(x, "value_currency", value.asInstanceOf[js.Any])
  }
}
