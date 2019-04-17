package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait HtmlBlockToken extends ContentToken {
  @JSName("block")
  var block_HtmlBlockToken: remarkableLib.remarkableLibNumbers.`false`
  @JSName("content")
  var content_HtmlBlockToken: java.lang.String
  @JSName("type")
  var type_HtmlBlockToken: remarkableLib.remarkableLibStrings.htmlblock
}

object HtmlBlockToken {
  @scala.inline
  def apply(
    block: remarkableLib.remarkableLibNumbers.`false`,
    content: java.lang.String,
    level: scala.Double,
    `type`: remarkableLib.remarkableLibStrings.htmlblock,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): HtmlBlockToken = {
    val __obj = js.Dynamic.literal(block = block, content = content, level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[HtmlBlockToken]
  }
}

