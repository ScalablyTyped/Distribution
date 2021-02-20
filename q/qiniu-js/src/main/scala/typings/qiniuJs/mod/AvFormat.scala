package typings.qiniuJs.mod

import typings.qiniuJs.anon.Dictkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvFormat extends StObject {
  
  var bit_rate: String = js.native
  
  var duration: String = js.native
  
  var format_long_name: String = js.native
  
  var format_name: String = js.native
  
  var nb_streams: Double = js.native
  
  var size: String = js.native
  
  var start_time: String = js.native
  
  var tags: Dictkey = js.native
}
object AvFormat {
  
  @scala.inline
  def apply(
    bit_rate: String,
    duration: String,
    format_long_name: String,
    format_name: String,
    nb_streams: Double,
    size: String,
    start_time: String,
    tags: Dictkey
  ): AvFormat = {
    val __obj = js.Dynamic.literal(bit_rate = bit_rate.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], format_long_name = format_long_name.asInstanceOf[js.Any], format_name = format_name.asInstanceOf[js.Any], nb_streams = nb_streams.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvFormat]
  }
  
  @scala.inline
  implicit class AvFormatMutableBuilder[Self <: AvFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBit_rate(value: String): Self = StObject.set(x, "bit_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat_long_name(value: String): Self = StObject.set(x, "format_long_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat_name(value: String): Self = StObject.set(x, "format_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNb_streams(value: Double): Self = StObject.set(x, "nb_streams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_time(value: String): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Dictkey): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
