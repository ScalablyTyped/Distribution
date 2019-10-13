package typings.reactDashBootstrap.libPageHeaderMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageHeaderProps
  extends AllHTMLAttributes[PageHeader]
     with ClassAttributes[PageHeader] {
  var bsClass: js.UndefOr[String] = js.undefined
}

object PageHeaderProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[PageHeader] = null,
    ClassAttributes: ClassAttributes[PageHeader] = null,
    bsClass: String = null
  ): PageHeaderProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    __obj.asInstanceOf[PageHeaderProps]
  }
}

