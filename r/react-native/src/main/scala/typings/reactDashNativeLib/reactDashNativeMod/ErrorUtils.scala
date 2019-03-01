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
    getGlobalHandler: js.Function0[reactDashNativeLib.ErrorHandlerCallback],
    setGlobalHandler: js.Function1[reactDashNativeLib.ErrorHandlerCallback, scala.Unit]
  ): ErrorUtils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getGlobalHandler")(getGlobalHandler)
    __obj.updateDynamic("setGlobalHandler")(setGlobalHandler)
    __obj.asInstanceOf[ErrorUtils]
  }
}

