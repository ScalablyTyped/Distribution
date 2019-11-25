package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.mark_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait MarkCloseToken extends TagToken {
  @JSName("type")
  var type_MarkCloseToken: mark_close
}

object MarkCloseToken {
  @scala.inline
  def apply(level: Double, `type`: mark_close, lines: js.Tuple2[Double, Double] = null): MarkCloseToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkCloseToken]
  }
}

