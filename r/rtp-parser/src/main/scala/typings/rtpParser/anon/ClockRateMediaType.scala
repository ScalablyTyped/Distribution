package typings.rtpParser.anon

import typings.rtpParser.rtpParserInts.`16000`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.DVI4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClockRateMediaType extends StObject {
  
  var channels: typings.rtpParser.rtpParserInts.`1`
  
  var clockRate: `16000`
  
  var mediaType: A
  
  var name: DVI4
}
object ClockRateMediaType {
  
  inline def apply(): ClockRateMediaType = {
    val __obj = js.Dynamic.literal(channels = 1, clockRate = 16000, mediaType = "A", name = "DVI4")
    __obj.asInstanceOf[ClockRateMediaType]
  }
  
  extension [Self <: ClockRateMediaType](x: Self) {
    
    inline def setChannels(value: typings.rtpParser.rtpParserInts.`1`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setClockRate(value: `16000`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: A): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: DVI4): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
