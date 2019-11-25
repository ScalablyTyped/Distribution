package typings.sparqljs.sparqljsMod

import typings.sparqljs.sparqljsStrings.bgp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BgpPattern
  extends Pattern
     with Quads
     with _Expression {
  var triples: js.Array[Triple]
  var `type`: bgp
}

object BgpPattern {
  @scala.inline
  def apply(triples: js.Array[Triple], `type`: bgp): BgpPattern = {
    val __obj = js.Dynamic.literal(triples = triples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BgpPattern]
  }
}

