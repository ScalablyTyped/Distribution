package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.sup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait SupToken extends ContentToken {
  @JSName("content")
  var content_SupToken: String
  @JSName("type")
  var type_SupToken: sup
}

object SupToken {
  @scala.inline
  def apply(
    content: String,
    level: Double,
    `type`: sup,
    block: js.UndefOr[Boolean] = js.undefined,
    lines: js.Tuple2[Double, Double] = null
  ): SupToken = {
    val __obj = js.Dynamic.literal(content = content, level = level)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[SupToken]
  }
}

