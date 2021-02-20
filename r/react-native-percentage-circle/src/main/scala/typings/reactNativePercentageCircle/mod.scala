package typings.reactNativePercentageCircle

import typings.react.mod.Component
import typings.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-percentage-circle", JSImport.Default)
  @js.native
  class default ()
    extends Component[PercentageCircleProps, js.Object, js.Any]
  
  type PercentageCircle = Component[PercentageCircleProps, js.Object, js.Any]
  
  @js.native
  trait PercentageCircleProps extends StObject {
    
    var bgcolor: js.UndefOr[String] = js.native
    
    var borderWidth: js.UndefOr[Double] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var innerColor: js.UndefOr[String] = js.native
    
    var percent: js.UndefOr[Double] = js.native
    
    var radius: js.UndefOr[Double] = js.native
    
    var textStyle: js.UndefOr[js.Array[TextStyle]] = js.native
  }
  object PercentageCircleProps {
    
    @scala.inline
    def apply(): PercentageCircleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PercentageCircleProps]
    }
    
    @scala.inline
    implicit class PercentageCirclePropsMutableBuilder[Self <: PercentageCircleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
      
      @scala.inline
      def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setInnerColor(value: String): Self = StObject.set(x, "innerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerColorUndefined: Self = StObject.set(x, "innerColor", js.undefined)
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setTextStyle(value: js.Array[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      @scala.inline
      def setTextStyleVarargs(value: TextStyle*): Self = StObject.set(x, "textStyle", js.Array(value :_*))
    }
  }
}
