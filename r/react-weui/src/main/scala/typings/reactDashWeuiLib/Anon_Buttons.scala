package typings
package reactDashWeuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buttons extends js.Object {
  var buttons: js.Array[_]
  var `type`: java.lang.String
}

object Anon_Buttons {
  @scala.inline
  def apply(buttons: js.Array[_], `type`: java.lang.String): Anon_Buttons = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("buttons")(buttons)
    __obj.asInstanceOf[Anon_Buttons]
  }
}

