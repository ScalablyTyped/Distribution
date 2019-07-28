package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.abbr_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait AbbrCloseToken extends TagToken {
  @JSName("type")
  var type_AbbrCloseToken: abbr_close
}

object AbbrCloseToken {
  @scala.inline
  def apply(level: Double, `type`: abbr_close, lines: js.Tuple2[Double, Double] = null): AbbrCloseToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[AbbrCloseToken]
  }
}

