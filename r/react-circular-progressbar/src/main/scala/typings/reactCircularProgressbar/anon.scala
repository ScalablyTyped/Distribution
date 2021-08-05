package typings.reactCircularProgressbar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Background extends StObject {
    
    var background: String
    
    var path: String
    
    var root: String
    
    var text: String
    
    var trail: String
  }
  object Background {
    
    inline def apply(background: String, path: String, root: String, text: String, trail: String): Background = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], trail = trail.asInstanceOf[js.Any])
      __obj.asInstanceOf[Background]
    }
    
    extension [Self <: Background](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTrail(value: String): Self = StObject.set(x, "trail", value.asInstanceOf[js.Any])
    }
  }
  
  trait BackgroundColor extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var pathColor: js.UndefOr[String] = js.undefined
    
    var pathTransition: js.UndefOr[String] = js.undefined
    
    var pathTransitionDuration: js.UndefOr[Double] = js.undefined
    
    var rotation: js.UndefOr[Double] = js.undefined
    
    var strokeLinecap: js.UndefOr[js.Any] = js.undefined
    
    var textColor: js.UndefOr[String] = js.undefined
    
    var textSize: js.UndefOr[String | Double] = js.undefined
    
    var trailColor: js.UndefOr[String] = js.undefined
  }
  object BackgroundColor {
    
    inline def apply(): BackgroundColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackgroundColor]
    }
    
    extension [Self <: BackgroundColor](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setPathColor(value: String): Self = StObject.set(x, "pathColor", value.asInstanceOf[js.Any])
      
      inline def setPathColorUndefined: Self = StObject.set(x, "pathColor", js.undefined)
      
      inline def setPathTransition(value: String): Self = StObject.set(x, "pathTransition", value.asInstanceOf[js.Any])
      
      inline def setPathTransitionDuration(value: Double): Self = StObject.set(x, "pathTransitionDuration", value.asInstanceOf[js.Any])
      
      inline def setPathTransitionDurationUndefined: Self = StObject.set(x, "pathTransitionDuration", js.undefined)
      
      inline def setPathTransitionUndefined: Self = StObject.set(x, "pathTransition", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setStrokeLinecap(value: js.Any): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      inline def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setTextSize(value: String | Double): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
      
      inline def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
      
      inline def setTrailColor(value: String): Self = StObject.set(x, "trailColor", value.asInstanceOf[js.Any])
      
      inline def setTrailColorUndefined: Self = StObject.set(x, "trailColor", js.undefined)
    }
  }
  
  trait ClassName extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var counterClockwise: Boolean
    
    var dashRatio: Double
    
    var pathRadius: Double
    
    var strokeWidth: Double
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object ClassName {
    
    inline def apply(counterClockwise: Boolean, dashRatio: Double, pathRadius: Double, strokeWidth: Double): ClassName = {
      val __obj = js.Dynamic.literal(counterClockwise = counterClockwise.asInstanceOf[js.Any], dashRatio = dashRatio.asInstanceOf[js.Any], pathRadius = pathRadius.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    extension [Self <: ClassName](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCounterClockwise(value: Boolean): Self = StObject.set(x, "counterClockwise", value.asInstanceOf[js.Any])
      
      inline def setDashRatio(value: Double): Self = StObject.set(x, "dashRatio", value.asInstanceOf[js.Any])
      
      inline def setPathRadius(value: Double): Self = StObject.set(x, "pathRadius", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
