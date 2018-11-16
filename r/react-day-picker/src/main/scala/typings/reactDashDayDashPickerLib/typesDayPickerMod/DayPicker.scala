package typings
package reactDashDayDashPickerLib.typesDayPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DayPicker
  extends reactLib.reactMod.Component[reactDashDayDashPickerLib.typesPropsMod.DayPickerProps, js.Any, js.Any] {
  val dayPicker: reactLib.HTMLDivElement = js.native
  def showMonth(month: stdLib.Date): scala.Unit = js.native
  def showNextMonth(): scala.Unit = js.native
  def showNextYear(): scala.Unit = js.native
  def showPreviousMonth(): scala.Unit = js.native
  def showPreviousYear(): scala.Unit = js.native
}

