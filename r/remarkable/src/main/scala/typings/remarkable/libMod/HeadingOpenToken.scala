package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.heading_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait HeadingOpenToken extends HeadingToken {
  @JSName("type")
  var type_HeadingOpenToken: heading_open
}

object HeadingOpenToken {
  @scala.inline
  def apply(hLevel: HeadingValue, level: Double, `type`: heading_open, lines: js.Tuple2[Double, Double] = null): HeadingOpenToken = {
    val __obj = js.Dynamic.literal(hLevel = hLevel.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadingOpenToken]
  }
}

