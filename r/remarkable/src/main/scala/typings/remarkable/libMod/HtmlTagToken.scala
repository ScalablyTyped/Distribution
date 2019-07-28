package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.htmltag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait HtmlTagToken extends ContentToken {
  @JSName("content")
  var content_HtmlTagToken: String
  @JSName("type")
  var type_HtmlTagToken: htmltag
}

object HtmlTagToken {
  @scala.inline
  def apply(
    content: String,
    level: Double,
    `type`: htmltag,
    block: js.UndefOr[Boolean] = js.undefined,
    lines: js.Tuple2[Double, Double] = null
  ): HtmlTagToken = {
    val __obj = js.Dynamic.literal(content = content, level = level)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[HtmlTagToken]
  }
}

