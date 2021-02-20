package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.bgp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BgpPattern
  extends Pattern
     with Quads
     with _Expression {
  
  var triples: js.Array[Triple] = js.native
  
  var `type`: bgp = js.native
}
object BgpPattern {
  
  @scala.inline
  def apply(triples: js.Array[Triple], `type`: bgp): BgpPattern = {
    val __obj = js.Dynamic.literal(triples = triples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BgpPattern]
  }
  
  @scala.inline
  implicit class BgpPatternMutableBuilder[Self <: BgpPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTriples(value: js.Array[Triple]): Self = StObject.set(x, "triples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriplesVarargs(value: Triple*): Self = StObject.set(x, "triples", js.Array(value :_*))
    
    @scala.inline
    def setType(value: bgp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
