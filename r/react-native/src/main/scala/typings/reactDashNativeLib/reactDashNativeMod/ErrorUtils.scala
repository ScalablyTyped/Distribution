package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorUtils extends js.Object {
  def getGlobalHandler(): reactDashNativeLib.ErrorHandlerCallback
  def setGlobalHandler(callback: reactDashNativeLib.ErrorHandlerCallback): scala.Unit
}

object ErrorUtils {
  @scala.inline
  def apply(
    getGlobalHandler: () => reactDashNativeLib.ErrorHandlerCallback,
    setGlobalHandler: reactDashNativeLib.ErrorHandlerCallback => scala.Unit
  ): ErrorUtils = {
    val __obj = js.Dynamic.literal(getGlobalHandler = js.Any.fromFunction0(getGlobalHandler), setGlobalHandler = js.Any.fromFunction1(setGlobalHandler))
  
    __obj.asInstanceOf[ErrorUtils]
  }
}

