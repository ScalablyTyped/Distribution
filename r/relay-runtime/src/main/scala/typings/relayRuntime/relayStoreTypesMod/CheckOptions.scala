package typings.relayRuntime.relayStoreTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckOptions extends js.Object {
  var handlers: js.Array[MissingFieldHandler] = js.native
  var target: MutableRecordSource = js.native
}

object CheckOptions {
  @scala.inline
  def apply(handlers: js.Array[MissingFieldHandler], target: MutableRecordSource): CheckOptions = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckOptions]
  }
  @scala.inline
  implicit class CheckOptionsOps[Self <: CheckOptions] (val x: Self) extends AnyVal {
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
    def setHandlersVarargs(value: MissingFieldHandler*): Self = this.set("handlers", js.Array(value :_*))
    @scala.inline
    def setHandlers(value: js.Array[MissingFieldHandler]): Self = this.set("handlers", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: MutableRecordSource): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

