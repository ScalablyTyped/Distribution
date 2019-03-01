package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQuads extends Quads {
  var name: Term
  var triples: js.Array[Triple]
  var `type`: sparqljsLib.sparqljsLibStrings.graph
}

object GraphQuads {
  @scala.inline
  def apply(name: Term, triples: js.Array[Triple], `type`: sparqljsLib.sparqljsLibStrings.graph): GraphQuads = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("triples")(triples)
    __obj.asInstanceOf[GraphQuads]
  }
}

