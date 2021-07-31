package typings.sparqljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.sparqljs.mod.BgpPattern
  - typings.sparqljs.mod.GraphQuads
*/
trait Quads extends StObject
object Quads {
  
  @scala.inline
  def BgpPattern(triples: js.Array[Triple]): typings.sparqljs.mod.BgpPattern = {
    val __obj = js.Dynamic.literal(triples = triples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("bgp")
    __obj.asInstanceOf[typings.sparqljs.mod.BgpPattern]
  }
  
  @scala.inline
  def GraphQuads(name: IriTerm, triples: js.Array[Triple]): typings.sparqljs.mod.GraphQuads = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], triples = triples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("graph")
    __obj.asInstanceOf[typings.sparqljs.mod.GraphQuads]
  }
}
