package typings.siesta.SiestaNs.TestNs.ActionNs

import typings.siesta.SiestaNs.TestNs.ActionNs.RoleNs.IHasTarget
import typings.siesta.SiestaNs.TestNs.IAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  */
trait Swipe
  extends IAction
     with IHasTarget {
  var direction: js.UndefOr[String] = js.undefined
}

object Swipe {
  @scala.inline
  def apply(
    desc: String = null,
    direction: String = null,
    el: js.Any = null,
    passTargetToNext: js.UndefOr[Boolean] = js.undefined,
    target: js.Any = null
  ): Swipe = {
    val __obj = js.Dynamic.literal()
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (el != null) __obj.updateDynamic("el")(el)
    if (!js.isUndefined(passTargetToNext)) __obj.updateDynamic("passTargetToNext")(passTargetToNext)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Swipe]
  }
}

