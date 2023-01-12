package typings.reactNativeWindows.rntypesMod

import typings.reactNativeWindows.reactNativeWindowsStrings.bar
import typings.reactNativeWindows.reactNativeWindowsStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressViewIOSProps
  extends StObject
     with ViewProps {
  
  /**
    * The progress value (between 0 and 1).
    */
  var progress: js.UndefOr[Double] = js.undefined
  
  /**
    * A stretchable image to display as the progress bar.
    */
  var progressImage: js.UndefOr[ImageURISource | js.Array[ImageURISource]] = js.undefined
  
  /**
    * The tint color of the progress bar itself.
    */
  var progressTintColor: js.UndefOr[ColorValue] = js.undefined
  
  /**
    * The progress bar style.
    */
  var progressViewStyle: js.UndefOr[default | bar] = js.undefined
  
  /**
    * A stretchable image to display behind the progress bar.
    */
  var trackImage: js.UndefOr[ImageURISource | js.Array[ImageURISource]] = js.undefined
  
  /**
    * The tint color of the progress bar track.
    */
  var trackTintColor: js.UndefOr[ColorValue] = js.undefined
}
object ProgressViewIOSProps {
  
  inline def apply(): ProgressViewIOSProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressViewIOSProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProgressViewIOSProps] (val x: Self) extends AnyVal {
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressImage(value: ImageURISource | js.Array[ImageURISource]): Self = StObject.set(x, "progressImage", value.asInstanceOf[js.Any])
    
    inline def setProgressImageUndefined: Self = StObject.set(x, "progressImage", js.undefined)
    
    inline def setProgressImageVarargs(value: ImageURISource*): Self = StObject.set(x, "progressImage", js.Array(value*))
    
    inline def setProgressTintColor(value: ColorValue): Self = StObject.set(x, "progressTintColor", value.asInstanceOf[js.Any])
    
    inline def setProgressTintColorUndefined: Self = StObject.set(x, "progressTintColor", js.undefined)
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setProgressViewStyle(value: default | bar): Self = StObject.set(x, "progressViewStyle", value.asInstanceOf[js.Any])
    
    inline def setProgressViewStyleUndefined: Self = StObject.set(x, "progressViewStyle", js.undefined)
    
    inline def setTrackImage(value: ImageURISource | js.Array[ImageURISource]): Self = StObject.set(x, "trackImage", value.asInstanceOf[js.Any])
    
    inline def setTrackImageUndefined: Self = StObject.set(x, "trackImage", js.undefined)
    
    inline def setTrackImageVarargs(value: ImageURISource*): Self = StObject.set(x, "trackImage", js.Array(value*))
    
    inline def setTrackTintColor(value: ColorValue): Self = StObject.set(x, "trackTintColor", value.asInstanceOf[js.Any])
    
    inline def setTrackTintColorUndefined: Self = StObject.set(x, "trackTintColor", js.undefined)
  }
}
