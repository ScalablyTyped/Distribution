package typings.rtpParser.anon

import typings.rtpParser.rtpParserInts.`90000`
import typings.rtpParser.rtpParserStrings.V
import typings.rtpParser.rtpParserStrings.nv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var clockRate: `90000`
  
  var mediaType: V
  
  var name: nv
}
object `12` {
  
  inline def apply(): `12` = {
    val __obj = js.Dynamic.literal(clockRate = 90000, mediaType = "V", name = "nv")
    __obj.asInstanceOf[`12`]
  }
  
  extension [Self <: `12`](x: Self) {
    
    inline def setClockRate(value: `90000`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: V): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: nv): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
