package typings
package reactDashBootstrapLib.libPageHeaderMod.PageHeaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageHeaderProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libPageHeaderMod.PageHeader] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
}

object PageHeaderProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libPageHeaderMod.PageHeader] = null,
    bsClass: java.lang.String = null
  ): PageHeaderProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[PageHeaderProps]
  }
}

