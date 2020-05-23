package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.tbody_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait TBodyOpenToken extends TagToken {
  @JSName("type")
  var type_TBodyOpenToken: tbody_open
}

object TBodyOpenToken {
  @scala.inline
  def apply(level: Double, `type`: tbody_open, lines: js.Tuple2[Double, Double] = null): TBodyOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[TBodyOpenToken]
  }
}

