package typings.rcSlider

import org.scalablytyped.runtime.Shortcut
import typings.rcSlider.interfaceMod.AriaValueFormat
import typings.rcSlider.interfaceMod.Direction
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod extends Shortcut {
  
  @JSImport("rc-slider/lib/context", JSImport.Default)
  @js.native
  val default: Context[SliderContextProps] = js.native
  
  trait SliderContextProps extends StObject {
    
    var ariaLabelForHandle: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var ariaLabelledByForHandle: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var ariaValueTextFormatterForHandle: js.UndefOr[AriaValueFormat | js.Array[AriaValueFormat]] = js.undefined
    
    var direction: Direction
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var included: js.UndefOr[Boolean] = js.undefined
    
    var includedEnd: Double
    
    var includedStart: Double
    
    var max: Double
    
    var min: Double
    
    var range: js.UndefOr[Boolean] = js.undefined
    
    var step: Double | Null
    
    var tabIndex: Double | js.Array[Double]
  }
  object SliderContextProps {
    
    inline def apply(
      direction: Direction,
      includedEnd: Double,
      includedStart: Double,
      max: Double,
      min: Double,
      tabIndex: Double | js.Array[Double]
    ): SliderContextProps = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], includedEnd = includedEnd.asInstanceOf[js.Any], includedStart = includedStart.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], step = null)
      __obj.asInstanceOf[SliderContextProps]
    }
    
    extension [Self <: SliderContextProps](x: Self) {
      
      inline def setAriaLabelForHandle(value: String | js.Array[String]): Self = StObject.set(x, "ariaLabelForHandle", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelForHandleUndefined: Self = StObject.set(x, "ariaLabelForHandle", js.undefined)
      
      inline def setAriaLabelForHandleVarargs(value: String*): Self = StObject.set(x, "ariaLabelForHandle", js.Array(value*))
      
      inline def setAriaLabelledByForHandle(value: String | js.Array[String]): Self = StObject.set(x, "ariaLabelledByForHandle", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByForHandleUndefined: Self = StObject.set(x, "ariaLabelledByForHandle", js.undefined)
      
      inline def setAriaLabelledByForHandleVarargs(value: String*): Self = StObject.set(x, "ariaLabelledByForHandle", js.Array(value*))
      
      inline def setAriaValueTextFormatterForHandle(value: AriaValueFormat | js.Array[AriaValueFormat]): Self = StObject.set(x, "ariaValueTextFormatterForHandle", value.asInstanceOf[js.Any])
      
      inline def setAriaValueTextFormatterForHandleFunction1(value: /* value */ Double => String): Self = StObject.set(x, "ariaValueTextFormatterForHandle", js.Any.fromFunction1(value))
      
      inline def setAriaValueTextFormatterForHandleUndefined: Self = StObject.set(x, "ariaValueTextFormatterForHandle", js.undefined)
      
      inline def setAriaValueTextFormatterForHandleVarargs(value: AriaValueFormat*): Self = StObject.set(x, "ariaValueTextFormatterForHandle", js.Array(value*))
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIncluded(value: Boolean): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
      
      inline def setIncludedEnd(value: Double): Self = StObject.set(x, "includedEnd", value.asInstanceOf[js.Any])
      
      inline def setIncludedStart(value: Double): Self = StObject.set(x, "includedStart", value.asInstanceOf[js.Any])
      
      inline def setIncludedUndefined: Self = StObject.set(x, "included", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepNull: Self = StObject.set(x, "step", null)
      
      inline def setTabIndex(value: Double | js.Array[Double]): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexVarargs(value: Double*): Self = StObject.set(x, "tabIndex", js.Array(value*))
    }
  }
  
  type _To = Context[SliderContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `contextMod.foo` */
  override def _to: Context[SliderContextProps] = default
}
