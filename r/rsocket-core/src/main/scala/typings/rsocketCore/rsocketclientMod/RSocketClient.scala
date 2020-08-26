package typings.rsocketCore.rsocketclientMod

import typings.rsocketFlowable.mod.Single
import typings.rsocketTypes.reactiveSocketTypesMod.ReactiveSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RSocketClient[D, M] extends js.Object {
  def close(): Unit = js.native
  def connect(): Single[ReactiveSocket[D, M]] = js.native
}

object RSocketClient {
  @scala.inline
  def apply[D, M](close: () => Unit, connect: () => Single[ReactiveSocket[D, M]]): RSocketClient[D, M] = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connect = js.Any.fromFunction0(connect))
    __obj.asInstanceOf[RSocketClient[D, M]]
  }
  @scala.inline
  implicit class RSocketClientOps[Self <: RSocketClient[_, _], D, M] (val x: Self with (RSocketClient[D, M])) extends AnyVal {
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
    def setConnect(value: () => Single[ReactiveSocket[D, M]]): Self = this.set("connect", js.Any.fromFunction0(value))
  }
  
}

