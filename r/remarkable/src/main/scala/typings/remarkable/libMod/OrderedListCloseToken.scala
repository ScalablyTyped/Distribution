package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.ordered_list_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait OrderedListCloseToken extends TagToken {
  @JSName("type")
  var type_OrderedListCloseToken: ordered_list_close
}

object OrderedListCloseToken {
  @scala.inline
  def apply(level: Double, `type`: ordered_list_close, lines: js.Tuple2[Double, Double] = null): OrderedListCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderedListCloseToken]
  }
}

