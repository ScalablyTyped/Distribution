package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait ParagraphCloseToken extends ParagraphToken {
  @JSName("type")
  var type_ParagraphCloseToken: remarkableLib.remarkableLibStrings.paragraph_close
}

object ParagraphCloseToken {
  @scala.inline
  def apply(
    level: scala.Double,
    tight: scala.Boolean,
    `type`: remarkableLib.remarkableLibStrings.paragraph_close,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): ParagraphCloseToken = {
    val __obj = js.Dynamic.literal(level = level, tight = tight)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[ParagraphCloseToken]
  }
}

