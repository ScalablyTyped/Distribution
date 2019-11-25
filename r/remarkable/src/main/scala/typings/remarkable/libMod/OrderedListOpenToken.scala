package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.ordered_list_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait OrderedListOpenToken extends TagToken {
  /**
    * Ordered list marker value.
    */
  var order: Double
  @JSName("type")
  var type_OrderedListOpenToken: ordered_list_open
}

object OrderedListOpenToken {
  @scala.inline
  def apply(level: Double, order: Double, `type`: ordered_list_open, lines: js.Tuple2[Double, Double] = null): OrderedListOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderedListOpenToken]
  }
}

