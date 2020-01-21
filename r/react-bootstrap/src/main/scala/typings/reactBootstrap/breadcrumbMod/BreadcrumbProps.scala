package typings.reactBootstrap.breadcrumbMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbProps
  extends AllHTMLAttributes[Breadcrumb]
     with ClassAttributes[Breadcrumb] {
  var bsClass: js.UndefOr[String] = js.undefined
}

object BreadcrumbProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[Breadcrumb] = null,
    ClassAttributes: ClassAttributes[Breadcrumb] = null,
    bsClass: String = null
  ): BreadcrumbProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbProps]
  }
}

