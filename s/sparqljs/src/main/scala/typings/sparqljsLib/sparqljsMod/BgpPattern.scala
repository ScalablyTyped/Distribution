package typings
package sparqljsLib.sparqljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BgpPattern
  extends Pattern
     with Quads
     with _Expression {
  var triples: js.Array[Triple]
  var `type`: sparqljsLib.sparqljsLibStrings.bgp
}

object BgpPattern {
  @scala.inline
  def apply(triples: js.Array[Triple], `type`: sparqljsLib.sparqljsLibStrings.bgp): BgpPattern = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("triples")(triples)
    __obj.asInstanceOf[BgpPattern]
  }
}

