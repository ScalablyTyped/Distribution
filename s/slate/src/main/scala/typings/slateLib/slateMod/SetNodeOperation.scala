package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetNodeOperation extends Operation {
  var path: js.Array[scala.Double]
  var properties: BlockProperties | InlineProperties | TextProperties
  var `type`: slateLib.slateLibStrings.set_node
}

object SetNodeOperation {
  @scala.inline
  def apply(
    path: js.Array[scala.Double],
    properties: BlockProperties | InlineProperties | TextProperties,
    `type`: slateLib.slateLibStrings.set_node
  ): SetNodeOperation = {
    val __obj = js.Dynamic.literal(path = path, properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SetNodeOperation]
  }
}

