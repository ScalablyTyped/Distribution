package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.thead_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait THeadOpenToken extends TagToken {
  @JSName("type")
  var type_THeadOpenToken: thead_open
}

object THeadOpenToken {
  @scala.inline
  def apply(level: Double, `type`: thead_open, lines: js.Tuple2[Double, Double] = null): THeadOpenToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[THeadOpenToken]
  }
}

