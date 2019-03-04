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
    val __obj = js.Dynamic.literal(count = count, name = name)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredField]
  }
}

