package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortSignal extends js.Object {
  /**
    * Returns `true` if this `AbortSignal`'s `AbortController` has signaled to abort, and `false` otherwise.
    */
  val aborted: Boolean
  def onabort(event: AbortEvent): Unit
}

object AbortSignal {
  @scala.inline
  def apply(aborted: Boolean, onabort: AbortEvent => Unit): AbortSignal = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], onabort = js.Any.fromFunction1(onabort))
    __obj.asInstanceOf[AbortSignal]
  }
}

