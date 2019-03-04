package typings
package reactDashNativeLib.librariesCoreDevtoolsParseErrorStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedError
  extends stdLib.Error {
  var framesToPop: js.UndefOr[scala.Double] = js.undefined
}

object ExtendedError {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: java.lang.String,
    framesToPop: scala.Int | scala.Double = null,
    stack: java.lang.String = null
  ): ExtendedError = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (framesToPop != null) __obj.updateDynamic("framesToPop")(framesToPop.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ExtendedError]
  }
}

