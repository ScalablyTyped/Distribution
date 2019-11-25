package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_block_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait FootnoteBlockCloseToken extends TagToken {
  @JSName("type")
  var type_FootnoteBlockCloseToken: footnote_block_close
}

object FootnoteBlockCloseToken {
  @scala.inline
  def apply(level: Double, `type`: footnote_block_close, lines: js.Tuple2[Double, Double] = null): FootnoteBlockCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteBlockCloseToken]
  }
}

