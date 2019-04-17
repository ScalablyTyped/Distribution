package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait TextToken extends TagToken {
  var content: js.UndefOr[java.lang.String] = js.undefined
  @JSName("type")
  var type_TextToken: remarkableLib.remarkableLibStrings.text
}

object TextToken {
  @scala.inline
  def apply(
    level: scala.Double,
    `type`: remarkableLib.remarkableLibStrings.text,
    content: java.lang.String = null,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): TextToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (content != null) __obj.updateDynamic("content")(content)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[TextToken]
  }
}

