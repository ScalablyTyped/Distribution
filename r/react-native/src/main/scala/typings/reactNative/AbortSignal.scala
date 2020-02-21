package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AbortSignal")
@js.native
/**
  * AbortSignal cannot be constructed directly.
  */
class AbortSignal () extends js.Object {
  /**
    * Returns `true` if this `AbortSignal`'s `AbortController` has signaled to abort, and `false` otherwise.
    */
  val aborted: Boolean = js.native
  def onabort(event: AbortEvent): Unit = js.native
}

