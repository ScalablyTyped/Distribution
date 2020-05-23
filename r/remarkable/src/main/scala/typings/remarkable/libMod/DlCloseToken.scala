package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.dl_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait DlCloseToken extends TagToken {
  @JSName("type")
  var type_DlCloseToken: dl_close
}

object DlCloseToken {
  @scala.inline
  def apply(level: Double, `type`: dl_close, lines: js.Tuple2[Double, Double] = null): DlCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[DlCloseToken]
  }
}

