package typings.reactDashBigDashCalendar.reactDashBigDashCalendarMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TitleOptions
  extends /* propName */ StringDictionary[js.Any] {
  var culture: js.UndefOr[String] = js.undefined
  var formats: js.Array[DateFormat]
}

object TitleOptions {
  @scala.inline
  def apply(
    formats: js.Array[DateFormat],
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    culture: String = null
  ): TitleOptions = {
    val __obj = js.Dynamic.literal(formats = formats)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (culture != null) __obj.updateDynamic("culture")(culture)
    __obj.asInstanceOf[TitleOptions]
  }
}

