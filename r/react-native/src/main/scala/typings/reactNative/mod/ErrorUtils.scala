package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorUtils extends js.Object {
  def getGlobalHandler(): ErrorHandlerCallback
  def setGlobalHandler(callback: ErrorHandlerCallback): Unit
}

object ErrorUtils {
  @scala.inline
  def apply(getGlobalHandler: () => ErrorHandlerCallback, setGlobalHandler: ErrorHandlerCallback => Unit): ErrorUtils = {
    val __obj = js.Dynamic.literal(getGlobalHandler = js.Any.fromFunction0(getGlobalHandler), setGlobalHandler = js.Any.fromFunction1(setGlobalHandler))
    __obj.asInstanceOf[ErrorUtils]
  }
}

