package typings.rcSteps.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: js.UndefOr[ReactNode] = js.undefined
  var finish: js.UndefOr[ReactNode] = js.undefined
}

object Error {
  @scala.inline
  def apply(error: ReactNode = null, finish: ReactNode = null): Error = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (finish != null) __obj.updateDynamic("finish")(finish.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

