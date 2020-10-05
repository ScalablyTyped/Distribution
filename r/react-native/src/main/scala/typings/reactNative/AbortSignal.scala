package typings.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbortSignal extends js.Object {
  /**
    * Returns `true` if this `AbortSignal`'s `AbortController` has signaled to abort, and `false` otherwise.
    */
  val aborted: Boolean = js.native
  def onabort(event: AbortEvent): Unit = js.native
}

object AbortSignal {
  @scala.inline
  def apply(aborted: Boolean, onabort: AbortEvent => Unit): AbortSignal = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], onabort = js.Any.fromFunction1(onabort))
    __obj.asInstanceOf[AbortSignal]
  }
  @scala.inline
  implicit class AbortSignalOps[Self <: AbortSignal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAborted(value: Boolean): Self = this.set("aborted", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnabort(value: AbortEvent => Unit): Self = this.set("onabort", js.Any.fromFunction1(value))
  }
  
}

