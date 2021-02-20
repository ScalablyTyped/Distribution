package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.graph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQuads extends Quads {
  
  var name: IriTerm = js.native
  
  var triples: js.Array[Triple] = js.native
  
  var `type`: graph = js.native
}
object GraphQuads {
  
  @scala.inline
  def apply(name: IriTerm, triples: js.Array[Triple], `type`: graph): GraphQuads = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], triples = triples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQuads]
  }
  
  @scala.inline
  implicit class GraphQuadsMutableBuilder[Self <: GraphQuads] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: IriTerm): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriples(value: js.Array[Triple]): Self = StObject.set(x, "triples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriplesVarargs(value: Triple*): Self = StObject.set(x, "triples", js.Array(value :_*))
    
    @scala.inline
    def setType(value: graph): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
