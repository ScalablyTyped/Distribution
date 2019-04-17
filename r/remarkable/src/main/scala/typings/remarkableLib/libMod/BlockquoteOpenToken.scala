package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait BlockquoteOpenToken extends TagToken {
  @JSName("type")
  var type_BlockquoteOpenToken: remarkableLib.remarkableLibStrings.blockquote_open
}

object BlockquoteOpenToken {
  @scala.inline
  def apply(
    level: scala.Double,
    `type`: remarkableLib.remarkableLibStrings.blockquote_open,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): BlockquoteOpenToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[BlockquoteOpenToken]
  }
}

