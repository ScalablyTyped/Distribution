package typings.reactWebcam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Audio extends StObject {
    
    var audio: Boolean
    
    var forceScreenshotSourceSize: Boolean
    
    var imageSmoothing: Boolean
    
    var mirrored: Boolean
    
    def onUserMedia(): Unit
    
    def onUserMediaError(): Unit
    
    var screenshotFormat: String
    
    var screenshotQuality: Double
  }
  object Audio {
    
    @scala.inline
    def apply(
      audio: Boolean,
      forceScreenshotSourceSize: Boolean,
      imageSmoothing: Boolean,
      mirrored: Boolean,
      onUserMedia: () => Unit,
      onUserMediaError: () => Unit,
      screenshotFormat: String,
      screenshotQuality: Double
    ): Audio = {
      val __obj = js.Dynamic.literal(audio = audio.asInstanceOf[js.Any], forceScreenshotSourceSize = forceScreenshotSourceSize.asInstanceOf[js.Any], imageSmoothing = imageSmoothing.asInstanceOf[js.Any], mirrored = mirrored.asInstanceOf[js.Any], onUserMedia = js.Any.fromFunction0(onUserMedia), onUserMediaError = js.Any.fromFunction0(onUserMediaError), screenshotFormat = screenshotFormat.asInstanceOf[js.Any], screenshotQuality = screenshotQuality.asInstanceOf[js.Any])
      __obj.asInstanceOf[Audio]
    }
    
    @scala.inline
    implicit class AudioMutableBuilder[Self <: Audio] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceScreenshotSourceSize(value: Boolean): Self = StObject.set(x, "forceScreenshotSourceSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSmoothing(value: Boolean): Self = StObject.set(x, "imageSmoothing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMirrored(value: Boolean): Self = StObject.set(x, "mirrored", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUserMedia(value: () => Unit): Self = StObject.set(x, "onUserMedia", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnUserMediaError(value: () => Unit): Self = StObject.set(x, "onUserMediaError", js.Any.fromFunction0(value))
      
      @scala.inline
      def setScreenshotFormat(value: String): Self = StObject.set(x, "screenshotFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenshotQuality(value: Double): Self = StObject.set(x, "screenshotQuality", value.asInstanceOf[js.Any])
    }
  }
}
