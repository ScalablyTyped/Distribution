package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_reference_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait FootnoteReferenceOpenToken extends FootnoteGenericToken {
  var label: String
  @JSName("type")
  var type_FootnoteReferenceOpenToken: footnote_reference_open
}

object FootnoteReferenceOpenToken {
  @scala.inline
  def apply(
    id: Double,
    label: String,
    level: Double,
    `type`: footnote_reference_open,
    lines: js.Tuple2[Double, Double] = null,
    subId: Int | Double = null
  ): FootnoteReferenceOpenToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (subId != null) __obj.updateDynamic("subId")(subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteReferenceOpenToken]
  }
}

