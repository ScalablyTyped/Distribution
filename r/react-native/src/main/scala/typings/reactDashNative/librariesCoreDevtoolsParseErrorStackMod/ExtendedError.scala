package typings.reactDashNative.librariesCoreDevtoolsParseErrorStackMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedError extends Error {
  var framesToPop: js.UndefOr[Double] = js.undefined
}

object ExtendedError {
  @scala.inline
  def apply(message: String, name: String, framesToPop: Int | Double = null, stack: String = null): ExtendedError = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (framesToPop != null) __obj.updateDynamic("framesToPop")(framesToPop.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ExtendedError]
  }
}

