package typings.reactMdl.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarProps
  extends AllHTMLAttributes[js.Any]
     with ClassAttributes[js.Any] {
  var buffer: js.UndefOr[Double] = js.undefined
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  var progress: js.UndefOr[Double] = js.undefined
}

object ProgressBarProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[js.Any] = null,
    ClassAttributes: ClassAttributes[js.Any] = null,
    buffer: js.UndefOr[Double] = js.undefined,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    progress: js.UndefOr[Double] = js.undefined
  ): ProgressBarProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(progress)) __obj.updateDynamic("progress")(progress.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarProps]
  }
}

