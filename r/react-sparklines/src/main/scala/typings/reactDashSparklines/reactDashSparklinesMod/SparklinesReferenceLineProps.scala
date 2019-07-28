package typings.reactDashSparklines.reactDashSparklinesMod

import typings.react.reactMod.CSSProperties
import typings.reactDashSparklines.reactDashSparklinesStrings.avg
import typings.reactDashSparklines.reactDashSparklinesStrings.custom
import typings.reactDashSparklines.reactDashSparklinesStrings.max
import typings.reactDashSparklines.reactDashSparklinesStrings.mean
import typings.reactDashSparklines.reactDashSparklinesStrings.median
import typings.reactDashSparklines.reactDashSparklinesStrings.min
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklinesReferenceLineProps extends js.Object {
  var style: js.UndefOr[CSSProperties] = js.undefined
  var `type`: js.UndefOr[max | min | mean | avg | median | custom] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object SparklinesReferenceLineProps {
  @scala.inline
  def apply(
    style: CSSProperties = null,
    `type`: max | min | mean | avg | median | custom = null,
    value: Int | Double = null
  ): SparklinesReferenceLineProps = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklinesReferenceLineProps]
  }
}

