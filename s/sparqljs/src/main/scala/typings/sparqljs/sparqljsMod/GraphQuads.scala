package typings.sparqljs.sparqljsMod

import typings.sparqljs.sparqljsStrings.graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQuads extends Quads {
  var name: Term
  var triples: js.Array[Triple]
  var `type`: graph
}

object GraphQuads {
  @scala.inline
  def apply(name: Term, triples: js.Array[Triple], `type`: graph): GraphQuads = {
    val __obj = js.Dynamic.literal(name = name, triples = triples)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GraphQuads]
  }
}

