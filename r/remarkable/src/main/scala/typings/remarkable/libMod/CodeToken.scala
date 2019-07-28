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
    val __obj = js.Dynamic.literal(block = block, level = level)
    __obj.updateDynamic("type")(`type`)
    if (children != null) __obj.updateDynamic("children")(children)
    if (content != null) __obj.updateDynamic("content")(content)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[CodeToken]
  }
}

