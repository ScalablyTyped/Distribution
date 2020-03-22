package typings.reactIntl.mod

import typings.formatjsIntlRelativetimeformat.mod.IntlRelativeTimeFormatOptions
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<intl-messageformat.intl-messageformat.Formats> */
trait CustomFormats extends js.Object {
  var date: js.UndefOr[Record[String, DateTimeFormatOptions]] = js.undefined
  var number: js.UndefOr[Record[String, NumberFormatOptions]] = js.undefined
  var relative: js.UndefOr[Record[String, IntlRelativeTimeFormatOptions]] = js.undefined
  var time: js.UndefOr[Record[String, DateTimeFormatOptions]] = js.undefined
}

object CustomFormats {
  @scala.inline
  def apply(
    date: Record[String, DateTimeFormatOptions] = null,
    number: Record[String, NumberFormatOptions] = null,
    relative: Record[String, IntlRelativeTimeFormatOptions] = null,
    time: Record[String, DateTimeFormatOptions] = null
  ): CustomFormats = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (relative != null) __obj.updateDynamic("relative")(relative.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFormats]
  }
}

