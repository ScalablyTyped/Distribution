package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenCameraDialogOptions extends StObject {
  
  /** Defaults to false */
  var videoMode: js.UndefOr[Boolean] = js.undefined
}
object OpenCameraDialogOptions {
  
  inline def apply(): OpenCameraDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenCameraDialogOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenCameraDialogOptions] (val x: Self) extends AnyVal {
    
    inline def setVideoMode(value: Boolean): Self = StObject.set(x, "videoMode", value.asInstanceOf[js.Any])
    
    inline def setVideoModeUndefined: Self = StObject.set(x, "videoMode", js.undefined)
  }
}
