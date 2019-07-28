package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.table_close
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait TableCloseToken extends TagToken {
  @JSName("type")
  var type_TableCloseToken: table_close
}

object TableCloseToken {
  @scala.inline
  def apply(level: Double, `type`: table_close, lines: js.Tuple2[Double, Double] = null): TableCloseToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[TableCloseToken]
  }
}

