package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A controller object that allows you to abort one or more DOM requests as and when desired. */
trait AbortController extends js.Object {
  /**
    * Returns the AbortSignal object associated with this object.
    */
  val signal: AbortSignal
  /**
    * Invoking this method will set this object's AbortSignal's aborted flag and signal to any observers that the associated activity is to be aborted.
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

