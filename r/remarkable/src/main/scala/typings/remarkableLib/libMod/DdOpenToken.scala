package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait DdOpenToken extends TagToken {
  @JSName("type")
  var type_DdOpenToken: remarkableLib.remarkableLibStrings.dd_open
}

object DdOpenToken {
  @scala.inline
  def apply(
    level: scala.Double,
    `type`: remarkableLib.remarkableLibStrings.dd_open,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): DdOpenToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[DdOpenToken]
  }
}

