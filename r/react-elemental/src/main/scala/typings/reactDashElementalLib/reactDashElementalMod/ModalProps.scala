package typings
package reactDashElementalLib.reactDashElementalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  val children: js.UndefOr[js.Any] = js.undefined
  val onHide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  val persistent: js.UndefOr[scala.Boolean] = js.undefined
  val size: js.UndefOr[ModalSize] = js.undefined
  val style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    children: js.Any = null,
    onHide: () => scala.Unit = null,
    persistent: js.UndefOr[scala.Boolean] = js.undefined,
    size: ModalSize = null,
    style: reactLib.reactMod.CSSProperties = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[ModalProps]
  }
}

