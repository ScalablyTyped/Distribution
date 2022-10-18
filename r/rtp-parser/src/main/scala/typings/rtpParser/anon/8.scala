package typings.rtpParser.anon

import typings.rtpParser.rtpParserStrings.A
import typings.rtpParser.rtpParserStrings.unassigned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var mediaType: A
  
  var name: unassigned
}
object `8` {
  
  inline def apply(): `8` = {
    val __obj = js.Dynamic.literal(mediaType = "A", name = "unassigned")
    __obj.asInstanceOf[`8`]
  }
  
  extension [Self <: `8`](x: Self) {
    
    inline def setMediaType(value: A): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: unassigned): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
