package typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import typings.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateLocalizerSpec extends js.Object {
  var formats: Formats
  var propType: js.UndefOr[Validator[_]] = js.undefined
  def firstOfWeek(culture: Culture): Double
  def format(value: FormatInput, format: String, culture: Culture): String
}

object DateLocalizerSpec {
  @scala.inline
  def apply(
    firstOfWeek: Culture => Double,
    format: (FormatInput, String, Culture) => String,
    formats: Formats,
    propType: Validator[_] = null
  ): DateLocalizerSpec = {
    val __obj = js.Dynamic.literal(firstOfWeek = js.Any.fromFunction1(firstOfWeek), format = js.Any.fromFunction3(format), formats = formats)
    if (propType != null) __obj.updateDynamic("propType")(propType)
    __obj.asInstanceOf[DateLocalizerSpec]
  }
}

