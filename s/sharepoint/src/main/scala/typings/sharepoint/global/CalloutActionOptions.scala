package typings.sharepoint.global

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CalloutActionOptions")
@js.native
class CalloutActionOptions ()
  extends typings.sharepoint.CalloutActionOptions {
  /* CompleteClass */
  override var disabledTooltip: String = js.native
  /** Submenu entries for the action. If defined, the action link click will popup the specified menu. */
  /* CompleteClass */
  override var menuEntries: js.Array[typings.sharepoint.CalloutActionMenuEntry] = js.native
  /** Text for the action link */
  /* CompleteClass */
  override var text: String = js.native
  /* CompleteClass */
  override var tooltip: String = js.native
  /** Callback which returns if the action link is enabled */
  /* CompleteClass */
  override def isEnabledCallback(action: typings.sharepoint.CalloutAction): Boolean = js.native
  /** Callback which returns if the action link is visible */
  /* CompleteClass */
  override def isVisibleCallback(action: typings.sharepoint.CalloutAction): Boolean = js.native
  /** Callback that is executed when the action link is clicked.
    @param event Standard javascript event object
    @param action The action object */
  /* CompleteClass */
  override def onClickCallback(event: Event, action: typings.sharepoint.CalloutAction): js.Any = js.native
}

