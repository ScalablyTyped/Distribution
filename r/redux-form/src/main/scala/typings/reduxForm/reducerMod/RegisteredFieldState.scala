package typings.reduxForm.reducerMod

import typings.reduxForm.mod.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisteredFieldState extends js.Object {
  var count: Double
  var name: String
  var `type`: FieldType
}

object RegisteredFieldState {
  @scala.inline
  def apply(count: Double, name: String, `type`: FieldType): RegisteredFieldState = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredFieldState]
  }
}

