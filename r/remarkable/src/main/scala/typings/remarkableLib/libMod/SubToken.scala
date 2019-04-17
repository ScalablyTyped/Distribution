package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait SubToken extends ContentToken {
  @JSName("content")
  var content_SubToken: java.lang.String
  @JSName("type")
  var type_SubToken: remarkableLib.remarkableLibStrings.sub
}

object SubToken {
  @scala.inline
  def apply(
    content: java.lang.String,
    level: scala.Double,
    `type`: remarkableLib.remarkableLibStrings.sub,
    block: js.UndefOr[scala.Boolean] = js.undefined,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): SubToken = {
    val __obj = js.Dynamic.literal(content = content, level = level)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[SubToken]
  }
}

