package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.em_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait EmCloseToken extends TagToken {
  @JSName("type")
  var type_EmCloseToken: em_close
}

object EmCloseToken {
  @scala.inline
  def apply(level: Double, `type`: em_close, lines: js.Tuple2[Double, Double] = null): EmCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmCloseToken]
  }
}

