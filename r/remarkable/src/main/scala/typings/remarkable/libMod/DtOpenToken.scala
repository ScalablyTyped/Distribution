package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.dt_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait DtOpenToken extends TagToken {
  @JSName("type")
  var type_DtOpenToken: dt_open
}

object DtOpenToken {
  @scala.inline
  def apply(level: Double, `type`: dt_open, lines: js.Tuple2[Double, Double] = null): DtOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[DtOpenToken]
  }
}

