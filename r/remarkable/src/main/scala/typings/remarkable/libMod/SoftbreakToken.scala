package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.softbreak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait SoftbreakToken extends TagToken {
  @JSName("type")
  var type_SoftbreakToken: softbreak
}

object SoftbreakToken {
  @scala.inline
  def apply(level: Double, `type`: softbreak, lines: js.Tuple2[Double, Double] = null): SoftbreakToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoftbreakToken]
  }
}

