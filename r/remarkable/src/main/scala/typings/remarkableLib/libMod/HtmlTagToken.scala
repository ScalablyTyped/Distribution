package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait HtmlTagToken extends ContentToken {
  @JSName("content")
  var content_HtmlTagToken: java.lang.String
  @JSName("type")
  var type_HtmlTagToken: remarkableLib.remarkableLibStrings.htmltag
}

object HtmlTagToken {
  @scala.inline
  def apply(
    content: java.lang.String,
    level: scala.Double,
    `type`: remarkableLib.remarkableLibStrings.htmltag,
    block: js.UndefOr[scala.Boolean] = js.undefined,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): HtmlTagToken = {
    val __obj = js.Dynamic.literal(content = content, level = level)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[HtmlTagToken]
  }
}

