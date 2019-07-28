package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.table_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait TableOpenToken extends TagToken {
  @JSName("type")
  var type_TableOpenToken: table_open
}

object TableOpenToken {
  @scala.inline
  def apply(level: Double, `type`: table_open, lines: js.Tuple2[Double, Double] = null): TableOpenToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[TableOpenToken]
  }
}

