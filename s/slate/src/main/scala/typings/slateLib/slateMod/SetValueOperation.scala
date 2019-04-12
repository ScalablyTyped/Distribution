package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetValueOperation extends Operation {
  var data: Data
  var newProperties: ValueProperties
  var properties: ValueProperties
  var `type`: slateLib.slateLibStrings.set_value
}

object SetValueOperation {
  @scala.inline
  def apply(
    data: Data,
    newProperties: ValueProperties,
    properties: ValueProperties,
    `type`: slateLib.slateLibStrings.set_value
  ): SetValueOperation = {
    val __obj = js.Dynamic.literal(data = data, newProperties = newProperties, properties = properties)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SetValueOperation]
  }
}

