package typings.rtpParser.anon

import typings.rtpParser.rtpParserInts.`90000`
import typings.rtpParser.rtpParserStrings.AV
import typings.rtpParser.rtpParserStrings.MP2T
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaType extends StObject {
  
  var clockRate: `90000`
  
  var mediaType: AV
  
  var name: MP2T
}
object MediaType {
  
  inline def apply(): MediaType = {
    val __obj = js.Dynamic.literal(clockRate = 90000, mediaType = "AV", name = "MP2T")
    __obj.asInstanceOf[MediaType]
  }
  
  extension [Self <: MediaType](x: Self) {
    
    inline def setClockRate(value: `90000`): Self = StObject.set(x, "clockRate", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: AV): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: MP2T): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
