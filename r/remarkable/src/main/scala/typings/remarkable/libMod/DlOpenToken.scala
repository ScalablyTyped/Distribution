package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.dl_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait DlOpenToken extends TagToken {
  @JSName("type")
  var type_DlOpenToken: dl_open
}

object DlOpenToken {
  @scala.inline
  def apply(level: Double, `type`: dl_open, lines: js.Tuple2[Double, Double] = null): DlOpenToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[DlOpenToken]
  }
}

