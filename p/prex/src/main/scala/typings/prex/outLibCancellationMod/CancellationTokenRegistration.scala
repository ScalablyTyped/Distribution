package typings.prex.outLibCancellationMod

import typings.atEsfxDisposable.distMod.Disposable
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

