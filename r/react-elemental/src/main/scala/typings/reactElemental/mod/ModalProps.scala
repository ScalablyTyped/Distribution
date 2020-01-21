package typings.reactElemental.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  val children: js.UndefOr[js.Any] = js.undefined
  val onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  val persistent: js.UndefOr[Boolean] = js.undefined
  val size: js.UndefOr[ModalSize] = js.undefined
  val style: js.UndefOr[CSSProperties] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    children: js.Any = null,
    onHide: () => Unit = null,
    persistent: js.UndefOr[Boolean] = js.undefined,
    size: ModalSize = null,
    style: CSSProperties = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
}

