package typings.pulumiPulumi.anon

import typings.pulumiPulumi.outputMod.Inputs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Init extends js.Object {
  def init(): js.Promise[Inputs] = js.native
}

object Init {
  @scala.inline
  def apply(init: () => js.Promise[Inputs]): Init = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init))
    __obj.asInstanceOf[Init]
  }
  @scala.inline
  implicit class InitOps[Self <: Init] (val x: Self) extends AnyVal {
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
    def setInit(value: () => js.Promise[Inputs]): Self = this.set("init", js.Any.fromFunction0(value))
  }
  
}

