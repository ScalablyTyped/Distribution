package typings.rmcCalendar.confirmPanelMod

import typings.react.mod.Component
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmPanel
  extends Component[ConfirmPanelPropsType, js.Object, js.Any] {
  
  def formatDate(date: Date): String = js.native
  
  def onConfirm(): Unit = js.native
}
