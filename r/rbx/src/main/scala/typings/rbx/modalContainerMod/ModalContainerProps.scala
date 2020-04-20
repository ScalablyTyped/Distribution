package typings.rbx.modalContainerMod

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.ReactType
import typings.react.mod.Ref
import typings.std.Document_
import typings.std.HTMLElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalContainerProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var as: js.UndefOr[ReactType[_]] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var clipped: js.UndefOr[Boolean] = js.undefined
  var closeOnBlur: js.UndefOr[Boolean] = js.undefined
  var closeOnEsc: js.UndefOr[Boolean] = js.undefined
  var containerClassName: js.UndefOr[String] = js.undefined
  var document: js.UndefOr[Document_] = js.undefined
  var innerRef: js.UndefOr[Ref[HTMLElement | SVGElement | ComponentType[js.Object]]] = js.undefined
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ModalContainerProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    as: ReactType[_] = null,
    children: ReactNode = null,
    clipped: js.UndefOr[Boolean] = js.undefined,
    closeOnBlur: js.UndefOr[Boolean] = js.undefined,
    closeOnEsc: js.UndefOr[Boolean] = js.undefined,
    containerClassName: String = null,
    document: Document_ = null,
    innerRef: Ref[HTMLElement | SVGElement | ComponentType[js.Object]] = null,
    onClose: () => Unit = null
  ): ModalContainerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(clipped)) __obj.updateDynamic("clipped")(clipped.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnBlur)) __obj.updateDynamic("closeOnBlur")(closeOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc.asInstanceOf[js.Any])
    if (containerClassName != null) __obj.updateDynamic("containerClassName")(containerClassName.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    __obj.asInstanceOf[ModalContainerProps]
  }
}

