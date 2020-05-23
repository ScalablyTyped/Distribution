package typings.remarkable.libMod

import typings.remarkable.remarkableBooleans.`false`
import typings.remarkable.remarkableStrings.htmlblock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
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
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlBlockToken]
  }
}

