package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait TextToken extends TagToken {
  var content: js.UndefOr[String] = js.undefined
  @JSName("type")
  var type_TextToken: text
}

object TextToken {
  @scala.inline
  def apply(level: Double, `type`: text, content: String = null, lines: js.Tuple2[Double, Double] = null): TextToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (content != null) __obj.updateDynamic("content")(content)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[TextToken]
  }
}

