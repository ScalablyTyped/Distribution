package typings.signalr.SignalR.Hub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHub extends js.Object {
  def start(): Unit = js.native
}

object IHub {
  @scala.inline
  def apply(start: () => Unit): IHub = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[IHub]
  }
  @scala.inline
  implicit class IHubOps[Self <: IHub] (val x: Self) extends AnyVal {
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
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
  }
  
}

