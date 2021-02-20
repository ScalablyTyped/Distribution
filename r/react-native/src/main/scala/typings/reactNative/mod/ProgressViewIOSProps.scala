package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.bar
import typings.reactNative.reactNativeStrings.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressViewIOSProps extends ViewProps {
  
  /**
    * The progress value (between 0 and 1).
    */
  var progress: js.UndefOr[Double] = js.native
  
  /**
    * A stretchable image to display as the progress bar.
    */
  var progressImage: js.UndefOr[ImageURISource | js.Array[ImageURISource]] = js.native
  
  /**
    * The tint color of the progress bar itself.
    */
  var progressTintColor: js.UndefOr[ColorValue] = js.native
  
  /**
    * The progress bar style.
    */
  var progressViewStyle: js.UndefOr[default | bar] = js.native
  
  /**
    * A stretchable image to display behind the progress bar.
    */
  var trackImage: js.UndefOr[ImageURISource | js.Array[ImageURISource]] = js.native
  
  /**
    * The tint color of the progress bar track.
    */
  var trackTintColor: js.UndefOr[ColorValue] = js.native
}
object ProgressViewIOSProps {
  
  @scala.inline
  def apply(): ProgressViewIOSProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressViewIOSProps]
  }
  
  @scala.inline
  implicit class ProgressViewIOSPropsMutableBuilder[Self <: ProgressViewIOSProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressImage(value: ImageURISource | js.Array[ImageURISource]): Self = StObject.set(x, "progressImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressImageUndefined: Self = StObject.set(x, "progressImage", js.undefined)
    
    @scala.inline
    def setProgressImageVarargs(value: ImageURISource*): Self = StObject.set(x, "progressImage", js.Array(value :_*))
    
    @scala.inline
    def setProgressTintColor(value: ColorValue): Self = StObject.set(x, "progressTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressTintColorUndefined: Self = StObject.set(x, "progressTintColor", js.undefined)
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setProgressViewStyle(value: default | bar): Self = StObject.set(x, "progressViewStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressViewStyleUndefined: Self = StObject.set(x, "progressViewStyle", js.undefined)
    
    @scala.inline
    def setTrackImage(value: ImageURISource | js.Array[ImageURISource]): Self = StObject.set(x, "trackImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackImageUndefined: Self = StObject.set(x, "trackImage", js.undefined)
    
    @scala.inline
    def setTrackImageVarargs(value: ImageURISource*): Self = StObject.set(x, "trackImage", js.Array(value :_*))
    
    @scala.inline
    def setTrackTintColor(value: ColorValue): Self = StObject.set(x, "trackTintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackTintColorUndefined: Self = StObject.set(x, "trackTintColor", js.undefined)
  }
}
