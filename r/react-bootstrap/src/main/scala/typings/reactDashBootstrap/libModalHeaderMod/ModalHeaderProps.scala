package typings.reactDashBootstrap.libModalHeaderMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalHeaderProps extends HTMLProps[ModalHeader] {
  var bsClass: js.UndefOr[String] = js.undefined
  var closeButton: js.UndefOr[Boolean] = js.undefined
  var closeLabel: js.UndefOr[String] = js.undefined
  var onHide: js.UndefOr[js.Function] = js.undefined
}

object ModalHeaderProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[ModalHeader] = null,
    bsClass: String = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeLabel: String = null,
    onHide: js.Function = null
  ): ModalHeaderProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (closeLabel != null) __obj.updateDynamic("closeLabel")(closeLabel)
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    __obj.asInstanceOf[ModalHeaderProps]
  }
}

