package typings.reactMdl.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
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
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(singleColor)) __obj.updateDynamic("singleColor")(singleColor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerProps]
  }
}

