package typings
package reduxDashFormLib.libReduxFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisteredField extends js.Object {
  var count: scala.Double
  var name: java.lang.String
  var `type`: reduxDashFormLib.reduxDashFormLibStrings.Field | reduxDashFormLib.reduxDashFormLibStrings.FieldArray
}

object RegisteredField {
  @scala.inline
  def apply(
    count: scala.Double,
    name: java.lang.String,
    `type`: reduxDashFormLib.reduxDashFormLibStrings.Field | reduxDashFormLib.reduxDashFormLibStrings.FieldArray
  ): RegisteredField = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[RegisteredField]
  }
}

