package typings
package remarkableLib.libMod.RemarkableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentToken extends TagToken {
  /**
    * Is this a block element
    */
  var block: scala.Boolean
  /**
    * A text token has a `content` property. This is passed to
    * the corresponding renderer to be converted for output.
    */
  var content: js.Any
}

object ContentToken {
  @scala.inline
  def apply(
    block: scala.Boolean,
    content: js.Any,
    level: scala.Double,
    `type`: java.lang.String,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): ContentToken = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("block")(block)
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("level")(level)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[ContentToken]
  }
}

