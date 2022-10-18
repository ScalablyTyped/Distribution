package typings.rtpParser.anon

import typings.rtpParser.rtpParserStrings.V
import typings.rtpParser.rtpParserStrings.unassigned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  var mediaType: V
  
  var name: unassigned
}
object `9` {
  
  inline def apply(): `9` = {
    val __obj = js.Dynamic.literal(mediaType = "V", name = "unassigned")
    __obj.asInstanceOf[`9`]
  }
  
  extension [Self <: `9`](x: Self) {
    
    inline def setMediaType(value: V): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setName(value: unassigned): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
