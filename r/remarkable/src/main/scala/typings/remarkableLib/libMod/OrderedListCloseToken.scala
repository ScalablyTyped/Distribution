package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait OrderedListCloseToken extends TagToken {
  @JSName("type")
  var type_OrderedListCloseToken: remarkableLib.remarkableLibStrings.ordered_list_close
}

object OrderedListCloseToken {
  @scala.inline
  def apply(
    level: scala.Double,
    `type`: remarkableLib.remarkableLibStrings.ordered_list_close,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): OrderedListCloseToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[OrderedListCloseToken]
  }
}

