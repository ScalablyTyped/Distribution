package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.th_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait THOpenToken extends TagToken {
  @JSName("type")
  var type_THOpenToken: th_open
}

object THOpenToken {
  @scala.inline
  def apply(level: Double, `type`: th_open, lines: js.Tuple2[Double, Double] = null): THOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[THOpenToken]
  }
}

