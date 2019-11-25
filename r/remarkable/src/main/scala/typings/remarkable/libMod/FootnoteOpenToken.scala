package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait FootnoteOpenToken extends FootnoteGenericToken {
  @JSName("type")
  var type_FootnoteOpenToken: footnote_open
}

object FootnoteOpenToken {
  @scala.inline
  def apply(
    id: Double,
    level: Double,
    `type`: footnote_open,
    lines: js.Tuple2[Double, Double] = null,
    subId: Int | Double = null
  ): FootnoteOpenToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (subId != null) __obj.updateDynamic("subId")(subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteOpenToken]
  }
}

