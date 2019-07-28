package typings.rmcDashCalendar.libCalendarShortcutPanelMod

import typings.rmcDashCalendar.libDateDataTypesMod.ModelsNs.Locale
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsType extends js.Object {
  var locale: Locale = js.native
  def onSelect(): Unit = js.native
  def onSelect(startDate: Date): Unit = js.native
  def onSelect(startDate: Date, endDate: Date): Unit = js.native
}

