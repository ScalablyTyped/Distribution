package typings.rtpParser.anon

import typings.rtpParser.rtpParserInts.`90000`
import typings.rtpParser.rtpParserStrings.H261
import typings.rtpParser.rtpParserStrings.V
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaTypeName extends StObject {
  
  var clockRate: `90000`
  
  var mediaType: V
  
  var name: H261
}
object MediaTypeName {
  
  inline def apply(): MediaTypeName = {
    val __obj = js.Dynamic.literal(clockRate = 90000, mediaType = "V", name = "H261")
    __obj.asInstanceOf[MediaTypeName]
  }
  
  extension [Self <: MediaTypeName](x: Self) {
    
    inline def setClockRate(value: `90000`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: V): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: H261): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
