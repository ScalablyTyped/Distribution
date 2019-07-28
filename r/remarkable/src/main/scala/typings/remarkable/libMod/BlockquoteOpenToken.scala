package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.blockquote_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait BlockquoteOpenToken extends TagToken {
  @JSName("type")
  var type_BlockquoteOpenToken: blockquote_open
}

object BlockquoteOpenToken {
  @scala.inline
  def apply(level: Double, `type`: blockquote_open, lines: js.Tuple2[Double, Double] = null): BlockquoteOpenToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[BlockquoteOpenToken]
  }
}

