package typings.reactDashIntl

import typings.reactDashIntl.reactDashIntlStrings.day
import typings.reactDashIntl.reactDashIntlStrings.hour
import typings.reactDashIntl.reactDashIntlStrings.minute
import typings.reactDashIntl.reactDashIntlStrings.month
import typings.reactDashIntl.reactDashIntlStrings.quarter
import typings.reactDashIntl.reactDashIntlStrings.second
import typings.reactDashIntl.reactDashIntlStrings.week
import typings.reactDashIntl.reactDashIntlStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentValueInSeconds extends js.Object {
  var currentValueInSeconds: Double
  var prevUnit: js.UndefOr[day | hour | minute | month | second | year | week | quarter] = js.undefined
  var prevValue: js.UndefOr[Double] = js.undefined
}

object Anon_CurrentValueInSeconds {
  @scala.inline
  def apply(
    currentValueInSeconds: Double,
    prevUnit: day | hour | minute | month | second | year | week | quarter = null,
    prevValue: Int | Double = null
  ): Anon_CurrentValueInSeconds = {
    val __obj = js.Dynamic.literal(currentValueInSeconds = currentValueInSeconds)
    if (prevUnit != null) __obj.updateDynamic("prevUnit")(prevUnit.asInstanceOf[js.Any])
    if (prevValue != null) __obj.updateDynamic("prevValue")(prevValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CurrentValueInSeconds]
  }
}

