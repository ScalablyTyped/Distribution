package typings
package reactDashDayDashPickerLib.typesPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionElementProps extends js.Object {
  var classNames: reactDashDayDashPickerLib.typesCommonMod.ClassNames
  var date: stdLib.Date
  var locale: java.lang.String
  var localeUtils: reactDashDayDashPickerLib.typesUtilsMod.LocaleUtils
  var months: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLElement]] = js.undefined
}

object CaptionElementProps {
  @scala.inline
  def apply(
    classNames: reactDashDayDashPickerLib.typesCommonMod.ClassNames,
    date: stdLib.Date,
    locale: java.lang.String,
    localeUtils: reactDashDayDashPickerLib.typesUtilsMod.LocaleUtils,
    months: js.Array[java.lang.String] = null,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLElement] = null
  ): CaptionElementProps = {
    val __obj = js.Dynamic.literal(classNames = classNames, date = date, locale = locale, localeUtils = localeUtils)
    if (months != null) __obj.updateDynamic("months")(months)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[CaptionElementProps]
  }
}

