package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardActionProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any] {
  var border: js.UndefOr[Boolean] = js.undefined
}

object CardActionProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    border: js.UndefOr[Boolean] = js.undefined
  ): CardActionProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border)
    __obj.asInstanceOf[CardActionProps]
  }
}

