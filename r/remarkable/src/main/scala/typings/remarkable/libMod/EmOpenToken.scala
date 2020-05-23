package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.em_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait EmOpenToken extends TagToken {
  @JSName("type")
  var type_EmOpenToken: em_open
}

object EmOpenToken {
  @scala.inline
  def apply(level: Double, `type`: em_open, lines: js.Tuple2[Double, Double] = null): EmOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmOpenToken]
  }
}

