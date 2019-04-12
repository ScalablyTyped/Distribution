package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitNodeOperation extends Operation {
  var data: Data
  var path: Path
  var position: scala.Double
  var properties: NodeProperties
  var target: scala.Double
  var `type`: slateLib.slateLibStrings.split_node
}

object SplitNodeOperation {
  @scala.inline
  def apply(
    data: Data,
    path: Path,
    position: scala.Double,
    properties: NodeProperties,
    target: scala.Double,
    `type`: slateLib.slateLibStrings.split_node
  ): SplitNodeOperation = {
    val __obj = js.Dynamic.literal(data = data, path = path.asInstanceOf[js.Any], position = position, properties = properties, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SplitNodeOperation]
  }
}

