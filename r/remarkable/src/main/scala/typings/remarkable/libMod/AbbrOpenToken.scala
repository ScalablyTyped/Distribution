package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.abbr_open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait AbbrOpenToken extends TagToken {
  /**
    * Abbreviation title.
    */
  var title: String
  @JSName("type")
  var type_AbbrOpenToken: abbr_open
}

object AbbrOpenToken {
  @scala.inline
  def apply(level: Double, title: String, `type`: abbr_open, lines: js.Tuple2[Double, Double] = null): AbbrOpenToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbbrOpenToken]
  }
}

