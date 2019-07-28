package typings.reactDashDayDashPicker.typesPropsMod

import typings.react.reactMod.MouseEventHandler
import typings.reactDashDayDashPicker.typesCommonMod.ClassNames
import typings.reactDashDayDashPicker.typesUtilsMod.LocaleUtils
import typings.std.Date
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionElementProps extends js.Object {
  var classNames: ClassNames
  var date: Date
  var locale: String
  var localeUtils: LocaleUtils
  var months: js.UndefOr[js.Array[String]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
}

object CaptionElementProps {
  @scala.inline
  def apply(
    classNames: ClassNames,
    date: Date,
    locale: String,
    localeUtils: LocaleUtils,
    months: js.Array[String] = null,
    onClick: MouseEventHandler[HTMLElement] = null
  ): CaptionElementProps = {
    val __obj = js.Dynamic.literal(classNames = classNames, date = date, locale = locale, localeUtils = localeUtils)
    if (months != null) __obj.updateDynamic("months")(months)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[CaptionElementProps]
  }
}

