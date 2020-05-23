package typings.rcEasyui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buttons extends js.Object {
  var buttons: js.Array[_]
  var defaultCancel: String
  var defaultOk: String
}

object Buttons {
  @scala.inline
  def apply(buttons: js.Array[_], defaultCancel: String, defaultOk: String): Buttons = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], defaultCancel = defaultCancel.asInstanceOf[js.Any], defaultOk = defaultOk.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buttons]
  }
}

