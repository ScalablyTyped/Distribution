package typings.reactRangeslider

import org.scalablytyped.runtime.NumberDictionary
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-rangeslider", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SliderProps, js.Object, Any]
  
  type Slider = Component[SliderProps, js.Object, Any]
  
  trait SliderProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[js.Function1[/* value */ Double, js.UndefOr[String | Double]]] = js.undefined
    
    var handleLabel: js.UndefOr[String] = js.undefined
    
    var labels: js.UndefOr[NumberDictionary[String]] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    var onChangeComplete: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    var onChangeStart: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
    
    var orientation: js.UndefOr[String] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var tooltip: js.UndefOr[Boolean] = js.undefined
    
    var value: Double
  }
  object SliderProps {
    
    inline def apply(value: Double): SliderProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderProps]
    }
    
    extension [Self <: SliderProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFormat(value: /* value */ Double => js.UndefOr[String | Double]): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHandleLabel(value: String): Self = StObject.set(x, "handleLabel", value.asInstanceOf[js.Any])
      
      inline def setHandleLabelUndefined: Self = StObject.set(x, "handleLabel", js.undefined)
      
      inline def setLabels(value: NumberDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeComplete(value: /* value */ Double => Unit): Self = StObject.set(x, "onChangeComplete", js.Any.fromFunction1(value))
      
      inline def setOnChangeCompleteUndefined: Self = StObject.set(x, "onChangeComplete", js.undefined)
      
      inline def setOnChangeStart(value: /* value */ Double => Unit): Self = StObject.set(x, "onChangeStart", js.Any.fromFunction1(value))
      
      inline def setOnChangeStartUndefined: Self = StObject.set(x, "onChangeStart", js.undefined)
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setTooltip(value: Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
