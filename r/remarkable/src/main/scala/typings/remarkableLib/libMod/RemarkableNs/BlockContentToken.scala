package typings
package remarkableLib.libMod.RemarkableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockContentToken extends TagToken {
  /**
    * This is initialized with an empty array (`[]`) and will be filled
    * with the inline parser tokens as the inline parsing rules are applied.
    */
  var children: js.Array[Token]
  /**
    * The content of the block. This might include inline mardown syntax
    * which may need further processing by the inline rules.
    */
  var content: java.lang.String
}

object BlockContentToken {
  @scala.inline
  def apply(
    children: js.Array[Token],
    content: java.lang.String,
    level: scala.Double,
    `type`: java.lang.String,
    lines: js.Tuple2[scala.Double, scala.Double] = null
  ): BlockContentToken = {
    val __obj = js.Dynamic.literal(children = children, content = content, level = level)
    __obj.updateDynamic("type")(`type`)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[BlockContentToken]
  }
}

