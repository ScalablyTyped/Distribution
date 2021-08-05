package typings.rtpParser.anon

import typings.rtpParser.rtpParserNumbers.`22050`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.DVI4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelsClockRate extends StObject {
  
  var channels: typings.rtpParser.rtpParserNumbers.`1`
  
  var clockRate: `22050`
  
  var mediaType: A
  
  var name: DVI4
}
object ChannelsClockRate {
  
  inline def apply(): ChannelsClockRate = {
    val __obj = js.Dynamic.literal(channels = 1, clockRate = 22050, mediaType = "A", name = "DVI4")
    __obj.asInstanceOf[ChannelsClockRate]
  }
  
  extension [Self <: ChannelsClockRate](x: Self) {
    
    inline def setChannels(value: typings.rtpParser.rtpParserNumbers.`1`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setClockRate(value: `22050`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: A): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: DVI4): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
