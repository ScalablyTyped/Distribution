package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait ParagraphToken extends TagToken {
  /**
    * Absence of empty line before current tag: `true` if absent, `false`
    * if present. List is tight if any list item is tight.
    */
  var tight: scala.Boolean
}

object ParagraphToken {
  @scala.inline
  def apply(
    level: scala.Double,
    tight: scala.Boolean,
    `type`: java.lang.String,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): ParagraphToken = {
    val __obj = js.Dynamic.literal(level = level, tight = tight)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[ParagraphToken]
  }
}

