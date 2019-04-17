package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait AbbrOpenToken extends TagToken {
  /**
    * Abbreviation title.
    */
  var title: java.lang.String
  @JSName("type")
  var type_AbbrOpenToken: remarkableLib.remarkableLibStrings.abbr_open
}

object AbbrOpenToken {
  @scala.inline
  def apply(
    level: scala.Double,
    title: java.lang.String,
    `type`: remarkableLib.remarkableLibStrings.abbr_open,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): AbbrOpenToken = {
    val __obj = js.Dynamic.literal(level = level, title = title)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[AbbrOpenToken]
  }
}

