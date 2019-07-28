package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.dd_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait DdCloseToken extends TagToken {
  @JSName("type")
  var type_DdCloseToken: dd_close
}

object DdCloseToken {
  @scala.inline
  def apply(level: Double, `type`: dd_close, lines: js.Tuple2[Double, Double] = null): DdCloseToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[DdCloseToken]
  }
}

