package typings.rtpParser.anon

import typings.rtpParser.rtpParserInts.`44100`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.L16
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  var channels: typings.rtpParser.rtpParserInts.`1`
  
  var clockRate: `44100`
  
  var mediaType: A
  
  var name: L16
}
object `9` {
  
  inline def apply(): `9` = {
    val __obj = js.Dynamic.literal(channels = 1, clockRate = 44100, mediaType = "A", name = "L16")
    __obj.asInstanceOf[`9`]
  }
  
  extension [Self <: `9`](x: Self) {
    
    inline def setChannels(value: typings.rtpParser.rtpParserInts.`1`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setClockRate(value: `44100`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: A): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: L16): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
