package typings.relayCompiler

import typings.relayCompiler.schemaMod.InputTypeID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultValue extends js.Object {
  var defaultValue: js.Any
  var name: String
  var `type`: InputTypeID
}

object AnonDefaultValue {
  @scala.inline
  def apply(defaultValue: js.Any, name: String, `type`: InputTypeID): AnonDefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultValue]
  }
}

