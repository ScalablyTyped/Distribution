package typings.reactDashOnsenui

import typings.react.reactMod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LockOnDrag extends js.Object {
  var lockOnDrag: js.UndefOr[Boolean] = js.undefined
  var modifier: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[_]] = js.undefined
  var tapBackgroundColor: js.UndefOr[String] = js.undefined
  var tappable: js.UndefOr[Boolean] = js.undefined
}

object Anon_LockOnDrag {
  @scala.inline
  def apply(
    lockOnDrag: js.UndefOr[Boolean] = js.undefined,
    modifier: String = null,
    onClick: MouseEventHandler[_] = null,
    tapBackgroundColor: String = null,
    tappable: js.UndefOr[Boolean] = js.undefined
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

