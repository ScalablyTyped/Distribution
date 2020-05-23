package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.del_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait DelCloseToken extends TagToken {
  @JSName("type")
  var type_DelCloseToken: del_open
}

object DelCloseToken {
  @scala.inline
  def apply(level: Double, `type`: del_open, lines: js.Tuple2[Double, Double] = null): DelCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelCloseToken]
  }
}

