package typings.reactNativePercentageCircle

import typings.react.mod.Component
import typings.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-percentage-circle", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PercentageCircleProps, js.Object, Any]
  
  type PercentageCircle = Component[PercentageCircleProps, js.Object, Any]
  
  trait PercentageCircleProps extends StObject {
    
    var bgcolor: js.UndefOr[String] = js.undefined
    
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var innerColor: js.UndefOr[String] = js.undefined
    
    var percent: js.UndefOr[Double] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var textStyle: js.UndefOr[js.Array[TextStyle]] = js.undefined
  }
  object PercentageCircleProps {
    
    inline def apply(): PercentageCircleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PercentageCircleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PercentageCircleProps] (val x: Self) extends AnyVal {
      
      inline def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
      
      inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setInnerColor(value: String): Self = StObject.set(x, "innerColor", value.asInstanceOf[js.Any])
      
      inline def setInnerColorUndefined: Self = StObject.set(x, "innerColor", js.undefined)
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setTextStyle(value: js.Array[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setTextStyleVarargs(value: TextStyle*): Self = StObject.set(x, "textStyle", js.Array(value*))
    }
  }
}
