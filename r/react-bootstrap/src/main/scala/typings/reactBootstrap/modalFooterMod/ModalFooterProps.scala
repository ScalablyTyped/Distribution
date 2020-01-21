package typings.reactBootstrap.modalFooterMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalFooterProps
  extends AllHTMLAttributes[ModalFooter]
     with ClassAttributes[ModalFooter] {
  var bsClass: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
}

object ModalFooterProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[ModalFooter] = null,
    ClassAttributes: ClassAttributes[ModalFooter] = null,
    bsClass: String = null,
    componentClass: ReactType[_] = null
  ): ModalFooterProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalFooterProps]
  }
}

