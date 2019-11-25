package typings.remarkable.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait ContentToken extends TagToken {
  /**
    * Is this a block element
    */
  var block: js.UndefOr[Boolean] = js.undefined
  /**
    * A text token has a `content` property. This is passed to
    * the corresponding renderer to be converted for output.
    */
  var content: js.UndefOr[js.Any] = js.undefined
}

object ContentToken {
  @scala.inline
  def apply(
    level: Double,
    `type`: String,
    block: js.UndefOr[Boolean] = js.undefined,
    content: js.Any = null,
    lines: js.Tuple2[Double, Double] = null
  ): ContentToken = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (lines != null) __obj.updateDynamic("lines")(lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentToken]
  }
}

