package typings.rtpParser.anon

import typings.rtpParser.rtpParserStrings.unassigned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  var name: unassigned
}
object `17` {
  
  inline def apply(): `17` = {
    val __obj = js.Dynamic.literal(name = "unassigned")
    __obj.asInstanceOf[`17`]
  }
  
  extension [Self <: `17`](x: Self) {
    
    inline def setName(value: unassigned): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
