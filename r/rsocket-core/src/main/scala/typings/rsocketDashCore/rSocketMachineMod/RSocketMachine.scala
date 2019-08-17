package typings.rsocketDashCore.rSocketMachineMod

import typings.rsocketDashTypes.reactiveSocketTypesMod.ReactiveSocket
import typings.rsocketDashTypes.reactiveSocketTypesMod.Responder
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RSocketMachine[D, M] extends ReactiveSocket[D, M] {
  def setRequestHandler(): Unit = js.native
  def setRequestHandler(requestHandler: Partial[Responder[D, M]]): Unit = js.native
}

