package typings.rtpParser.anon

import typings.rtpParser.rtpParserInts.`8000`
import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.G723
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `16` extends StObject {
  
  var channels: typings.rtpParser.rtpParserInts.`1`
  
  var clockRate: `8000`
  
  var mediaType: A
  
  var name: G723
}
object `16` {
  
  inline def apply(): `16` = {
    val __obj = js.Dynamic.literal(channels = 1, clockRate = 8000, mediaType = "A", name = "G723")
    __obj.asInstanceOf[`16`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `16`] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: typings.rtpParser.rtpParserInts.`1`): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setClockRate(value: `8000`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: A): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: G723): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
