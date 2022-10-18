package typings.reactSpinners

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsHelpersUnitConverterMod {
  
  @JSImport("react-spinners/cjs/helpers/unitConverter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cssValue(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cssValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cssValue(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cssValue")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseLengthAndUnit(size: String): LengthObject = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLengthAndUnit")(size.asInstanceOf[js.Any]).asInstanceOf[LengthObject]
  inline def parseLengthAndUnit(size: Double): LengthObject = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLengthAndUnit")(size.asInstanceOf[js.Any]).asInstanceOf[LengthObject]
  
  trait LengthObject extends StObject {
    
    var unit: String
    
    var value: Double
  }
  object LengthObject {
    
    inline def apply(unit: String, value: Double): LengthObject = {
      val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LengthObject]
    }
    
    extension [Self <: LengthObject](x: Self) {
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
