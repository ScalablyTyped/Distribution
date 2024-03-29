package typings.rtpParser.anon

import typings.rtpParser.rtpParserInts.`44100`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.L16
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  var channels: typings.rtpParser.rtpParserInts.`2`
  
  var clockRate: `44100`
  
  var mediaType: A
  
  var name: L16
}
object `10` {
  
  inline def apply(): `10` = {
    val __obj = js.Dynamic.literal(channels = 2, clockRate = 44100, mediaType = "A", name = "L16")
    __obj.asInstanceOf[`10`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `10`] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: typings.rtpParser.rtpParserInts.`2`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setClockRate(value: `44100`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: A): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: L16): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
