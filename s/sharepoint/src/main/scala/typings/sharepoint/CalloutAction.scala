package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalloutAction extends js.Object {
  def getDisabledToolTip(): String
  def getIsDisabledCallback(action: CalloutAction): Boolean
  def getIsMenu(): Boolean
  def getIsVisibleCallback(action: CalloutAction): Boolean
  def getMenuEntries(): js.Array[CalloutActionMenuEntry]
  def getOnClickCallback(event: js.Any, action: CalloutAction): js.Any
  def getText(): String
  def getToolTop(): String
  def isEnabled(): Boolean
  def isVisible(): Boolean
  def render(): Unit
  def set(options: CalloutActionOptions): Unit
}

object CalloutAction {
  @scala.inline
  def apply(
    getDisabledToolTip: () => String,
    getIsDisabledCallback: CalloutAction => Boolean,
    getIsMenu: () => Boolean,
    getIsVisibleCallback: CalloutAction => Boolean,
    getMenuEntries: () => js.Array[CalloutActionMenuEntry],
    getOnClickCallback: (js.Any, CalloutAction) => js.Any,
    getText: () => String,
    getToolTop: () => String,
    isEnabled: () => Boolean,
    isVisible: () => Boolean,
    render: () => Unit,
    set: CalloutActionOptions => Unit
  ): CalloutAction = {
    val __obj = js.Dynamic.literal(getDisabledToolTip = js.Any.fromFunction0(getDisabledToolTip), getIsDisabledCallback = js.Any.fromFunction1(getIsDisabledCallback), getIsMenu = js.Any.fromFunction0(getIsMenu), getIsVisibleCallback = js.Any.fromFunction1(getIsVisibleCallback), getMenuEntries = js.Any.fromFunction0(getMenuEntries), getOnClickCallback = js.Any.fromFunction2(getOnClickCallback), getText = js.Any.fromFunction0(getText), getToolTop = js.Any.fromFunction0(getToolTop), isEnabled = js.Any.fromFunction0(isEnabled), isVisible = js.Any.fromFunction0(isVisible), render = js.Any.fromFunction0(render), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[CalloutAction]
  }
}

