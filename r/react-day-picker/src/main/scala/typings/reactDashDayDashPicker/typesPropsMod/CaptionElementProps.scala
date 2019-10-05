package typings.reactDashDayDashPicker.typesPropsMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.reactDashDayDashPicker.Anon_Day
import typings.reactDashDayDashPicker.typesCommonMod.ClassNames
import typings.std.Date
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionElementProps extends js.Object {
  var classNames: ClassNames
  var date: Date
  var locale: String
  var localeUtils: Anon_Day
  var months: js.UndefOr[js.Array[String]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
}

object CaptionElementProps {
  @scala.inline
  def apply(
    classNames: ClassNames,
    date: Date,
    locale: String,
    localeUtils: Anon_Day,
    months: js.Array[String] = null,
    onClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null
  ): CaptionElementProps = {
    val __obj = js.Dynamic.literal(classNames = classNames, date = date, locale = locale, localeUtils = localeUtils)
    if (months != null) __obj.updateDynamic("months")(months)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[CaptionElementProps]
  }
}

