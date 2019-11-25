package typings.reduxDashForm.libReducerMod

import typings.reduxDashForm.reduxDashFormMod.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisteredFieldState extends js.Object {
  var name: String
  var `type`: FieldType
}

object RegisteredFieldState {
  @scala.inline
  def apply(name: String, `type`: FieldType): RegisteredFieldState = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredFieldState]
  }
}

