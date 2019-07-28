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
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[EmCloseToken]
  }
}

