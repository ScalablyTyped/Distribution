package typings.siesta.SiestaNs.TestNs.ActionNs

import typings.siesta.SiestaNs.TestNs.ActionNs.RoleNs.IHasTarget
import typings.siesta.SiestaNs.TestNs.IAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  */
trait Type
  extends IAction
     with IHasTarget

object Type {
  @scala.inline
  def apply(
    desc: String = null,
    el: js.Any = null,
    passTargetToNext: js.UndefOr[Boolean] = js.undefined,
    target: js.Any = null
  ): Type = {
    val __obj = js.Dynamic.literal()
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (el != null) __obj.updateDynamic("el")(el)
    if (!js.isUndefined(passTargetToNext)) __obj.updateDynamic("passTargetToNext")(passTargetToNext)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Type]
  }
}

