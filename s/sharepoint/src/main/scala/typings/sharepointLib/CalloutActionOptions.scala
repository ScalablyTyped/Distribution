package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CalloutActionOptions")
@js.native
class CalloutActionOptions () extends js.Object {
  var disabledTooltip: java.lang.String = js.native
  /** Submenu entries for the action. If defined, the action link click will popup the specified menu. */
  var menuEntries: js.Array[CalloutActionMenuEntry] = js.native
  /** Text for the action link */
  var text: java.lang.String = js.native
  var tooltip: java.lang.String = js.native
  /** Callback which returns if the action link is enabled */
  def isEnabledCallback(action: CalloutAction): scala.Boolean = js.native
  /** Callback which returns if the action link is visible */
  def isVisibleCallback(action: CalloutAction): scala.Boolean = js.native
  /** Callback that is executed when the action link is clicked.
    @param event Standard javascript event object
    @param action The action object */
  def onClickCallback(event: stdLib.Event, action: CalloutAction): js.Any = js.native
}

