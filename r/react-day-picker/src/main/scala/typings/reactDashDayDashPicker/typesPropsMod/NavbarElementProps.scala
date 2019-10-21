package typings.reactDashDayDashPicker.typesPropsMod

import typings.reactDashDayDashPicker.Anon_NextMonth
import typings.reactDashDayDashPicker.typesCommonMod.ClassNames
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavbarElementProps extends js.Object {
  var className: String = js.native
  var classNames: ClassNames = js.native
  var dir: js.UndefOr[String] = js.native
  var labels: Anon_NextMonth = js.native
  var locale: String = js.native
  var localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any = js.native
  var month: Date = js.native
  var nextMonth: Date = js.native
  var previousMonth: Date = js.native
  var showNextButton: Boolean = js.native
  var showPreviousButton: Boolean = js.native
  def onNextClick(): Unit = js.native
  def onNextClick(callback: js.Function0[Unit]): Unit = js.native
  def onPreviousClick(): Unit = js.native
  def onPreviousClick(callback: js.Function0[Unit]): Unit = js.native
}

