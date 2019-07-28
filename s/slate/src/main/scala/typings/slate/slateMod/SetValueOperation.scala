package typings.slate.slateMod

import typings.slate.slateStrings.set_value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetValueOperation extends Operation {
  var data: Data
  var newProperties: ValueProperties
  var properties: ValueProperties
  var `type`: set_value
}

object SetValueOperation {
  @scala.inline
  def apply(data: Data, newProperties: ValueProperties, properties: ValueProperties, `type`: set_value): SetValueOperation = {
    val __obj = js.Dynamic.literal(data = data, newProperties = newProperties, properties = properties)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SetValueOperation]
  }
}

