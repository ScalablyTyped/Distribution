package typings.qiniuJs.mod

import typings.qiniuJs.anon.Dictkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoInfo extends StObject {
  
  var bit_rate: String
  
  var codec_name: String
  
  var codec_type: String
  
  var display_aspect_ratio: String
  
  var duration: String
  
  var height: Double
  
  var index: Double
  
  var nb_frames: String
  
  var pix_fmt: String
  
  var r_frame_rate: String
  
  var sample_aspect_ratio: String
  
  var start_time: String
  
  var tags: Dictkey
  
  var width: Double
}
object VideoInfo {
  
  @scala.inline
  def apply(
    bit_rate: String,
    codec_name: String,
    codec_type: String,
    display_aspect_ratio: String,
    duration: String,
    height: Double,
    index: Double,
    nb_frames: String,
    pix_fmt: String,
    r_frame_rate: String,
    sample_aspect_ratio: String,
    start_time: String,
    tags: Dictkey,
    width: Double
  ): VideoInfo = {
    val __obj = js.Dynamic.literal(bit_rate = bit_rate.asInstanceOf[js.Any], codec_name = codec_name.asInstanceOf[js.Any], codec_type = codec_type.asInstanceOf[js.Any], display_aspect_ratio = display_aspect_ratio.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], nb_frames = nb_frames.asInstanceOf[js.Any], pix_fmt = pix_fmt.asInstanceOf[js.Any], r_frame_rate = r_frame_rate.asInstanceOf[js.Any], sample_aspect_ratio = sample_aspect_ratio.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoInfo]
  }
  
  @scala.inline
  implicit class VideoInfoMutableBuilder[Self <: VideoInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBit_rate(value: String): Self = StObject.set(x, "bit_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodec_name(value: String): Self = StObject.set(x, "codec_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodec_type(value: String): Self = StObject.set(x, "codec_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_aspect_ratio(value: String): Self = StObject.set(x, "display_aspect_ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNb_frames(value: String): Self = StObject.set(x, "nb_frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPix_fmt(value: String): Self = StObject.set(x, "pix_fmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR_frame_rate(value: String): Self = StObject.set(x, "r_frame_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSample_aspect_ratio(value: String): Self = StObject.set(x, "sample_aspect_ratio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_time(value: String): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Dictkey): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
