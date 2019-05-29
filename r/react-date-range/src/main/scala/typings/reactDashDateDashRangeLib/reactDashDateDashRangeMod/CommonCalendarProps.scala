package typings
package reactDashDateDashRangeLib.reactDashDateDashRangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonCalendarProps extends js.Object {
  /** default: moment.localeData().firstDayOfWeek() */
  var firstDayOfWeek: js.UndefOr[scala.Double] = js.undefined
  /** default: DD/MM/YYY */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Calendar languages.
    * ('cn' - Chinese, 'jp' - Japanese,
    * 'fr' - French, 'it' - Italian,
    * 'de' - German, 'ko' - Korean,
    * 'es' - Spanish, 'ru' - Russian,
    * 'tr' - Turkish) default: none
    */
  var lang: js.UndefOr[LanguageType] = js.undefined
  /** default: none */
  var maxDate: js.UndefOr[DateInputType] = js.undefined
  /** default: none */
  var minDate: js.UndefOr[DateInputType] = js.undefined
  /** default: none */
  var onChange: js.UndefOr[js.Function1[/* range */ Range, scala.Unit]] = js.undefined
  /** default: none */
  var onInit: js.UndefOr[js.Function1[/* range */ Range, scala.Unit]] = js.undefined
  var theme: js.UndefOr[CalendarTheme] = js.undefined
}

object CommonCalendarProps {
  @scala.inline
  def apply(
    firstDayOfWeek: scala.Int | scala.Double = null,
    format: java.lang.String = null,
    lang: LanguageType = null,
    maxDate: DateInputType = null,
    minDate: DateInputType = null,
    onChange: /* range */ Range => scala.Unit = null,
    onInit: /* range */ Range => scala.Unit = null,
    theme: CalendarTheme = null
  ): CommonCalendarProps = {
    val __obj = js.Dynamic.literal()
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onInit != null) __obj.updateDynamic("onInit")(js.Any.fromFunction1(onInit))
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[CommonCalendarProps]
  }
}

