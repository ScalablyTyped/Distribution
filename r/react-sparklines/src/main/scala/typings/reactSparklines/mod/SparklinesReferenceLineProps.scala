package typings.reactSparklines.mod

import typings.react.mod.CSSProperties
import typings.reactSparklines.reactSparklinesStrings.avg
import typings.reactSparklines.reactSparklinesStrings.custom
import typings.reactSparklines.reactSparklinesStrings.max
import typings.reactSparklines.reactSparklinesStrings.mean
import typings.reactSparklines.reactSparklinesStrings.median
import typings.reactSparklines.reactSparklinesStrings.min
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
    value: js.UndefOr[Double] = js.undefined
  ): SparklinesReferenceLineProps = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklinesReferenceLineProps]
  }
}

