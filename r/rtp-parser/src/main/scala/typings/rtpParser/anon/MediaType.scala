package typings.rtpParser.anon

import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.reserved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaType extends StObject {
  
  var mediaType: A
  
  var name: reserved
}
object MediaType {
  
  inline def apply(): MediaType = {
    val __obj = js.Dynamic.literal(mediaType = "A", name = "reserved")
    __obj.asInstanceOf[MediaType]
  }
  
  extension [Self <: MediaType](x: Self) {
    
    inline def setMediaType(value: A): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: reserved): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
