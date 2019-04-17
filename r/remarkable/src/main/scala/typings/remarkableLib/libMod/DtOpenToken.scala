package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait DtOpenToken extends TagToken {
  @JSName("type")
  var type_DtOpenToken: remarkableLib.remarkableLibStrings.dt_open
}

object DtOpenToken {
  @scala.inline
  def apply(
    level: scala.Double,
    `type`: remarkableLib.remarkableLibStrings.dt_open,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): DtOpenToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[DtOpenToken]
  }
}

