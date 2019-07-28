package typings.remarkable.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.remarkable.libMod._Token because Already inherited */ trait BlockContentToken extends TagToken {
  /**
    * This is initialized with an empty array (`[]`) and will be filled
    * with the inline parser tokens as the inline parsing rules are applied.
    */
  var children: js.UndefOr[js.Array[Token]] = js.undefined
  /**
    * The content of the block. This might include inline mardown syntax
    * which may need further processing by the inline rules.
    */
  var content: js.UndefOr[String] = js.undefined
}

object BlockContentToken {
  @scala.inline
  def apply(
    level: Double,
    `type`: String,
    children: js.Array[Token] = null,
    content: String = null,
    lines: js.Tuple2[Double, Double] = null
  ): BlockContentToken = {
    val __obj = js.Dynamic.literal(level = level)
    __obj.updateDynamic("type")(`type`)
    if (children != null) __obj.updateDynamic("children")(children)
    if (content != null) __obj.updateDynamic("content")(content)
    if (lines != null) __obj.updateDynamic("lines")(lines)
    __obj.asInstanceOf[BlockContentToken]
  }
}

