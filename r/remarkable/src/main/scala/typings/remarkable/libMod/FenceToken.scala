package typings.remarkable.libMod

import typings.remarkable.remarkableNumbers.`false`
import typings.remarkable.remarkableStrings.fence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait FenceToken extends ContentToken {
  @JSName("block")
  var block_FenceToken: js.UndefOr[`false`] = js.undefined
  @JSName("content")
  var content_FenceToken: String
  /**
    * Fenced block params.
    */
  var params: String
  @JSName("type")
  var type_FenceToken: fence
}

object FenceToken {
  @scala.inline
  def apply(
    content: String,
    level: Double,
    params: String,
    `type`: fence,
    block: `false` = null,
    lines: js.Tuple2[Double, Double] = null
  ): FenceToken = {
    val __obj = js.Dynamic.literal(content = content, level = level, params = params)
    __obj.updateDynamic("type")(`type`)
    if (block != null) __obj.updateDynamic("block")(block)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[FenceToken]
  }
}

