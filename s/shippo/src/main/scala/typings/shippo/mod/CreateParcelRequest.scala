package typings.shippo.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateParcelRequest extends StObject {
  
  var distance_unit: DistanceUnit
  
  var extra: js.UndefOr[Record[String, Any]] = js.undefined
  
  var height: /* template literal string: ${number} */ String
  
  var length: /* template literal string: ${number} */ String
  
  var mass_unit: MassUnit
  
  var metadata: js.UndefOr[String] = js.undefined
  
  var template: js.UndefOr[String] = js.undefined
  
  var weight: /* template literal string: ${number} */ String
  
  var width: /* template literal string: ${number} */ String
}
object CreateParcelRequest {
  
  inline def apply(
    distance_unit: DistanceUnit,
    height: /* template literal string: ${number} */ String,
    length: /* template literal string: ${number} */ String,
    mass_unit: MassUnit,
    weight: /* template literal string: ${number} */ String,
    width: /* template literal string: ${number} */ String
  ): CreateParcelRequest = {
    val __obj = js.Dynamic.literal(distance_unit = distance_unit.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], mass_unit = mass_unit.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateParcelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateParcelRequest] (val x: Self) extends AnyVal {
    
    inline def setDistance_unit(value: DistanceUnit): Self = StObject.set(x, "distance_unit", value.asInstanceOf[js.Any])
    
    inline def setExtra(value: Record[String, Any]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setHeight(value: /* template literal string: ${number} */ String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLength(value: /* template literal string: ${number} */ String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMass_unit(value: MassUnit): Self = StObject.set(x, "mass_unit", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setWeight(value: /* template literal string: ${number} */ String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: /* template literal string: ${number} */ String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
