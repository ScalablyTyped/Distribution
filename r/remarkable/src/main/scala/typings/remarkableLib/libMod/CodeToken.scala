package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait CodeToken extends BlockContentToken {
  /**
    * Code: `true` if block, `false` if inline.
    */
  var block: scala.Boolean
  @JSName("type")
  var type_CodeToken: remarkableLib.remarkableLibStrings.code
}

object CodeToken {
  @scala.inline
  def apply(
    block: scala.Boolean,
    level: scala.Double,
    `type`: remarkableLib.remarkableLibStrings.code,
    children: js.Array[Token] = null,
    content: java.lang.String = null,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): CodeToken = {
    val __obj = js.Dynamic.literal(block = block, level = level)
    __obj.updateDynamic("type")(`type`)
    if (children != null) __obj.updateDynamic("children")(children)
    if (content != null) __obj.updateDynamic("content")(content)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[CodeToken]
  }
}

