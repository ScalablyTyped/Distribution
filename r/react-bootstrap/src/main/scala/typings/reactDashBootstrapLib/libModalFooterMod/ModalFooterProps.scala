package typings
package reactDashBootstrapLib.libModalFooterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalFooterProps
  extends reactLib.reactMod.HTMLProps[ModalFooter] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var componentClass: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object ModalFooterProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[ModalFooter] = null,
    bsClass: java.lang.String = null,
    componentClass: reactLib.reactMod.ReactType[_] = null
  ): ModalFooterProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalFooterProps]
  }
}

