package typings
package reactDashBootstrapLib.libPanelFooterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanelFooterProps
  extends reactLib.reactMod.HTMLProps[PanelFooter] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
}

object PanelFooterProps {
  @scala.inline
  def apply(HTMLProps: reactLib.reactMod.HTMLProps[PanelFooter] = null, bsClass: java.lang.String = null): PanelFooterProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[PanelFooterProps]
  }
}

