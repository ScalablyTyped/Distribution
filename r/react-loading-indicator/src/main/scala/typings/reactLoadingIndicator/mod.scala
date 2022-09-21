package typings.reactLoadingIndicator

import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-loading-indicator", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[LoadingIndicatorProps, js.Object, Any]
  
  type LoadingIndicator = PureComponent[LoadingIndicatorProps, js.Object, Any]
  
  trait LoadingIndicatorColor extends StObject {
    
    // value between 0 and 255, inclusive
    var alpha: Double
    
    // value between 0 and 255, inclusive
    var blue: Double
    
    // value between 0 and 255, inclusive
    var green: Double
    
    var red: Double
  }
  object LoadingIndicatorColor {
    
    inline def apply(alpha: Double, blue: Double, green: Double, red: Double): LoadingIndicatorColor = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadingIndicatorColor]
    }
    
    extension [Self <: LoadingIndicatorColor](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      inline def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      inline def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    }
  }
  
  trait LoadingIndicatorProps extends StObject {
    
    /*
      The color of the most solid segment—what we call each spoke of the loading indicator.
      The color prop is an object with four keys: red, green, blue, and alpha.
      The first three color components are values between 0 and 255, inclusive.
      The alpha component is a value between 0 and 1, inclusive.
      */
    var color: js.UndefOr[LoadingIndicatorColor] = js.undefined
    
    /*
      The number of steps between segments from the boldest segment to the faintest segments.
      If fadeSteps is segments - 1 then only the last segment will be the faintest,
      multiplied by fadeTo.
      If fadeSteps is a lower value, then several of the last segments will all have the faintest opacity.
      */
    var fadeSteps: js.UndefOr[Double] = js.undefined
    
    // Extra spacing to pad the distance between the center of the loading indicator and each segment, in logical pixels.
    /*
      The alpha multiplier of the faintest segments.
      Each segment's color is determined by multiplying the alpha channel of the color
      prop by a gradually decreasing alpha multiplier that starts at 1 and linearly
      decreases to the fadeTo prop.
      */
    var fadeTo: js.UndefOr[Double] = js.undefined
    
    // The width of each segment, in logical pixels.
    var segmentLength: js.UndefOr[Double] = js.undefined
    
    // The number of segments, evenly spaced from each other.
    var segmentWidth: js.UndefOr[Double] = js.undefined
    
    var segments: js.UndefOr[Double] = js.undefined
    
    // The length of each segment, in logical pixels.
    var spacing: js.UndefOr[Double] = js.undefined
  }
  object LoadingIndicatorProps {
    
    inline def apply(): LoadingIndicatorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadingIndicatorProps]
    }
    
    extension [Self <: LoadingIndicatorProps](x: Self) {
      
      inline def setColor(value: LoadingIndicatorColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFadeSteps(value: Double): Self = StObject.set(x, "fadeSteps", value.asInstanceOf[js.Any])
      
      inline def setFadeStepsUndefined: Self = StObject.set(x, "fadeSteps", js.undefined)
      
      inline def setFadeTo(value: Double): Self = StObject.set(x, "fadeTo", value.asInstanceOf[js.Any])
      
      inline def setFadeToUndefined: Self = StObject.set(x, "fadeTo", js.undefined)
      
      inline def setSegmentLength(value: Double): Self = StObject.set(x, "segmentLength", value.asInstanceOf[js.Any])
      
      inline def setSegmentLengthUndefined: Self = StObject.set(x, "segmentLength", js.undefined)
      
      inline def setSegmentWidth(value: Double): Self = StObject.set(x, "segmentWidth", value.asInstanceOf[js.Any])
      
      inline def setSegmentWidthUndefined: Self = StObject.set(x, "segmentWidth", js.undefined)
      
      inline def setSegments(value: Double): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
      
      inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    }
  }
}
