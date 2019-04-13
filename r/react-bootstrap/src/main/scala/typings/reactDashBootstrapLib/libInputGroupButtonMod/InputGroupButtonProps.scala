package typings
package reactDashBootstrapLib.libInputGroupButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputGroupButtonProps
  extends reactLib.reactMod.HTMLProps[InputGroupButton] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
}

object InputGroupButtonProps {
  @scala.inline
  def apply(HTMLProps: reactLib.reactMod.HTMLProps[InputGroupButton] = null, bsClass: java.lang.String = null): InputGroupButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[InputGroupButtonProps]
  }
}

