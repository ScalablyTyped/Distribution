package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait HeadingCloseToken extends HeadingToken {
  @JSName("type")
  var type_HeadingCloseToken: remarkableLib.remarkableLibStrings.heading_close
}

object HeadingCloseToken {
  @scala.inline
  def apply(
    hLevel: HeadingValue,
    level: scala.Double,
    `type`: remarkableLib.remarkableLibStrings.heading_close,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): HeadingCloseToken = {
    val __obj = js.Dynamic.literal(hLevel = hLevel, level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[HeadingCloseToken]
  }
}

