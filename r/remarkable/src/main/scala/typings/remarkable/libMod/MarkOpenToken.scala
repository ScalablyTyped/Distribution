package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.mark_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait MarkOpenToken extends TagToken {
  @JSName("type")
  var type_MarkOpenToken: mark_open
}

object MarkOpenToken {
  @scala.inline
  def apply(level: Double, `type`: mark_open, lines: js.Tuple2[Double, Double] = null): MarkOpenToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[MarkOpenToken]
  }
}

