package typings.sparqljs.mod

import typings.sparqljs.sparqljsStrings.bgp
import typings.sparqljs.sparqljsStrings.graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.sparqljs.mod.BgpPattern
  - typings.sparqljs.mod.GraphQuads
*/
trait Quads extends js.Object
object Quads {
  
  @scala.inline
  def BgpPattern(triples: js.Array[Triple], `type`: bgp): Quads = {
    val __obj = js.Dynamic.literal(triples = triples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quads]
  }
  
  @scala.inline
  def GraphQuads(name: IriTerm, triples: js.Array[Triple], `type`: graph): Quads = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], triples = triples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quads]
  }
}
