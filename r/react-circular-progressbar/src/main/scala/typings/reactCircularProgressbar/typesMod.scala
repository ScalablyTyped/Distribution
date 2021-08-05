package typings.reactCircularProgressbar

import typings.react.mod.CSSProperties
import typings.reactCircularProgressbar.anon.Background
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait CircularProgressbarDefaultProps extends StObject {
    
    var background: Boolean
    
    var backgroundPadding: Double
    
    var circleRatio: Double
    
    var className: String
    
    var classes: Background
    
    var counterClockwise: Boolean
    
    var maxValue: Double
    
    var minValue: Double
    
    var strokeWidth: Double
    
    var styles: CircularProgressbarStyles
    
    var text: String
  }
  object CircularProgressbarDefaultProps {
    
    inline def apply(
      background: Boolean,
      backgroundPadding: Double,
      circleRatio: Double,
      className: String,
      classes: Background,
      counterClockwise: Boolean,
      maxValue: Double,
      minValue: Double,
      strokeWidth: Double,
      styles: CircularProgressbarStyles,
      text: String
    ): CircularProgressbarDefaultProps = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], backgroundPadding = backgroundPadding.asInstanceOf[js.Any], circleRatio = circleRatio.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], counterClockwise = counterClockwise.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircularProgressbarDefaultProps]
    }
    
    extension [Self <: CircularProgressbarDefaultProps](x: Self) {
      
      inline def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPadding(value: Double): Self = StObject.set(x, "backgroundPadding", value.asInstanceOf[js.Any])
      
      inline def setCircleRatio(value: Double): Self = StObject.set(x, "circleRatio", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClasses(value: Background): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setCounterClockwise(value: Boolean): Self = StObject.set(x, "counterClockwise", value.asInstanceOf[js.Any])
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStyles(value: CircularProgressbarStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait CircularProgressbarProps
    extends StObject
       with CircularProgressbarDefaultProps {
    
    var value: Double
  }
  object CircularProgressbarProps {
    
    inline def apply(
      background: Boolean,
      backgroundPadding: Double,
      circleRatio: Double,
      className: String,
      classes: Background,
      counterClockwise: Boolean,
      maxValue: Double,
      minValue: Double,
      strokeWidth: Double,
      styles: CircularProgressbarStyles,
      text: String,
      value: Double
    ): CircularProgressbarProps = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], backgroundPadding = backgroundPadding.asInstanceOf[js.Any], circleRatio = circleRatio.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], counterClockwise = counterClockwise.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircularProgressbarProps]
    }
    
    extension [Self <: CircularProgressbarProps](x: Self) {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait CircularProgressbarStyles extends StObject {
    
    var background: js.UndefOr[CSSProperties] = js.undefined
    
    var path: js.UndefOr[CSSProperties] = js.undefined
    
    var root: js.UndefOr[CSSProperties] = js.undefined
    
    var text: js.UndefOr[CSSProperties] = js.undefined
    
    var trail: js.UndefOr[CSSProperties] = js.undefined
  }
  object CircularProgressbarStyles {
    
    inline def apply(): CircularProgressbarStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircularProgressbarStyles]
    }
    
    extension [Self <: CircularProgressbarStyles](x: Self) {
      
      inline def setBackground(value: CSSProperties): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setPath(value: CSSProperties): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setRoot(value: CSSProperties): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setText(value: CSSProperties): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTrail(value: CSSProperties): Self = StObject.set(x, "trail", value.asInstanceOf[js.Any])
      
      inline def setTrailUndefined: Self = StObject.set(x, "trail", js.undefined)
    }
  }
  
  trait CircularProgressbarWrapperProps extends StObject {
    
    var background: js.UndefOr[Boolean] = js.undefined
    
    var backgroundPadding: js.UndefOr[Double] = js.undefined
    
    var circleRatio: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var classes: js.UndefOr[Background] = js.undefined
    
    var counterClockwise: js.UndefOr[Boolean] = js.undefined
    
    var maxValue: js.UndefOr[Double] = js.undefined
    
    var minValue: js.UndefOr[Double] = js.undefined
    
    var strokeWidth: js.UndefOr[Double] = js.undefined
    
    var styles: js.UndefOr[CircularProgressbarStyles] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var value: Double
  }
  object CircularProgressbarWrapperProps {
    
    inline def apply(value: Double): CircularProgressbarWrapperProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircularProgressbarWrapperProps]
    }
    
    extension [Self <: CircularProgressbarWrapperProps](x: Self) {
      
      inline def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPadding(value: Double): Self = StObject.set(x, "backgroundPadding", value.asInstanceOf[js.Any])
      
      inline def setBackgroundPaddingUndefined: Self = StObject.set(x, "backgroundPadding", js.undefined)
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setCircleRatio(value: Double): Self = StObject.set(x, "circleRatio", value.asInstanceOf[js.Any])
      
      inline def setCircleRatioUndefined: Self = StObject.set(x, "circleRatio", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClasses(value: Background): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setCounterClockwise(value: Boolean): Self = StObject.set(x, "counterClockwise", value.asInstanceOf[js.Any])
      
      inline def setCounterClockwiseUndefined: Self = StObject.set(x, "counterClockwise", js.undefined)
      
      inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
      
      inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
      
      inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setStyles(value: CircularProgressbarStyles): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
