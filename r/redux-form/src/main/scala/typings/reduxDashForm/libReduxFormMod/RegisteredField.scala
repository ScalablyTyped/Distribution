package typings.reduxDashForm.libReduxFormMod

import typings.reduxDashForm.reduxDashFormStrings.Field
import typings.reduxDashForm.reduxDashFormStrings.FieldArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisteredField extends js.Object {
  var count: Double
  var name: String
  var `type`: Field | FieldArray
}

object RegisteredField {
  @scala.inline
  def apply(count: Double, name: String, `type`: Field | FieldArray): RegisteredField = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredField]
  }
}

