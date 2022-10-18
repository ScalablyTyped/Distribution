package typings.rtpParser.anon

import typings.rtpParser.rtpParserInts.`8000`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.QCELP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var channels: typings.rtpParser.rtpParserInts.`1`
  
  var clockRate: `8000`
  
  var mediaType: A
  
  var name: QCELP
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal(channels = 1, clockRate = 8000, mediaType = "A", name = "QCELP")
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setChannels(value: typings.rtpParser.rtpParserInts.`1`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setClockRate(value: `8000`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: A): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: QCELP): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
