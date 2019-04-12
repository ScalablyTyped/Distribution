package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetMarkOperation extends Operation {
  var data: Data
  var length: scala.Double
  var newProperties: MarkProperties
  var offset: scala.Double
  var path: Path
  var properties: MarkProperties
  var `type`: slateLib.slateLibStrings.set_mark
}

object SetMarkOperation {
  @scala.inline
  def apply(
    data: Data,
    length: scala.Double,
    newProperties: MarkProperties,
    offset: scala.Double,
    path: Path,
    properties: MarkProperties,
    `type`: slateLib.slateLibStrings.set_mark
  ): SetMarkOperation = {
    val __obj = js.Dynamic.literal(data = data, length = length, newProperties = newProperties, offset = offset, path = path.asInstanceOf[js.Any], properties = properties)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SetMarkOperation]
  }
}

