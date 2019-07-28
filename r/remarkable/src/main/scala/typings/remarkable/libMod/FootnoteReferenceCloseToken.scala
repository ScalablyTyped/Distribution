package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_reference_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait FootnoteReferenceCloseToken extends FootnoteGenericToken {
  @JSName("type")
  var type_FootnoteReferenceCloseToken: footnote_reference_close
}

object FootnoteReferenceCloseToken {
  @scala.inline
  def apply(
    id: Double,
    level: Double,
    `type`: footnote_reference_close,
    lines: js.Tuple2[Double, Double] = null,
    subId: Int | Double = null
  ): FootnoteReferenceCloseToken = {
    val __obj = js.Dynamic.literal(id = id, level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    if (subId != null) __obj.updateDynamic("subId")(subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteReferenceCloseToken]
  }
}

