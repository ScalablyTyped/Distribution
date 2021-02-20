package typings.reactLoader

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-loader", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[LoaderProps, js.Object, js.Any]
  
  @js.native
  trait LoaderOptions extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var corners: js.UndefOr[Double] = js.native
    
    var direction: js.UndefOr[Double] = js.native
    
    var fps: js.UndefOr[Double] = js.native
    
    var hwaccel: js.UndefOr[Boolean] = js.native
    
    var left: js.UndefOr[String] = js.native
    
    var length: js.UndefOr[Double] = js.native
    
    var lines: js.UndefOr[Double] = js.native
    
    var loadedClassName: js.UndefOr[String] = js.native
    
    var opacity: js.UndefOr[Double] = js.native
    
    var position: js.UndefOr[String] = js.native
    
    var radius: js.UndefOr[Double] = js.native
    
    var rotate: js.UndefOr[Double] = js.native
    
    var scale: js.UndefOr[Double] = js.native
    
    var shadow: js.UndefOr[Boolean] = js.native
    
    var speed: js.UndefOr[Double] = js.native
    
    var top: js.UndefOr[String] = js.native
    
    var trail: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object LoaderOptions {
    
    @scala.inline
    def apply(): LoaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoaderOptions]
    }
    
    @scala.inline
    implicit class LoaderOptionsMutableBuilder[Self <: LoaderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCorners(value: Double): Self = StObject.set(x, "corners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornersUndefined: Self = StObject.set(x, "corners", js.undefined)
      
      @scala.inline
      def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
      
      @scala.inline
      def setHwaccel(value: Boolean): Self = StObject.set(x, "hwaccel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHwaccelUndefined: Self = StObject.set(x, "hwaccel", js.undefined)
      
      @scala.inline
      def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      @scala.inline
      def setLoadedClassName(value: String): Self = StObject.set(x, "loadedClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadedClassNameUndefined: Self = StObject.set(x, "loadedClassName", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setShadow(value: Boolean): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setTrail(value: Double): Self = StObject.set(x, "trail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailUndefined: Self = StObject.set(x, "trail", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait LoaderProps extends LoaderOptions {
    
    var className: js.UndefOr[String] = js.native
    
    var loaded: Boolean = js.native
    
    var options: js.UndefOr[LoaderOptions] = js.native
  }
  object LoaderProps {
    
    @scala.inline
    def apply(loaded: Boolean): LoaderProps = {
      val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoaderProps]
    }
    
    @scala.inline
    implicit class LoaderPropsMutableBuilder[Self <: LoaderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: LoaderOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
  
  type ReactLoader = Component[LoaderProps, js.Object, js.Any]
}
