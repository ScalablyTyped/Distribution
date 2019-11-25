package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait CodeToken extends BlockContentToken {
  /**
    * Code: `true` if block, `false` if inline.
    */
  var block: Boolean
  @JSName("type")
  var type_CodeToken: code
}

object CodeToken {
  @scala.inline
  def apply(
    block: Boolean,
    level: Double,
    `type`: code,
    children: js.Array[Token] = null,
    content: String = null,
    lines: js.Tuple2[Double, Double] = null
  ): CodeToken = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeToken]
  }
}

