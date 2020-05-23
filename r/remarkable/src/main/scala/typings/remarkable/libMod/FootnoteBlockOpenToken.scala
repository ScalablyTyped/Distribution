package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_block_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait FootnoteBlockOpenToken extends TagToken {
  @JSName("type")
  var type_FootnoteBlockOpenToken: footnote_block_open
}

object FootnoteBlockOpenToken {
  @scala.inline
  def apply(level: Double, `type`: footnote_block_open, lines: js.Tuple2[Double, Double] = null): FootnoteBlockOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteBlockOpenToken]
  }
}

