package typings.reactNativeConfetti

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-confetti", JSImport.Default)
  @js.native
  open class default () extends Confetti
  
  @js.native
  trait Confetti
    extends Component[ConfettiProps, js.Object, Any] {
    
    /**
      * Remove confetti by its key.
      *
      * This function is used internally.
      */
    def removeConfetti(key: Double): Unit = js.native
    
    /**
      * Start the confetti animation.
      *
      * The optional callback will be called when the entire animation is complete.
      */
    def startConfetti(): Unit = js.native
    def startConfetti(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Stop the confetti animation.
      */
    def stopConfetti(): Unit = js.native
  }
  
  trait ConfettiProps extends StObject {
    
    /**
      * Multiplier for radius of confetti (border radius).
      * @default 1
      */
    var bsize: js.UndefOr[Double] = js.undefined
    
    /**
      * Array of color strings to choose from.
      * @default ["rgb(242.2, 102, 68.8)","rgb(255, 198.9, 91.8)","rgb(122.4, 198.9, 163.2)","rgb(76.5, 193.8, 216.7)","rgb(147.9, 99.4, 140.2)"]
      */
    var colors: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The number of confetti to render.
      * @default 100
      */
    var confettiCount: js.UndefOr[Double] = js.undefined
    
    /**
      * The duration until a confetti reaches bottom.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Multiplier for size of confetti (width and heigh).
      * @default 1
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /**
      * The duration of the animation in milliseconds.
      * @default 30
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Render confetti continuously until stopConfetti() is called.
      *
      * This ignores confettiCount.
      *
      * @default false
      */
    var untilStopped: js.UndefOr[Boolean] = js.undefined
  }
  object ConfettiProps {
    
    inline def apply(): ConfettiProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfettiProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfettiProps] (val x: Self) extends AnyVal {
      
      inline def setBsize(value: Double): Self = StObject.set(x, "bsize", value.asInstanceOf[js.Any])
      
      inline def setBsizeUndefined: Self = StObject.set(x, "bsize", js.undefined)
      
      inline def setColors(value: js.Array[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setConfettiCount(value: Double): Self = StObject.set(x, "confettiCount", value.asInstanceOf[js.Any])
      
      inline def setConfettiCountUndefined: Self = StObject.set(x, "confettiCount", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUntilStopped(value: Boolean): Self = StObject.set(x, "untilStopped", value.asInstanceOf[js.Any])
      
      inline def setUntilStoppedUndefined: Self = StObject.set(x, "untilStopped", js.undefined)
    }
  }
}
