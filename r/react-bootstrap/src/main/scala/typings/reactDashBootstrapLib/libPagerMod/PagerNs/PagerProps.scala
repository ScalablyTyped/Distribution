package typings
package reactDashBootstrapLib.libPagerMod.PagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagerProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libPagerMod.Pager] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  @JSName("onSelect")
  var onSelect_PagerProps: js.UndefOr[reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback] = js.undefined
}

object PagerProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libPagerMod.Pager] = null,
    bsClass: java.lang.String = null,
    onSelect: reactDashBootstrapLib.reactDashBootstrapMod.SelectCallback = null
  ): PagerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    __obj.asInstanceOf[PagerProps]
  }
}

