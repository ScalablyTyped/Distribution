package typings.spinJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spinnerOptionsMod {
  
  trait SpinnerOptions extends StObject {
    
    /**
      * The animation name used for the spinner lines. Defaults to 'spinner-line-fade-default'.
      */
    var animation: js.UndefOr[String] = js.undefined
    
    /**
      * The CSS class to assign to the spinner
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * A CSS color string, or array of strings to set the line color
      */
    var color: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Corner roundness (0..1)
      */
    var corners: js.UndefOr[Double] = js.undefined
    
    /**
      * 1: clockwise, -1: counterclockwise
      */
    var direction: js.UndefOr[Double] = js.undefined
    
    /**
      * A CSS color string, or array of strings to set the color that lines will fade to.
      * Defaults to transparent.
      */
    var fadeColor: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Left position relative to parent (defaults to 50%)
      */
    var left: js.UndefOr[String] = js.undefined
    
    /**
      * The length of each line
      */
    var length: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of lines to draw
      */
    var lines: js.UndefOr[Double] = js.undefined
    
    /**
      * Element positioning
      */
    var position: js.UndefOr[String] = js.undefined
    
    /**
      * The radius of the inner circle
      */
    var radius: js.UndefOr[Double] = js.undefined
    
    /**
      * The rotation offset
      */
    var rotate: js.UndefOr[Double] = js.undefined
    
    /**
      * Scales overall size of the spinner
      */
    var scale: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to render the default shadow (boolean).
      * A string can be used to set a custom box-shadow value.
      */
    var shadow: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Rounds per second
      */
    var speed: js.UndefOr[Double] = js.undefined
    
    /**
      * Top position relative to parent (defaults to 50%)
      */
    var top: js.UndefOr[String] = js.undefined
    
    /**
      * The line thickness
      */
    var width: js.UndefOr[Double] = js.undefined
    
    /**
      * The z-index (defaults to 2000000000)
      */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object SpinnerOptions {
    
    inline def apply(): SpinnerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinnerOptions]
    }
    
    extension [Self <: SpinnerOptions](x: Self) {
      
      inline def setAnimation(value: String): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setColor(value: String | js.Array[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      inline def setCorners(value: Double): Self = StObject.set(x, "corners", value.asInstanceOf[js.Any])
      
      inline def setCornersUndefined: Self = StObject.set(x, "corners", js.undefined)
      
      inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setFadeColor(value: String | js.Array[String]): Self = StObject.set(x, "fadeColor", value.asInstanceOf[js.Any])
      
      inline def setFadeColorUndefined: Self = StObject.set(x, "fadeColor", js.undefined)
      
      inline def setFadeColorVarargs(value: String*): Self = StObject.set(x, "fadeColor", js.Array(value :_*))
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setLines(value: Double): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLinesUndefined: Self = StObject.set(x, "lines", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setShadow(value: Boolean | String): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
