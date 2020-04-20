package typings.promiseAbortable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortSignal extends js.Object {
  val aborted: Boolean
  def onabort(reason: js.Any): Unit
}

object AbortSignal {
  @scala.inline
  def apply(aborted: Boolean, onabort: js.Any => Unit): AbortSignal = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], onabort = js.Any.fromFunction1(onabort))
    __obj.asInstanceOf[AbortSignal]
  }
}

