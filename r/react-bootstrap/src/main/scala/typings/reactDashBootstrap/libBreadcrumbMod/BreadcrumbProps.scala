package typings.reactDashBootstrap.libBreadcrumbMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
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
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[BreadcrumbProps]
  }
}

