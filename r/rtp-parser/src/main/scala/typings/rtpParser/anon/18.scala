package typings.rtpParser.anon

import typings.rtpParser.rtpParserStrings.reserved
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  var name: reserved
}
object `18` {
  
  inline def apply(): `18` = {
    val __obj = js.Dynamic.literal(name = "reserved")
    __obj.asInstanceOf[`18`]
  }
  
  extension [Self <: `18`](x: Self) {
    
    inline def setName(value: reserved): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
