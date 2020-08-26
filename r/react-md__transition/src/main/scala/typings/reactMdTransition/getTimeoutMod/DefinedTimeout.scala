package typings.reactMdTransition.getTimeoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefinedTimeout extends js.Object {
  var appear: Double = js.native
  var enter: Double = js.native
  var exit: Double = js.native
}

object DefinedTimeout {
  @scala.inline
  def apply(appear: Double, enter: Double, exit: Double): DefinedTimeout = {
    val __obj = js.Dynamic.literal(appear = appear.asInstanceOf[js.Any], enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinedTimeout]
  }
  @scala.inline
  implicit class DefinedTimeoutOps[Self <: DefinedTimeout] (val x: Self) extends AnyVal {
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
    def setAppear(value: Double): Self = this.set("appear", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnter(value: Double): Self = this.set("enter", value.asInstanceOf[js.Any])
    @scala.inline
    def setExit(value: Double): Self = this.set("exit", value.asInstanceOf[js.Any])
  }
  
}

