package typings.rtpParser.anon

import typings.rtpParser.rtpParserNumbers.`8000`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.LPC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  var channels: typings.rtpParser.rtpParserNumbers.`1`
  
  var clockRate: `8000`
  
  var mediaType: A
  
  var name: LPC
}
object `13` {
  
  inline def apply(): `13` = {
    val __obj = js.Dynamic.literal(channels = 1, clockRate = 8000, mediaType = "A", name = "LPC")
    __obj.asInstanceOf[`13`]
  }
  
  extension [Self <: `13`](x: Self) {
    
    inline def setChannels(value: typings.rtpParser.rtpParserNumbers.`1`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setClockRate(value: `8000`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: A): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: LPC): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
