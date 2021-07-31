package typings.reactAdaptiveHooks

import typings.reactAdaptiveHooks.anon.Audio
import typings.reactAdaptiveHooks.anon.MediaCapabilities
import typings.reactAdaptiveHooks.anon.Type
import typings.reactAdaptiveHooks.anon.Video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaCapabilitiesMod {
  
  @JSImport("react-adaptive-hooks/media-capabilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useMediaCapabilities[T](mediaConfig: MediaConfiguration, initialMediaCapabilities: T): MediaCapabilities[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMediaCapabilities")(mediaConfig.asInstanceOf[js.Any], initialMediaCapabilities.asInstanceOf[js.Any])).asInstanceOf[MediaCapabilities[T]]
  
  trait AudioMediaConfiguration extends StObject {
    
    var bitrate: Double
    
    var channels: Double
    
    var contentType: String
    
    var samplerate: Double
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
  
  type MediaConfiguration = Type & (Audio | Video)
  
  trait MediaConfigurationInfo extends StObject {
    
    var powerEfficient: Boolean
    
    var smooth: Boolean
    
    var supported: Boolean
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
  
  trait VideoMediaConfiguration extends StObject {
    
    var bitrate: Double
    
    var contentType: String
    
    var framerate: Double
    
    var height: Double
    
    var width: Double
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
