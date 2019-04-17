package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- remarkableLib.libMod._Token because Already inherited */ trait ContentToken extends TagToken {
  /**
    * Is this a block element
    */
  var block: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A text token has a `content` property. This is passed to
    * the corresponding renderer to be converted for output.
    */
  var content: js.UndefOr[js.Any] = js.undefined
}

object ContentToken {
  @scala.inline
  def apply(
    level: scala.Double,
    `type`: java.lang.String,
    block: js.UndefOr[scala.Boolean] = js.undefined,
    content: js.Any = null,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): ContentToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (content != null) __obj.updateDynamic("content")(content)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[ContentToken]
  }
}

