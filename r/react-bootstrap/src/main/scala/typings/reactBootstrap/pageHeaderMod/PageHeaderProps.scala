package typings.reactBootstrap.pageHeaderMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
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
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageHeaderProps]
  }
}

