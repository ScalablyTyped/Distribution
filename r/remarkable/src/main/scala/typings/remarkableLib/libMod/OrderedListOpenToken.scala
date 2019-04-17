package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait OrderedListOpenToken extends TagToken {
  /**
    * Ordered list marker value.
    */
  var order: scala.Double
  @JSName("type")
  var type_OrderedListOpenToken: remarkableLib.remarkableLibStrings.ordered_list_open
}

object OrderedListOpenToken {
  @scala.inline
  def apply(
    level: scala.Double,
    order: scala.Double,
    `type`: remarkableLib.remarkableLibStrings.ordered_list_open,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): OrderedListOpenToken = {
    val __obj = js.Dynamic.literal(level = level, order = order)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[OrderedListOpenToken]
  }
}

