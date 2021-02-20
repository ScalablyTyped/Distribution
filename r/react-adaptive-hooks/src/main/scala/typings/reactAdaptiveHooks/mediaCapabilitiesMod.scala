package typings.reactAdaptiveHooks

import typings.reactAdaptiveHooks.anon.Audio
import typings.reactAdaptiveHooks.anon.MediaCapabilities
import typings.reactAdaptiveHooks.anon.Type
import typings.reactAdaptiveHooks.anon.Video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaCapabilitiesMod {
  
  @JSImport("react-adaptive-hooks/media-capabilities", "useMediaCapabilities")
  @js.native
  def useMediaCapabilities[T](mediaConfig: MediaConfiguration, initialMediaCapabilities: T): MediaCapabilities[T] = js.native
  
  @js.native
  trait AudioMediaConfiguration extends StObject {
    
    var bitrate: Double = js.native
    
    var channels: Double = js.native
    
    var contentType: String = js.native
    
    var samplerate: Double = js.native
  }
  object AudioMediaConfiguration {
    
    @scala.inline
    def apply(bitrate: Double, channels: Double, contentType: String, samplerate: Double): AudioMediaConfiguration = {
      val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], samplerate = samplerate.asInstanceOf[js.Any])
      __obj.asInstanceOf[AudioMediaConfiguration]
    }
    
    @scala.inline
    implicit class AudioMediaConfigurationMutableBuilder[Self <: AudioMediaConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannels(value: Double): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamplerate(value: Double): Self = StObject.set(x, "samplerate", value.asInstanceOf[js.Any])
    }
  }
  
  type MediaConfiguration = Type with (Audio | Video)
  
  @js.native
  trait MediaConfigurationInfo extends StObject {
    
    var powerEfficient: Boolean = js.native
    
    var smooth: Boolean = js.native
    
    var supported: Boolean = js.native
  }
  object MediaConfigurationInfo {
    
    @scala.inline
    def apply(powerEfficient: Boolean, smooth: Boolean, supported: Boolean): MediaConfigurationInfo = {
      val __obj = js.Dynamic.literal(powerEfficient = powerEfficient.asInstanceOf[js.Any], smooth = smooth.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaConfigurationInfo]
    }
    
    @scala.inline
    implicit class MediaConfigurationInfoMutableBuilder[Self <: MediaConfigurationInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPowerEfficient(value: Boolean): Self = StObject.set(x, "powerEfficient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VideoMediaConfiguration extends StObject {
    
    var bitrate: Double = js.native
    
    var contentType: String = js.native
    
    var framerate: Double = js.native
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object VideoMediaConfiguration {
    
    @scala.inline
    def apply(bitrate: Double, contentType: String, framerate: Double, height: Double, width: Double): VideoMediaConfiguration = {
      val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], framerate = framerate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[VideoMediaConfiguration]
    }
    
    @scala.inline
    implicit class VideoMediaConfigurationMutableBuilder[Self <: VideoMediaConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramerate(value: Double): Self = StObject.set(x, "framerate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
