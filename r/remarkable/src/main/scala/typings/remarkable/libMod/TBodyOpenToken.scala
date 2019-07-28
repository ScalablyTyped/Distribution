package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.tbody_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait TBodyOpenToken extends TagToken {
  @JSName("type")
  var type_TBodyOpenToken: tbody_open
}

object TBodyOpenToken {
  @scala.inline
  def apply(level: Double, `type`: tbody_open, lines: js.Tuple2[Double, Double] = null): TBodyOpenToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[TBodyOpenToken]
  }
}

