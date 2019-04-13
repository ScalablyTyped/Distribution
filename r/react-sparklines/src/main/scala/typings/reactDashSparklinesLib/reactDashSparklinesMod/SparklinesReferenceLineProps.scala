package typings
package reactDashSparklinesLib.reactDashSparklinesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinesReferenceLineProps extends js.Object {
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var `type`: js.UndefOr[
    reactDashSparklinesLib.reactDashSparklinesLibStrings.max | reactDashSparklinesLib.reactDashSparklinesLibStrings.min | reactDashSparklinesLib.reactDashSparklinesLibStrings.mean | reactDashSparklinesLib.reactDashSparklinesLibStrings.avg | reactDashSparklinesLib.reactDashSparklinesLibStrings.median | reactDashSparklinesLib.reactDashSparklinesLibStrings.custom
  ] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object SparklinesReferenceLineProps {
  @scala.inline
  def apply(
    style: reactLib.reactMod.CSSProperties = null,
    `type`: reactDashSparklinesLib.reactDashSparklinesLibStrings.max | reactDashSparklinesLib.reactDashSparklinesLibStrings.min | reactDashSparklinesLib.reactDashSparklinesLibStrings.mean | reactDashSparklinesLib.reactDashSparklinesLibStrings.avg | reactDashSparklinesLib.reactDashSparklinesLibStrings.median | reactDashSparklinesLib.reactDashSparklinesLibStrings.custom = null,
    value: scala.Int | scala.Double = null
  ): SparklinesReferenceLineProps = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklinesReferenceLineProps]
  }
}

