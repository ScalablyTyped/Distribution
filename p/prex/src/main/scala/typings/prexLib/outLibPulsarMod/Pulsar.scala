package typings
package prexLib.outLibPulsarMod

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
  def pulse(): scala.Unit = js.native
  /**
    * Notifies all waiters.
    */
  def pulseAll(): scala.Unit = js.native
  def wait(token: prexLib.outLibCancellationMod.CancellationToken): js.Promise[scala.Unit] = js.native
}

