package typings.siesta.SiestaNs.TestNs.ActionNs

import typings.siesta.SiestaNs.TestNs.ActionNs.RoleNs.IHasTarget
import typings.siesta.SiestaNs.TestNs.IAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  */
trait DoubleClick
  extends IAction
     with IHasTarget {
  var options: js.UndefOr[js.Any] = js.undefined
}

object DoubleClick {
  @scala.inline
  def apply(
    desc: String = null,
    el: js.Any = null,
    options: js.Any = null,
    passTargetToNext: js.UndefOr[Boolean] = js.undefined,
    target: js.Any = null
  ): DoubleClick = {
    val __obj = js.Dynamic.literal()
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (el != null) __obj.updateDynamic("el")(el)
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(passTargetToNext)) __obj.updateDynamic("passTargetToNext")(passTargetToNext)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DoubleClick]
  }
}

