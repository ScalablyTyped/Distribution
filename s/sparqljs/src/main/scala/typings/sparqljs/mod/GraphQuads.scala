package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.graph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQuads
  extends StObject
     with Quads {
  
  var name: IriTerm
  
  var triples: js.Array[Triple]
  
  var `type`: graph
}
object GraphQuads {
  
  @scala.inline
  def apply(name: IriTerm, triples: js.Array[Triple]): GraphQuads = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], triples = triples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("graph")
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
