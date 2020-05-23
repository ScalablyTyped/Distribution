package typings.sharepoint

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalloutActionOptions extends js.Object {
  var disabledTooltip: String
  /** Submenu entries for the action. If defined, the action link click will popup the specified menu. */
  var menuEntries: js.Array[CalloutActionMenuEntry]
  /** Text for the action link */
  var text: String
  var tooltip: String
  /** Callback which returns if the action link is enabled */
  def isEnabledCallback(action: CalloutAction): Boolean
  /** Callback which returns if the action link is visible */
  def isVisibleCallback(action: CalloutAction): Boolean
  /** Callback that is executed when the action link is clicked.
    @param event Standard javascript event object
    @param action The action object */
  def onClickCallback(event: Event, action: CalloutAction): js.Any
}

object CalloutActionOptions {
  @scala.inline
  def apply(
    disabledTooltip: String,
    isEnabledCallback: CalloutAction => Boolean,
    isVisibleCallback: CalloutAction => Boolean,
    menuEntries: js.Array[CalloutActionMenuEntry],
    onClickCallback: (Event, CalloutAction) => js.Any,
    text: String,
    tooltip: String
  ): CalloutActionOptions = {
    val __obj = js.Dynamic.literal(disabledTooltip = disabledTooltip.asInstanceOf[js.Any], isEnabledCallback = js.Any.fromFunction1(isEnabledCallback), isVisibleCallback = js.Any.fromFunction1(isVisibleCallback), menuEntries = menuEntries.asInstanceOf[js.Any], onClickCallback = js.Any.fromFunction2(onClickCallback), text = text.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalloutActionOptions]
  }
}

