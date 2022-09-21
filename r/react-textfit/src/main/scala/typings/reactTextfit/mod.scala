package typings.reactTextfit

import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.reactTextfit.reactTextfitStrings.multi
import typings.reactTextfit.reactTextfitStrings.single
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-textfit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Textfit(props: TextfitProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Textfit")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait TextfitProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var forceSingleModeWidth: js.UndefOr[Boolean] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[single | multi] = js.undefined
    
    var onReady: js.UndefOr[js.Function1[/* fontSize */ Double, Unit]] = js.undefined
    
    var throttle: js.UndefOr[Double] = js.undefined
  }
  object TextfitProps {
    
    inline def apply(): TextfitProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextfitProps]
    }
    
    extension [Self <: TextfitProps](x: Self) {
      
      inline def setForceSingleModeWidth(value: Boolean): Self = StObject.set(x, "forceSingleModeWidth", value.asInstanceOf[js.Any])
      
      inline def setForceSingleModeWidthUndefined: Self = StObject.set(x, "forceSingleModeWidth", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMode(value: single | multi): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnReady(value: /* fontSize */ Double => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction1(value))
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
    }
  }
}
