package typings.slate.slateMod

import typings.slate.slateStrings.set_mark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetMarkOperation extends Operation {
  var data: Data
  var length: Double
  var newProperties: MarkProperties
  var offset: Double
  var path: Path
  var properties: MarkProperties
  var `type`: set_mark
}

object SetMarkOperation {
  @scala.inline
  def apply(
    data: Data,
    length: Double,
    newProperties: MarkProperties,
    offset: Double,
    path: Path,
    properties: MarkProperties,
    `type`: set_mark
  ): SetMarkOperation = {
    val __obj = js.Dynamic.literal(data = data, length = length, newProperties = newProperties, offset = offset, path = path.asInstanceOf[js.Any], properties = properties)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SetMarkOperation]
  }
}

