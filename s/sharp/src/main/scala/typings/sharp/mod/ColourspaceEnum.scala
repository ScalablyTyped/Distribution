package typings.sharp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColourspaceEnum extends StObject {
  
  var `b-w`: String
  
  var bw: String
  
  var cmyk: String
  
  var multiband: String
  
  var srgb: String
}
object ColourspaceEnum {
  
  inline def apply(`b-w`: String, bw: String, cmyk: String, multiband: String, srgb: String): ColourspaceEnum = {
    val __obj = js.Dynamic.literal(bw = bw.asInstanceOf[js.Any], cmyk = cmyk.asInstanceOf[js.Any], multiband = multiband.asInstanceOf[js.Any], srgb = srgb.asInstanceOf[js.Any])
    __obj.updateDynamic("b-w")(`b-w`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColourspaceEnum]
  }
  
  extension [Self <: ColourspaceEnum](x: Self) {
    
    inline def `setB-w`(value: String): Self = StObject.set(x, "b-w", value.asInstanceOf[js.Any])
    
    inline def setBw(value: String): Self = StObject.set(x, "bw", value.asInstanceOf[js.Any])
    
    inline def setCmyk(value: String): Self = StObject.set(x, "cmyk", value.asInstanceOf[js.Any])
    
    inline def setMultiband(value: String): Self = StObject.set(x, "multiband", value.asInstanceOf[js.Any])
    
    inline def setSrgb(value: String): Self = StObject.set(x, "srgb", value.asInstanceOf[js.Any])
  }
}
