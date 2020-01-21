package typings.prex.cancellationMod

import typings.esfxDisposable.distMod.Disposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancellationTokenRegistration extends Disposable {
  /**
    * Unregisters the callback
    */
  def unregister(): Unit = js.native
}

