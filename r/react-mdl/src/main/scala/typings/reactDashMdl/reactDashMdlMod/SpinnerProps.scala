package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.AllHTMLAttributes
import typings.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any] {
  var singleColor: js.UndefOr[Boolean] = js.undefined
}

object SpinnerProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    singleColor: js.UndefOr[Boolean] = js.undefined
  ): SpinnerProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(singleColor)) __obj.updateDynamic("singleColor")(singleColor)
    __obj.asInstanceOf[SpinnerProps]
  }
}

