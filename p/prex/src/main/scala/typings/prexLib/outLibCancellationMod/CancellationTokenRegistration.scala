package typings
package prexLib.outLibCancellationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancellationTokenRegistration extends js.Object {
  /**
    * Unregisters the callback
    */
  def unregister(): scala.Unit
}

object CancellationTokenRegistration {
  @scala.inline
  def apply(unregister: () => scala.Unit): CancellationTokenRegistration = {
    val __obj = js.Dynamic.literal(unregister = js.Any.fromFunction0(unregister))
  
    __obj.asInstanceOf[CancellationTokenRegistration]
  }
}

