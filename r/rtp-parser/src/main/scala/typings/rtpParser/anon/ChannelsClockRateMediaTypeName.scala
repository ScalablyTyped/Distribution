package typings.rtpParser.anon

import typings.rtpParser.rtpParserNumbers.`8000`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.G728
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelsClockRateMediaTypeName extends StObject {
  
  var channels: typings.rtpParser.rtpParserNumbers.`1`
  
  var clockRate: `8000`
  
  var mediaType: A
  
  var name: G728
}
object ChannelsClockRateMediaTypeName {
  
  inline def apply(): ChannelsClockRateMediaTypeName = {
    val __obj = js.Dynamic.literal(channels = 1, clockRate = 8000, mediaType = "A", name = "G728")
    __obj.asInstanceOf[ChannelsClockRateMediaTypeName]
  }
  
  extension [Self <: ChannelsClockRateMediaTypeName](x: Self) {
    
    inline def setChannels(value: typings.rtpParser.rtpParserNumbers.`1`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setClockRate(value: `8000`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: A): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: G728): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
