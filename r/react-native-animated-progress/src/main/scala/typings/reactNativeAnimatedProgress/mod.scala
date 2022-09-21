package typings.reactNativeAnimatedProgress

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-animated-progress", JSImport.Default)
  @js.native
  val default: FC[AnimatedProgressProps] = js.native
  
  @JSImport("react-native-animated-progress", "AnimatedProgress")
  @js.native
  val AnimatedProgress: FC[AnimatedProgressProps] = js.native
  
  trait AnimatedProgressProps extends StObject {
    
    /* (Default - true)
      *  Chooses wheter to animate the progress or not
      */
    var animated: js.UndefOr[Boolean] = js.undefined
    
    /* (Default - none)
      *  Sets the color of the progress bar.
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /* Integer (Default - 2)
      *  Sets the height of the bar.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /* (Default - false)
      *  Sets the bar to animate constantly as a loading progress.
      */
    var indeterminate: js.UndefOr[Boolean] = js.undefined
    
    /** (Default - 1100) */
    var indeterminateDuration: js.UndefOr[Double] = js.undefined
    
    var onCompletion: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /* Integer - From 0 to 100 (Default - 0).
      *  Chooses the point where the progress should animate to,
      *  based on the progress bar width.
      */
    var progress: js.UndefOr[Double] = js.undefined
    
    /** (Default - 1100) */
    var progressDuration: js.UndefOr[Double] = js.undefined
    
    /* (Default - #A6A6A6).
      *  Sets the color of the progress bar track.
      */
    var trackColor: js.UndefOr[String] = js.undefined
  }
  object AnimatedProgressProps {
    
    inline def apply(): AnimatedProgressProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimatedProgressProps]
    }
    
    extension [Self <: AnimatedProgressProps](x: Self) {
      
      inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
      
      inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateDuration(value: Double): Self = StObject.set(x, "indeterminateDuration", value.asInstanceOf[js.Any])
      
      inline def setIndeterminateDurationUndefined: Self = StObject.set(x, "indeterminateDuration", js.undefined)
      
      inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
      
      inline def setOnCompletion(value: () => Any): Self = StObject.set(x, "onCompletion", js.Any.fromFunction0(value))
      
      inline def setOnCompletionUndefined: Self = StObject.set(x, "onCompletion", js.undefined)
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressDuration(value: Double): Self = StObject.set(x, "progressDuration", value.asInstanceOf[js.Any])
      
      inline def setProgressDurationUndefined: Self = StObject.set(x, "progressDuration", js.undefined)
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setTrackColor(value: String): Self = StObject.set(x, "trackColor", value.asInstanceOf[js.Any])
      
      inline def setTrackColorUndefined: Self = StObject.set(x, "trackColor", js.undefined)
    }
  }
  
  type _To = FC[AnimatedProgressProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[AnimatedProgressProps] = default
}
