package typings.siesta.Siesta.Test.Action

import typings.siesta.Siesta.Test.Action.Role.IHasTarget
import typings.siesta.Siesta.Test.IAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  */
trait MouseUp
  extends IAction
     with IHasTarget {
  var options: js.UndefOr[js.Any] = js.undefined
}

object MouseUp {
  @scala.inline
  def apply(
    desc: String = null,
    el: js.Any = null,
    options: js.Any = null,
    passTargetToNext: js.UndefOr[Boolean] = js.undefined,
    target: js.Any = null
  ): MouseUp = {
    val __obj = js.Dynamic.literal()
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (el != null) __obj.updateDynamic("el")(el)
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(passTargetToNext)) __obj.updateDynamic("passTargetToNext")(passTargetToNext)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[MouseUp]
  }
}

