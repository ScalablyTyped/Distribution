package typings.slate.slateMod

import typings.slate.slateStrings.split_node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitNodeOperation extends Operation {
  var data: Data
  var path: Path
  var position: Double
  var properties: NodeProperties
  var target: Double
  var `type`: split_node
}

object SplitNodeOperation {
  @scala.inline
  def apply(
    data: Data,
    path: Path,
    position: Double,
    properties: NodeProperties,
    target: Double,
    `type`: split_node
  ): SplitNodeOperation = {
    val __obj = js.Dynamic.literal(data = data, path = path.asInstanceOf[js.Any], position = position, properties = properties, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SplitNodeOperation]
  }
}

