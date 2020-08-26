package typings.reactAlert.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlertComponentProps extends js.Object {
  var id: String = js.native
  var message: ReactNode = js.native
  var options: AlertCustomOptionsWithType = js.native
  def close(): Unit = js.native
}

object AlertComponentProps {
  @scala.inline
  def apply(close: () => Unit, id: String, options: AlertCustomOptionsWithType): AlertComponentProps = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlertComponentProps]
  }
  @scala.inline
  implicit class AlertComponentPropsOps[Self <: AlertComponentProps] (val x: Self) extends AnyVal {
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: AlertCustomOptionsWithType): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: ReactNode): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

