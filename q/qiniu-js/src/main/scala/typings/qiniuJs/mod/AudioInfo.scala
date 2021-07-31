package typings.qiniuJs.mod

import typings.qiniuJs.anon.Dictkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioInfo extends StObject {
  
  var bit_rate: String
  
  var channels: Double
  
  var codec_name: String
  
  var codec_type: String
  
  var duration: String
  
  var index: Double
  
  var nb_frames: String
  
  var r_frame_rate: String
  
  var sample_fmt: String
  
  var sample_rate: String
  
  var start_time: String
  
  var tags: Dictkey
}
object AudioInfo {
  
  @scala.inline
  def apply(
    bit_rate: String,
    channels: Double,
    codec_name: String,
    codec_type: String,
    duration: String,
    index: Double,
    nb_frames: String,
    r_frame_rate: String,
    sample_fmt: String,
    sample_rate: String,
    start_time: String,
    tags: Dictkey
  ): AudioInfo = {
    val __obj = js.Dynamic.literal(bit_rate = bit_rate.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], codec_name = codec_name.asInstanceOf[js.Any], codec_type = codec_type.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nb_frames = nb_frames.asInstanceOf[js.Any], r_frame_rate = r_frame_rate.asInstanceOf[js.Any], sample_fmt = sample_fmt.asInstanceOf[js.Any], sample_rate = sample_rate.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioInfo]
  }
  
  @scala.inline
  implicit class AudioInfoMutableBuilder[Self <: AudioInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBit_rate(value: String): Self = StObject.set(x, "bit_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannels(value: Double): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodec_name(value: String): Self = StObject.set(x, "codec_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodec_type(value: String): Self = StObject.set(x, "codec_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNb_frames(value: String): Self = StObject.set(x, "nb_frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR_frame_rate(value: String): Self = StObject.set(x, "r_frame_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSample_fmt(value: String): Self = StObject.set(x, "sample_fmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSample_rate(value: String): Self = StObject.set(x, "sample_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_time(value: String): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Dictkey): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
