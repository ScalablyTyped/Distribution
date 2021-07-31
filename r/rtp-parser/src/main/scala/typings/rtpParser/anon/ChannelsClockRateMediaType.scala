package typings.rtpParser.anon

import typings.rtpParser.rtpParserNumbers.`11025`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.DVI4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelsClockRateMediaType extends StObject {
  
  var channels: typings.rtpParser.rtpParserNumbers.`1`
  
  var clockRate: `11025`
  
  var mediaType: A
  
  var name: DVI4
}
object ChannelsClockRateMediaType {
  
  @scala.inline
  def apply(): ChannelsClockRateMediaType = {
    val __obj = js.Dynamic.literal(channels = 1, clockRate = 11025, mediaType = "A", name = "DVI4")
    __obj.asInstanceOf[ChannelsClockRateMediaType]
  }
  
  @scala.inline
  implicit class ChannelsClockRateMediaTypeMutableBuilder[Self <: ChannelsClockRateMediaType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannels(value: typings.rtpParser.rtpParserNumbers.`1`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClockRate(value: `11025`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: A): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: DVI4): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
