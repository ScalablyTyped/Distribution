package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait FootnoteCloseToken extends FootnoteGenericToken {
  @JSName("type")
  var type_FootnoteCloseToken: footnote_close
}

object FootnoteCloseToken {
  @scala.inline
  def apply(
    id: Double,
    level: Double,
    `type`: footnote_close,
    lines: js.Tuple2[Double, Double] = null,
    subId: js.UndefOr[Double] = js.undefined
  ): FootnoteCloseToken = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    if (!js.isUndefined(subId)) __obj.updateDynamic("subId")(subId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteCloseToken]
  }
}

