package typings.reactDashBootstrap.libModalBodyMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalBodyProps
  extends AllHTMLAttributes[ModalBody]
     with ClassAttributes[ModalBody] {
  var bsClass: js.UndefOr[String] = js.undefined
  var componentClass: js.UndefOr[ReactType[_]] = js.undefined
}

object ModalBodyProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[ModalBody] = null,
    ClassAttributes: ClassAttributes[ModalBody] = null,
    bsClass: String = null,
    componentClass: ReactType[_] = null
  ): ModalBodyProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalBodyProps]
  }
}

