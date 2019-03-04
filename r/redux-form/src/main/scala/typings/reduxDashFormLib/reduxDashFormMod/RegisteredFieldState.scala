package typings
package reduxDashFormLib.reduxDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisteredFieldState extends js.Object {
  var name: java.lang.String
  var `type`: FieldType
}

object RegisteredFieldState {
  @scala.inline
  def apply(name: java.lang.String, `type`: FieldType): RegisteredFieldState = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RegisteredFieldState]
  }
}

