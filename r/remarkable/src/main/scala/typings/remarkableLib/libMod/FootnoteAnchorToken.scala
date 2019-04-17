package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait FootnoteAnchorToken extends FootnoteGenericToken {
  @JSName("type")
  var type_FootnoteAnchorToken: remarkableLib.remarkableLibStrings.footnote_anchor
}

object FootnoteAnchorToken {
  @scala.inline
  def apply(
    id: scala.Double,
    level: scala.Double,
    `type`: remarkableLib.remarkableLibStrings.footnote_anchor,
    lines: js.Tuple2[scala.Double, scala.Double] = null,
    subId: scala.Int | scala.Double = null
  ): FootnoteAnchorToken = {
    val __obj = js.Dynamic.literal(id = id, level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    if (subId != null) __obj.updateDynamic("subId")(subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteAnchorToken]
  }
}

