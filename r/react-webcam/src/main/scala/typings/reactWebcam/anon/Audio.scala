package typings.reactWebcam.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Audio extends js.Object {
  
  var audio: Boolean = js.native
  
  var forceScreenshotSourceSize: Boolean = js.native
  
  var imageSmoothing: Boolean = js.native
  
  var mirrored: Boolean = js.native
  
  def onUserMedia(): js.UndefOr[scala.Nothing] = js.native
  
  def onUserMediaError(): js.UndefOr[scala.Nothing] = js.native
  
  var screenshotFormat: String = js.native
  
  var screenshotQuality: Double = js.native
}
object Audio {
  
  @scala.inline
  def apply(
    audio: Boolean,
    forceScreenshotSourceSize: Boolean,
    imageSmoothing: Boolean,
    mirrored: Boolean,
    onUserMedia: () => js.UndefOr[scala.Nothing],
    onUserMediaError: () => js.UndefOr[scala.Nothing],
    screenshotFormat: String,
    screenshotQuality: Double
  ): Audio = {
    val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], forceScreenshotSourceSize = forceScreenshotSourceSize.asInstanceOf[js.Any], imageSmoothing = imageSmoothing.asInstanceOf[js.Any], mirrored = mirrored.asInstanceOf[js.Any], onUserMedia = js.Any.fromFunction0(onUserMedia), onUserMediaError = js.Any.fromFunction0(onUserMediaError), screenshotFormat = screenshotFormat.asInstanceOf[js.Any], screenshotQuality = screenshotQuality.asInstanceOf[js.Any])
    __obj.asInstanceOf[Audio]
  }
  
  @scala.inline
  implicit class AudioOps[Self <: Audio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAudio(value: Boolean): Self = this.set("audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceScreenshotSourceSize(value: Boolean): Self = this.set("forceScreenshotSourceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageSmoothing(value: Boolean): Self = this.set("imageSmoothing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMirrored(value: Boolean): Self = this.set("mirrored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUserMedia(value: () => js.UndefOr[scala.Nothing]): Self = this.set("onUserMedia", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnUserMediaError(value: () => js.UndefOr[scala.Nothing]): Self = this.set("onUserMediaError", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScreenshotFormat(value: String): Self = this.set("screenshotFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenshotQuality(value: Double): Self = this.set("screenshotQuality", value.asInstanceOf[js.Any])
  }
}
