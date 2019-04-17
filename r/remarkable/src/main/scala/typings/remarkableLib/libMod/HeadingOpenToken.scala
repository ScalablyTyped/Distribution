package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait HeadingOpenToken extends HeadingToken {
  @JSName("type")
  var type_HeadingOpenToken: remarkableLib.remarkableLibStrings.heading_open
}

object HeadingOpenToken {
  @scala.inline
  def apply(
    hLevel: HeadingValue,
    level: scala.Double,
    `type`: remarkableLib.remarkableLibStrings.heading_open,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): HeadingOpenToken = {
    val __obj = js.Dynamic.literal(hLevel = hLevel, level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[HeadingOpenToken]
  }
}

