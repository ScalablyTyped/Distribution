package typings.reactNative.parseErrorStackMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedError extends Error {
  var framesToPop: js.UndefOr[Double] = js.undefined
}

object ExtendedError {
  @scala.inline
  def apply(
    message: String,
    name: String,
    framesToPop: js.UndefOr[Double] = js.undefined,
    stack: String = null
  ): ExtendedError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(framesToPop)) __obj.updateDynamic("framesToPop")(framesToPop.get.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedError]
  }
}

