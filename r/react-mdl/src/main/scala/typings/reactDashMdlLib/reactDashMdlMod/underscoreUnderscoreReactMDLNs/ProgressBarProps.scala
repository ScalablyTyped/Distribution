package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressBarProps
  extends reactLib.reactMod.ReactNs.HTMLProps[js.Any] {
  var buffer: js.UndefOr[scala.Double] = js.undefined
  var indeterminate: js.UndefOr[scala.Boolean] = js.undefined
  var progress: js.UndefOr[scala.Double] = js.undefined
}

object ProgressBarProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[js.Any] = null,
    buffer: scala.Int | scala.Double = null,
    indeterminate: js.UndefOr[scala.Boolean] = js.undefined,
    progress: scala.Int | scala.Double = null
  ): ProgressBarProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (buffer != null) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (!js.isUndefined(indeterminate)) __obj.updateDynamic("indeterminate")(indeterminate)
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressBarProps]
  }
}

