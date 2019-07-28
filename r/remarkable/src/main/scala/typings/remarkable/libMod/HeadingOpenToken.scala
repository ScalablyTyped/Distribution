package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.heading_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait HeadingOpenToken extends HeadingToken {
  @JSName("type")
  var type_HeadingOpenToken: heading_open
}

object HeadingOpenToken {
  @scala.inline
  def apply(hLevel: HeadingValue, level: Double, `type`: heading_open, lines: js.Tuple2[Double, Double] = null): HeadingOpenToken = {
    val __obj = js.Dynamic.literal(hLevel = hLevel, level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[HeadingOpenToken]
  }
}

