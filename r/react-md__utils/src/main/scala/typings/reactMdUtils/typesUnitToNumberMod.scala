package typings.reactMdUtils

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUnitToNumberMod {
  
  @JSImport("@react-md/utils/types/unitToNumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def unitToNumber(unit: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unitToNumber")(unit.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def unitToNumber(unit: String, options: UnitToNumberOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unitToNumber")(unit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def unitToNumber(unit: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unitToNumber")(unit.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def unitToNumber(unit: Double, options: UnitToNumberOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unitToNumber")(unit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait UnitToNumberOptions extends StObject {
    
    var element: js.UndefOr[Element] = js.undefined
    
    var fontSizeFallback: js.UndefOr[Double] = js.undefined
  }
  object UnitToNumberOptions {
    
    inline def apply(): UnitToNumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnitToNumberOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnitToNumberOptions] (val x: Self) extends AnyVal {
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setFontSizeFallback(value: Double): Self = StObject.set(x, "fontSizeFallback", value.asInstanceOf[js.Any])
      
      inline def setFontSizeFallbackUndefined: Self = StObject.set(x, "fontSizeFallback", js.undefined)
    }
  }
}
