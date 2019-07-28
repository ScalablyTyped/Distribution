package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.list_item_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait ListItemCloseToken extends TagToken {
  @JSName("type")
  var type_ListItemCloseToken: list_item_close
}

object ListItemCloseToken {
  @scala.inline
  def apply(level: Double, `type`: list_item_close, lines: js.Tuple2[Double, Double] = null): ListItemCloseToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[ListItemCloseToken]
  }
}

