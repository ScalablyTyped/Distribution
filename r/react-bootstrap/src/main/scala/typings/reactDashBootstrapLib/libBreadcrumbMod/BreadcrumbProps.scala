package typings
package reactDashBootstrapLib.libBreadcrumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbProps
  extends reactLib.reactMod.HTMLProps[Breadcrumb] {
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
}

object BreadcrumbProps {
  @scala.inline
  def apply(HTMLProps: reactLib.reactMod.HTMLProps[Breadcrumb] = null, bsClass: java.lang.String = null): BreadcrumbProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[BreadcrumbProps]
  }
}

