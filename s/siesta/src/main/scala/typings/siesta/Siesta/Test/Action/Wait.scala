package typings.siesta.Siesta.Test.Action

import typings.siesta.Siesta.Test.IAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  */
trait Wait extends IAction {
  var args: js.UndefOr[js.Array[_]] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var waitFor: js.UndefOr[String] = js.undefined
}

object Wait {
  @scala.inline
  def apply(
    args: js.Array[_] = null,
    delay: js.UndefOr[Double] = js.undefined,
    desc: String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    waitFor: String = null
  ): Wait = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (waitFor != null) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wait]
  }
}

