package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait FootnoteGenericToken extends TagToken {
  /**
    * Footnote id.
    */
  var id: scala.Double
  /**
    * Footnote sub id.
    */
  var subId: js.UndefOr[scala.Double] = js.undefined
}

object FootnoteGenericToken {
  @scala.inline
  def apply(
    id: scala.Double,
    level: scala.Double,
    `type`: java.lang.String,
    lines: js.Tuple2[scala.Double, scala.Double] = null,
    subId: scala.Int | scala.Double = null
  ): FootnoteGenericToken = {
    val __obj = js.Dynamic.literal(id = id, level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    if (subId != null) __obj.updateDynamic("subId")(subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteGenericToken]
  }
}

