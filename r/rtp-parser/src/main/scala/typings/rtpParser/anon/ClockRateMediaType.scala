package typings.rtpParser.anon

import typings.rtpParser.rtpParserInts.`90000`
import typings.rtpParser.rtpParserStrings.MPV
import typings.rtpParser.rtpParserStrings.V
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClockRateMediaType extends StObject {
  
  var clockRate: `90000`
  
  var mediaType: V
  
  var name: MPV
}
object ClockRateMediaType {
  
  inline def apply(): ClockRateMediaType = {
    val __obj = js.Dynamic.literal(clockRate = 90000, mediaType = "V", name = "MPV")
    __obj.asInstanceOf[ClockRateMediaType]
  }
  
  extension [Self <: ClockRateMediaType](x: Self) {
    
    inline def setClockRate(value: `90000`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: V): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: MPV): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
