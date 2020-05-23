package typings.reactBootstrap.modalHeaderMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalHeaderProps
  extends AllHTMLAttributes[ModalHeader]
     with ClassAttributes[ModalHeader] {
  var bsClass: js.UndefOr[String] = js.undefined
  var closeButton: js.UndefOr[Boolean] = js.undefined
  var closeLabel: js.UndefOr[String] = js.undefined
  var onHide: js.UndefOr[js.Function] = js.undefined
}

object ModalHeaderProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[ModalHeader] = null,
    ClassAttributes: ClassAttributes[ModalHeader] = null,
    bsClass: String = null,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeLabel: String = null,
    onHide: js.Function = null
  ): ModalHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.get.asInstanceOf[js.Any])
    if (closeLabel != null) __obj.updateDynamic("closeLabel")(closeLabel.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(onHide.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalHeaderProps]
  }
}

