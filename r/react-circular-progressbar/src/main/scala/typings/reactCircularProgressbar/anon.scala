package typings.reactCircularProgressbar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Background extends StObject {
    
    var background: String = js.native
    
    var path: String = js.native
    
    var root: String = js.native
    
    var text: String = js.native
    
    var trail: String = js.native
  }
  object Background {
    
    @scala.inline
    def apply(background: String, path: String, root: String, text: String, trail: String): Background = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], trail = trail.asInstanceOf[js.Any])
      __obj.asInstanceOf[Background]
    }
    
    @scala.inline
    implicit class BackgroundMutableBuilder[Self <: Background] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrail(value: String): Self = StObject.set(x, "trail", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BackgroundColor extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.native
    
    var pathColor: js.UndefOr[String] = js.native
    
    var pathTransition: js.UndefOr[String] = js.native
    
    var pathTransitionDuration: js.UndefOr[Double] = js.native
    
    var rotation: js.UndefOr[Double] = js.native
    
    var strokeLinecap: js.UndefOr[js.Any] = js.native
    
    var textColor: js.UndefOr[String] = js.native
    
    var textSize: js.UndefOr[String | Double] = js.native
    
    var trailColor: js.UndefOr[String] = js.native
  }
  object BackgroundColor {
    
    @scala.inline
    def apply(): BackgroundColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackgroundColor]
    }
    
    @scala.inline
    implicit class BackgroundColorMutableBuilder[Self <: BackgroundColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setPathColor(value: String): Self = StObject.set(x, "pathColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathColorUndefined: Self = StObject.set(x, "pathColor", js.undefined)
      
      @scala.inline
      def setPathTransition(value: String): Self = StObject.set(x, "pathTransition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathTransitionDuration(value: Double): Self = StObject.set(x, "pathTransitionDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathTransitionDurationUndefined: Self = StObject.set(x, "pathTransitionDuration", js.undefined)
      
      @scala.inline
      def setPathTransitionUndefined: Self = StObject.set(x, "pathTransition", js.undefined)
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setStrokeLinecap(value: js.Any): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
      
      @scala.inline
      def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      @scala.inline
      def setTextSize(value: String | Double): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
      
      @scala.inline
      def setTrailColor(value: String): Self = StObject.set(x, "trailColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailColorUndefined: Self = StObject.set(x, "trailColor", js.undefined)
    }
  }
  
  @js.native
  trait ClassName extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var counterClockwise: Boolean = js.native
    
    var dashRatio: Double = js.native
    
    var pathRadius: Double = js.native
    
    var strokeWidth: Double = js.native
    
    var style: js.UndefOr[js.Object] = js.native
  }
  object ClassName {
    
    @scala.inline
    def apply(counterClockwise: Boolean, dashRatio: Double, pathRadius: Double, strokeWidth: Double): ClassName = {
      val __obj = js.Dynamic.literal(counterClockwise = counterClockwise.asInstanceOf[js.Any], dashRatio = dashRatio.asInstanceOf[js.Any], pathRadius = pathRadius.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    @scala.inline
    implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCounterClockwise(value: Boolean): Self = StObject.set(x, "counterClockwise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashRatio(value: Double): Self = StObject.set(x, "dashRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathRadius(value: Double): Self = StObject.set(x, "pathRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
