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
    val __obj = js.Dynamic.literal(level = level, title = title)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[AbbrOpenToken]
  }
}

