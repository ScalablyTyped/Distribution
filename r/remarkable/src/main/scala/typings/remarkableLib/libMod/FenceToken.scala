package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait FenceToken extends ContentToken {
  @JSName("block")
  var block_FenceToken: js.UndefOr[remarkableLib.remarkableLibNumbers.`false`] = js.undefined
  @JSName("content")
  var content_FenceToken: java.lang.String
  /**
    * Fenced block params.
    */
  var params: java.lang.String
  @JSName("type")
  var type_FenceToken: remarkableLib.remarkableLibStrings.fence
}

object FenceToken {
  @scala.inline
  def apply(
    content: java.lang.String,
    level: scala.Double,
    params: java.lang.String,
    `type`: remarkableLib.remarkableLibStrings.fence,
    block: remarkableLib.remarkableLibNumbers.`false` = null,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): FenceToken = {
    val __obj = js.Dynamic.literal(content = content, level = level, params = params)
    __obj.updateDynamic("type")(`type`)
    if (block != null) __obj.updateDynamic("block")(block)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[FenceToken]
  }
}

