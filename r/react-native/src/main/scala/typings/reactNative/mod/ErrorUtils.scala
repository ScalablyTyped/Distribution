package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorUtils extends js.Object {
  def getGlobalHandler(): ErrorHandlerCallback = js.native
  def setGlobalHandler(callback: ErrorHandlerCallback): Unit = js.native
}

object ErrorUtils {
  @scala.inline
  def apply(getGlobalHandler: () => ErrorHandlerCallback, setGlobalHandler: ErrorHandlerCallback => Unit): ErrorUtils = {
    val __obj = js.Dynamic.literal(getGlobalHandler = js.Any.fromFunction0(getGlobalHandler), setGlobalHandler = js.Any.fromFunction1(setGlobalHandler))
    __obj.asInstanceOf[ErrorUtils]
  }
  @scala.inline
  implicit class ErrorUtilsOps[Self <: ErrorUtils] (val x: Self) extends AnyVal {
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
    def setGetGlobalHandler(value: () => ErrorHandlerCallback): Self = this.set("getGlobalHandler", js.Any.fromFunction0(value))
    @scala.inline
    def setSetGlobalHandler(value: ErrorHandlerCallback => Unit): Self = this.set("setGlobalHandler", js.Any.fromFunction1(value))
  }
  
}

