package typings.rmcCalendar.timePickerMod

import typings.react.mod.Component
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePicker
  extends Component[PropsType, StateType, js.Any] {
  
  def getMaxTime(): js.UndefOr[Date] = js.native
  def getMaxTime(date: Date): js.UndefOr[Date] = js.native
  
  def getMinTime(): js.UndefOr[Date] = js.native
  def getMinTime(date: Date): js.UndefOr[Date] = js.native
  
  def onDateChange(date: Date): Unit = js.native
}
