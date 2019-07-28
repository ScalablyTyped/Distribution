package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.footnote_block_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait FootnoteBlockOpenToken extends TagToken {
  @JSName("type")
  var type_FootnoteBlockOpenToken: footnote_block_open
}

object FootnoteBlockOpenToken {
  @scala.inline
  def apply(level: Double, `type`: footnote_block_open, lines: js.Tuple2[Double, Double] = null): FootnoteBlockOpenToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[FootnoteBlockOpenToken]
  }
}

