package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait FootnoteInlineToken extends FootnoteGenericToken {
  @JSName("type")
  var type_FootnoteInlineToken: footnote_ref
}

object FootnoteInlineToken {
  @scala.inline
  def apply(
    id: Double,
    level: Double,
    `type`: footnote_ref,
    lines: js.Tuple2[Double, Double] = null,
    subId: js.UndefOr[Double] = js.undefined
  ): FootnoteInlineToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (!js.isUndefined(subId)) __obj.updateDynamic("subId")(subId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteInlineToken]
  }
}

