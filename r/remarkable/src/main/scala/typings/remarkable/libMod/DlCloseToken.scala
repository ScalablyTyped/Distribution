package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.dl_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait DlCloseToken extends TagToken {
  @JSName("type")
  var type_DlCloseToken: dl_close
}

object DlCloseToken {
  @scala.inline
  def apply(level: Double, `type`: dl_close, lines: js.Tuple2[Double, Double] = null): DlCloseToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[DlCloseToken]
  }
}

