package typings.rdflib.fetcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbackifyInterface extends js.Object {
  var fireCallbacks: js.Function = js.native
}

object CallbackifyInterface {
  @scala.inline
  def apply(fireCallbacks: js.Function): CallbackifyInterface = {
    val __obj = js.Dynamic.literal(fireCallbacks = fireCallbacks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackifyInterface]
  }
  @scala.inline
  implicit class CallbackifyInterfaceOps[Self <: CallbackifyInterface] (val x: Self) extends AnyVal {
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
    def setFireCallbacks(value: js.Function): Self = this.set("fireCallbacks", value.asInstanceOf[js.Any])
  }
  
}

