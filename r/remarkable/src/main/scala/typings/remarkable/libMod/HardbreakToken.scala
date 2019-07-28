package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.hardbreak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait HardbreakToken extends TagToken {
  @JSName("type")
  var type_HardbreakToken: hardbreak
}

object HardbreakToken {
  @scala.inline
  def apply(level: Double, `type`: hardbreak, lines: js.Tuple2[Double, Double] = null): HardbreakToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[HardbreakToken]
  }
}

