package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.sub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait SubToken extends ContentToken {
  @JSName("content")
  var content_SubToken: String
  @JSName("type")
  var type_SubToken: sub
}

object SubToken {
  @scala.inline
  def apply(
    content: String,
    level: Double,
    `type`: sub,
    block: js.UndefOr[Boolean] = js.undefined,
    lines: js.Tuple2[Double, Double] = null
  ): SubToken = {
    val __obj = js.Dynamic.literal(content = content, level = level)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[SubToken]
  }
}

