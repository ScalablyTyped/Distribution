package typings
package reactDashWeuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Checkbox extends js.Object {
  var checkbox: scala.Boolean
  var radio: scala.Boolean
}

object Anon_Checkbox {
  @scala.inline
  def apply(checkbox: scala.Boolean, radio: scala.Boolean): Anon_Checkbox = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkbox")(checkbox)
    __obj.updateDynamic("radio")(radio)
    __obj.asInstanceOf[Anon_Checkbox]
  }
}

