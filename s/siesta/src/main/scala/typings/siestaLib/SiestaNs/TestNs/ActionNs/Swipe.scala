package typings
package siestaLib.SiestaNs.TestNs.ActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  */
trait Swipe
  extends siestaLib.SiestaNs.TestNs.IAction
     with siestaLib.SiestaNs.TestNs.ActionNs.RoleNs.IHasTarget {
  var direction: js.UndefOr[java.lang.String] = js.undefined
}

object Swipe {
  @scala.inline
  def apply(
    desc: java.lang.String = null,
    direction: java.lang.String = null,
    el: js.Any = null,
    passTargetToNext: js.UndefOr[scala.Boolean] = js.undefined,
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

