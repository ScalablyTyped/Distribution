package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortController extends js.Object {
  /**
    * Returns the `AbortSignal` object associated with this object.
    */
  val signal: AbortSignal
  /**
    * Abort and signal to any observers that the associated activity is to be aborted.
    */
  def abort(): Unit
}

object AbortController {
  @scala.inline
  def apply(abort: () => Unit, signal: AbortSignal): AbortController = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortController]
  }
}

