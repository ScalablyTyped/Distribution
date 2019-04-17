package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait TBodyOpenToken extends TagToken {
  @JSName("type")
  var type_TBodyOpenToken: remarkableLib.remarkableLibStrings.tbody_open
}

object TBodyOpenToken {
  @scala.inline
  def apply(
    level: scala.Double,
    `type`: remarkableLib.remarkableLibStrings.tbody_open,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): TBodyOpenToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[TBodyOpenToken]
  }
}

