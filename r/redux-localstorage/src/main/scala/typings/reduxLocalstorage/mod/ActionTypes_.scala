package typings.reduxLocalstorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionTypes_ extends js.Object {
  var INIT: String = js.native
}

object ActionTypes_ {
  @scala.inline
  def apply(INIT: String): ActionTypes_ = {
    val __obj = js.Dynamic.literal(INIT = INIT.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTypes_]
  }
  @scala.inline
  implicit class ActionTypes_Ops[Self <: ActionTypes_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setINIT(value: String): Self = this.set("INIT", value.asInstanceOf[js.Any])
  }
  
}

