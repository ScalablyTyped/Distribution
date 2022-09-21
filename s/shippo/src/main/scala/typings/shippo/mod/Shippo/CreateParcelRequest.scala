package typings.shippo.mod.Shippo

import typings.shippo.shippoStrings.$LeftcurlybracketnumberRightcurlybracket
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateParcelRequest extends StObject {
  
  var distance_unit: DistanceUnit
  
  var extra: js.UndefOr[Record[String, Any]] = js.undefined
  
  var height: $LeftcurlybracketnumberRightcurlybracket
  
  var length: $LeftcurlybracketnumberRightcurlybracket
  
  var mass_unit: MassUnit
  
  var metadata: js.UndefOr[String] = js.undefined
  
  var template: js.UndefOr[String] = js.undefined
  
  var weight: $LeftcurlybracketnumberRightcurlybracket
  
  var width: $LeftcurlybracketnumberRightcurlybracket
}
object CreateParcelRequest {
  
  inline def apply(distance_unit: DistanceUnit, mass_unit: MassUnit): CreateParcelRequest = {
    val __obj = js.Dynamic.literal(distance_unit = distance_unit.asInstanceOf[js.Any], height = "${number}", length = "${number}", mass_unit = mass_unit.asInstanceOf[js.Any], weight = "${number}", width = "${number}")
    __obj.asInstanceOf[CreateParcelRequest]
  }
  
  extension [Self <: CreateParcelRequest](x: Self) {
    
    inline def setDistance_unit(value: DistanceUnit): Self = StObject.set(x, "distance_unit", value.asInstanceOf[js.Any])
    
    inline def setExtra(value: Record[String, Any]): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setHeight(value: $LeftcurlybracketnumberRightcurlybracket): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLength(value: $LeftcurlybracketnumberRightcurlybracket): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMass_unit(value: MassUnit): Self = StObject.set(x, "mass_unit", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setWeight(value: $LeftcurlybracketnumberRightcurlybracket): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: $LeftcurlybracketnumberRightcurlybracket): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
