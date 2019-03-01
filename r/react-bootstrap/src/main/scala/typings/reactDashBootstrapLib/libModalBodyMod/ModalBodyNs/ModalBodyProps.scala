package typings
package reactDashBootstrapLib.libModalBodyMod.ModalBodyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalBodyProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libModalBodyMod.ModalBody] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var componentClass: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
}

object ModalBodyProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libModalBodyMod.ModalBody] = null,
    bsClass: java.lang.String = null,
    componentClass: reactLib.reactMod.ReactNs.ReactType[_] = null
  ): ModalBodyProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalBodyProps]
  }
}

