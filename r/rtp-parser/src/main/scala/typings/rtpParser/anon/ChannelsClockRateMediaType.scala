package typings.rtpParser.anon

import typings.rtpParser.rtpParserInts.`11025`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.DVI4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelsClockRateMediaType extends StObject {
  
  var channels: typings.rtpParser.rtpParserInts.`1`
  
  var clockRate: `11025`
  
  var mediaType: A
  
  var name: DVI4
}
object ChannelsClockRateMediaType {
  
  inline def apply(): ChannelsClockRateMediaType = {
    val __obj = js.Dynamic.literal(channels = 1, clockRate = 11025, mediaType = "A", name = "DVI4")
    __obj.asInstanceOf[ChannelsClockRateMediaType]
  }
  
  extension [Self <: ChannelsClockRateMediaType](x: Self) {
    
    inline def setChannels(value: typings.rtpParser.rtpParserInts.`1`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setClockRate(value: `11025`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: A): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: DVI4): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
