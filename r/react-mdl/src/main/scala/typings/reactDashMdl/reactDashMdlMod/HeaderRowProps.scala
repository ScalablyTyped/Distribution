package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderRowProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any] {
   // string | JSX.Element
  var hideSpacer: js.UndefOr[Boolean] = js.undefined
  @JSName("title")
  var title_HeaderRowProps: js.UndefOr[js.Any] = js.undefined
}

object HeaderRowProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    hideSpacer: js.UndefOr[Boolean] = js.undefined,
    title: js.Any = null
  ): HeaderRowProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(hideSpacer)) __obj.updateDynamic("hideSpacer")(hideSpacer)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[HeaderRowProps]
  }
}

