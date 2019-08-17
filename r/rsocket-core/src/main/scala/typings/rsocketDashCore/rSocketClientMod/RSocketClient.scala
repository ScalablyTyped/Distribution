package typings.rsocketDashCore.rSocketClientMod

import typings.rsocketDashFlowable.rsocketDashFlowableMod.Single
import typings.rsocketDashTypes.reactiveSocketTypesMod.ReactiveSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSocketClient[D, M] extends js.Object {
  def close(): Unit
  def connect(): Single[ReactiveSocket[D, M]]
}

object RSocketClient {
  @scala.inline
  def apply[D, M](close: () => Unit, connect: () => Single[ReactiveSocket[D, M]]): RSocketClient[D, M] = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connect = js.Any.fromFunction0(connect))
  
    __obj.asInstanceOf[RSocketClient[D, M]]
  }
}

