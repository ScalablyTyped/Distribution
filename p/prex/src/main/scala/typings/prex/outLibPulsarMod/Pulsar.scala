package typings.prex.outLibPulsarMod

import typings.atEsfxCancelable.distMod.Cancelable
import typings.prex.outLibCancellationMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prex/out/lib/pulsar", "Pulsar")
@js.native
class Pulsar () extends js.Object {
  var _waiters: js.Any = js.native
  /**
    * Notifies the next waiter.
    */
  def pulse(): Unit = js.native
  /**
    * Notifies all waiters.
    */
  def pulseAll(): Unit = js.native
  def wait(token: Cancelable): js.Promise[Unit] = js.native
  def wait(token: CancellationToken): js.Promise[Unit] = js.native
}

