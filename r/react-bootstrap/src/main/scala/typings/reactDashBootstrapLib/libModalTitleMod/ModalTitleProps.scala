package typings
package reactDashBootstrapLib.libModalTitleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalTitleProps
  extends reactLib.reactMod.HTMLProps[ModalTitle] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var componentClass: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object ModalTitleProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[ModalTitle] = null,
    bsClass: java.lang.String = null,
    componentClass: reactLib.reactMod.ReactType[_] = null
  ): ModalTitleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalTitleProps]
  }
}

