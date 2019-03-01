package typings
package reactDashBootstrapLib.libModalTitleMod.ModalTitleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalTitleProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libModalTitleMod.ModalTitle] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var componentClass: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
}

object ModalTitleProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libModalTitleMod.ModalTitle] = null,
    bsClass: java.lang.String = null,
    componentClass: reactLib.reactMod.ReactNs.ReactType[_] = null
  ): ModalTitleProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalTitleProps]
  }
}

