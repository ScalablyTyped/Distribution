package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait TRCloseToken extends TagToken {
  @JSName("type")
  var type_TRCloseToken: remarkableLib.remarkableLibStrings.tr_close
}

object TRCloseToken {
  @scala.inline
  def apply(
    level: scala.Double,
    `type`: remarkableLib.remarkableLibStrings.tr_close,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): TRCloseToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[TRCloseToken]
  }
}

