package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenCameraDialogOptions extends StObject {
  
  /** Defaults to false */
  var videoMode: js.UndefOr[Boolean] = js.undefined
}
object OpenCameraDialogOptions {
  
  @scala.inline
  def apply(): OpenCameraDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenCameraDialogOptions]
  }
  
  @scala.inline
  implicit class OpenCameraDialogOptionsMutableBuilder[Self <: OpenCameraDialogOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVideoMode(value: Boolean): Self = StObject.set(x, "videoMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoModeUndefined: Self = StObject.set(x, "videoMode", js.undefined)
  }
}
