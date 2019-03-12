package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitNodeOperation extends Operation {
  var path: js.Array[scala.Double]
  var position: scala.Double
  var target: scala.Double
  var `type`: slateLib.slateLibStrings.split_node
}

object SplitNodeOperation {
  @scala.inline
  def apply(
    path: js.Array[scala.Double],
    position: scala.Double,
    target: scala.Double,
    `type`: slateLib.slateLibStrings.split_node
  ): SplitNodeOperation = {
    val __obj = js.Dynamic.literal(path = path, position = position, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SplitNodeOperation]
  }
}

