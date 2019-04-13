package typings
package reactDashBootstrapLib.libModalHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalHeaderProps
  extends reactLib.reactMod.HTMLProps[ModalHeader] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var closeButton: js.UndefOr[scala.Boolean] = js.undefined
  var closeLabel: js.UndefOr[java.lang.String] = js.undefined
  var onHide: js.UndefOr[js.Function] = js.undefined
}

object ModalHeaderProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[ModalHeader] = null,
    bsClass: java.lang.String = null,
    closeButton: js.UndefOr[scala.Boolean] = js.undefined,
    closeLabel: java.lang.String = null,
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

