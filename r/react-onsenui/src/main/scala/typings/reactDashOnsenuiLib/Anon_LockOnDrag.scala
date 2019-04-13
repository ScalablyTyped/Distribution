package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LockOnDrag extends js.Object {
  var lockOnDrag: js.UndefOr[scala.Boolean] = js.undefined
  var modifier: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[_]] = js.undefined
  var tapBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var tappable: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_LockOnDrag {
  @scala.inline
  def apply(
    lockOnDrag: js.UndefOr[scala.Boolean] = js.undefined,
    modifier: java.lang.String = null,
    onClick: reactLib.reactMod.MouseEventHandler[_] = null,
    tapBackgroundColor: java.lang.String = null,
    tappable: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_LockOnDrag = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(lockOnDrag)) __obj.updateDynamic("lockOnDrag")(lockOnDrag)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (tapBackgroundColor != null) __obj.updateDynamic("tapBackgroundColor")(tapBackgroundColor)
    if (!js.isUndefined(tappable)) __obj.updateDynamic("tappable")(tappable)
    __obj.asInstanceOf[Anon_LockOnDrag]
  }
}

