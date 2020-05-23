package typings.siesta.Siesta.Test.Action

import typings.siesta.Siesta.Test.IAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  */
trait Done extends IAction {
  var delay: js.UndefOr[Double] = js.undefined
}

object Done {
  @scala.inline
  def apply(delay: js.UndefOr[Double] = js.undefined, desc: String = null): Done = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Done]
  }
}

