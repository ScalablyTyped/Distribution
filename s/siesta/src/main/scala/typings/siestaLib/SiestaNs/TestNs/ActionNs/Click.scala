package typings
package siestaLib.SiestaNs.TestNs.ActionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  */
trait Click
  extends siestaLib.SiestaNs.TestNs.IAction
     with siestaLib.SiestaNs.TestNs.ActionNs.RoleNs.IHasTarget {
  var options: js.UndefOr[js.Any] = js.undefined
}

object Click {
  @scala.inline
  def apply(
    desc: java.lang.String = null,
    el: js.Any = null,
    options: js.Any = null,
    passTargetToNext: js.UndefOr[scala.Boolean] = js.undefined,
    target: js.Any = null
  ): Click = {
    val __obj = js.Dynamic.literal()
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (el != null) __obj.updateDynamic("el")(el)
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(passTargetToNext)) __obj.updateDynamic("passTargetToNext")(passTargetToNext)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Click]
  }
}

