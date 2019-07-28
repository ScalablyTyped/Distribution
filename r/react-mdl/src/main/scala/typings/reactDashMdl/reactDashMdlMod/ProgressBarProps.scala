package typings.reactDashMdl.reactDashMdlMod

import typings.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarProps
  extends HTMLProps[js.Any] {
  var buffer: js.UndefOr[Double] = js.undefined
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  var progress: js.UndefOr[Double] = js.undefined
}

object ProgressBarProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[js.Any] = null,
    buffer: Int | Double = null,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    progress: Int | Double = null
  ): ProgressBarProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate)
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarProps]
  }
}

