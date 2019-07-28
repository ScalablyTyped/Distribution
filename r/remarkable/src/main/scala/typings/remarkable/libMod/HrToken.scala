package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.hr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait HrToken extends TagToken {
  @JSName("type")
  var type_HrToken: hr
}

object HrToken {
  @scala.inline
  def apply(level: Double, `type`: hr, lines: js.Tuple2[Double, Double] = null): HrToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[HrToken]
  }
}

