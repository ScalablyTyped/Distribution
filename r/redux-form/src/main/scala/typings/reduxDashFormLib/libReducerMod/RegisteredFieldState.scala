package typings
package reduxDashFormLib.libReducerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisteredFieldState extends js.Object {
  var name: java.lang.String
  var `type`: reduxDashFormLib.reduxDashFormMod.FieldType
}

object RegisteredFieldState {
  @scala.inline
  def apply(name: java.lang.String, `type`: reduxDashFormLib.reduxDashFormMod.FieldType): RegisteredFieldState = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[RegisteredFieldState]
  }
}

