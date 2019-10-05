package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RnError extends Error {
  var code: js.UndefOr[String] = js.undefined
}

object RnError {
  @scala.inline
  def apply(message: String, name: String, code: String = null, stack: String = null): RnError = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (code != null) __obj.updateDynamic("code")(code)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[RnError]
  }
}

