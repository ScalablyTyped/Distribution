package typings.reactDayPicker.propsMod

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.reactDayPicker.classNamesMod.ClassNames
import typings.reactDayPicker.localeUtilsMod.LocaleUtils
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
    onClick: MouseEvent[HTMLElement, NativeMouseEvent] => Unit = null
  ): CaptionElementProps = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], localeUtils = localeUtils.asInstanceOf[js.Any])
    if (months != null) __obj.updateDynamic("months")(months.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[CaptionElementProps]
  }
}

