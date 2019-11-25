package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.list_item_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait ListItemOpenToken extends TagToken {
  @JSName("type")
  var type_ListItemOpenToken: list_item_open
}

object ListItemOpenToken {
  @scala.inline
  def apply(level: Double, `type`: list_item_open, lines: js.Tuple2[Double, Double] = null): ListItemOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemOpenToken]
  }
}

