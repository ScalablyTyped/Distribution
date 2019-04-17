package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait FootnoteReferenceOpenToken extends FootnoteGenericToken {
  var label: java.lang.String
  @JSName("type")
  var type_FootnoteReferenceOpenToken: remarkableLib.remarkableLibStrings.footnote_reference_open
}

object FootnoteReferenceOpenToken {
  @scala.inline
  def apply(
    id: scala.Double,
    label: java.lang.String,
    level: scala.Double,
    `type`: remarkableLib.remarkableLibStrings.footnote_reference_open,
    lines: js.Tuple2[scala.Double, scala.Double] = null,
    subId: scala.Int | scala.Double = null
  ): FootnoteReferenceOpenToken = {
    val __obj = js.Dynamic.literal(id = id, label = label, level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    if (subId != null) __obj.updateDynamic("subId")(subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteReferenceOpenToken]
  }
}

