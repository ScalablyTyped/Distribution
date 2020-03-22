package typings.rcSteps

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: js.UndefOr[ReactNode] = js.undefined
  var finish: js.UndefOr[ReactNode] = js.undefined
}

object AnonError {
  @scala.inline
  def apply(error: ReactNode = null, finish: ReactNode = null): AnonError = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (finish != null) __obj.updateDynamic("finish")(finish.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonError]
  }
}

