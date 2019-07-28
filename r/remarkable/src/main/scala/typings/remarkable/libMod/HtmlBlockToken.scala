package typings.remarkable.libMod

import typings.remarkable.remarkableNumbers.`false`
import typings.remarkable.remarkableStrings.htmlblock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait HtmlBlockToken extends ContentToken {
  @JSName("block")
  var block_HtmlBlockToken: `false`
  @JSName("content")
  var content_HtmlBlockToken: String
  @JSName("type")
  var type_HtmlBlockToken: htmlblock
}

object HtmlBlockToken {
  @scala.inline
  def apply(
    block: `false`,
    content: String,
    level: Double,
    `type`: htmlblock,
    lines: js.Tuple2[Double, Double] = null
  ): HtmlBlockToken = {
    val __obj = js.Dynamic.literal(block = block, content = content, level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[HtmlBlockToken]
  }
}

