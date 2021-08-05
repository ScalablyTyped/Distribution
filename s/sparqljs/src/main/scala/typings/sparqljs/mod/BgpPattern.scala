package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.bgp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BgpPattern
  extends StObject
     with Pattern
     with Quads
     with _Expression {
  
  var triples: js.Array[Triple]
  
  var `type`: bgp
}
object BgpPattern {
  
  inline def apply(triples: js.Array[Triple]): BgpPattern = {
    val __obj = js.Dynamic.literal(triples = triples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bgp")
    __obj.asInstanceOf[BgpPattern]
  }
  
  extension [Self <: BgpPattern](x: Self) {
    
    inline def setTriples(value: js.Array[Triple]): Self = StObject.set(x, "triples", value.asInstanceOf[js.Any])
    
    inline def setTriplesVarargs(value: Triple*): Self = StObject.set(x, "triples", js.Array(value :_*))
    
    inline def setType(value: bgp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
