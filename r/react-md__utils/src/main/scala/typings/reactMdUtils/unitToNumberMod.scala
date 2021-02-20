package typings.reactMdUtils

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unitToNumberMod {
  
  @JSImport("@react-md/utils/types/unitToNumber", "unitToNumber")
  @js.native
  def unitToNumber(unit: String): Double = js.native
  @JSImport("@react-md/utils/types/unitToNumber", "unitToNumber")
  @js.native
  def unitToNumber(unit: String, options: UnitToNumberOptions): Double = js.native
  @JSImport("@react-md/utils/types/unitToNumber", "unitToNumber")
  @js.native
  def unitToNumber(unit: Double): Double = js.native
  @JSImport("@react-md/utils/types/unitToNumber", "unitToNumber")
  @js.native
  def unitToNumber(unit: Double, options: UnitToNumberOptions): Double = js.native
  
  @js.native
  trait UnitToNumberOptions extends StObject {
    
    var element: js.UndefOr[Element] = js.native
    
    var fontSizeFallback: js.UndefOr[Double] = js.native
  }
  object UnitToNumberOptions {
    
    @scala.inline
    def apply(): UnitToNumberOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnitToNumberOptions]
    }
    
    @scala.inline
    implicit class UnitToNumberOptionsMutableBuilder[Self <: UnitToNumberOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setFontSizeFallback(value: Double): Self = StObject.set(x, "fontSizeFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeFallbackUndefined: Self = StObject.set(x, "fontSizeFallback", js.undefined)
    }
  }
}
