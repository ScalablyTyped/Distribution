package typings.sharepoint

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalloutActionOptions extends js.Object {
  var disabledTooltip: String = js.native
  /** Submenu entries for the action. If defined, the action link click will popup the specified menu. */
  var menuEntries: js.Array[CalloutActionMenuEntry] = js.native
  /** Text for the action link */
  var text: String = js.native
  var tooltip: String = js.native
  /** Callback which returns if the action link is enabled */
  def isEnabledCallback(action: CalloutAction): Boolean = js.native
  /** Callback which returns if the action link is visible */
  def isVisibleCallback(action: CalloutAction): Boolean = js.native
  /** Callback that is executed when the action link is clicked.
    @param event Standard javascript event object
    @param action The action object */
  def onClickCallback(event: Event, action: CalloutAction): js.Any = js.native
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
  @scala.inline
  implicit class CalloutActionOptionsOps[Self <: CalloutActionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisabledTooltip(value: String): Self = this.set("disabledTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEnabledCallback(value: CalloutAction => Boolean): Self = this.set("isEnabledCallback", js.Any.fromFunction1(value))
    @scala.inline
    def setIsVisibleCallback(value: CalloutAction => Boolean): Self = this.set("isVisibleCallback", js.Any.fromFunction1(value))
    @scala.inline
    def setMenuEntriesVarargs(value: CalloutActionMenuEntry*): Self = this.set("menuEntries", js.Array(value :_*))
    @scala.inline
    def setMenuEntries(value: js.Array[CalloutActionMenuEntry]): Self = this.set("menuEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnClickCallback(value: (Event, CalloutAction) => js.Any): Self = this.set("onClickCallback", js.Any.fromFunction2(value))
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
  }
  
}

