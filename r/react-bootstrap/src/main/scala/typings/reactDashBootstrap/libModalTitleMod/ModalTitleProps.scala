package typings.reactDashBootstrap.libModalTitleMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalTitleProps
  extends AllHTMLAttributes[ModalTitle]
     with ClassAttributes[ModalTitle] {
  var bsClass: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
}

object ModalTitleProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[ModalTitle] = null,
    ClassAttributes: ClassAttributes[ModalTitle] = null,
    bsClass: String = null,
    componentClass: ReactType[_] = null
  ): ModalTitleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalTitleProps]
  }
}

