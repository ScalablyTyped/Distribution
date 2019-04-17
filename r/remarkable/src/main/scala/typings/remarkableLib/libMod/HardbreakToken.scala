package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait HardbreakToken extends TagToken {
  @JSName("type")
  var type_HardbreakToken: remarkableLib.remarkableLibStrings.hardbreak
}

object HardbreakToken {
  @scala.inline
  def apply(
    level: scala.Double,
    `type`: remarkableLib.remarkableLibStrings.hardbreak,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): HardbreakToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[HardbreakToken]
  }
}

