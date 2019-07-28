package typings.reactDashBootstrap.libBreadcrumbMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbProps extends HTMLProps[Breadcrumb] {
  var bsClass: js.UndefOr[String] = js.undefined
}

object BreadcrumbProps {
  @scala.inline
  def apply(HTMLProps: HTMLProps[Breadcrumb] = null, bsClass: String = null): BreadcrumbProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[BreadcrumbProps]
  }
}

