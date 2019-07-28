package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CalloutAction")
@js.native
class CalloutAction protected () extends js.Object {
  def this(options: CalloutActionOptions) = this()
  def getDisabledToolTip(): String = js.native
  def getIsDisabledCallback(action: CalloutAction): Boolean = js.native
  def getIsMenu(): Boolean = js.native
  def getIsVisibleCallback(action: CalloutAction): Boolean = js.native
  def getMenuEntries(): js.Array[CalloutActionMenuEntry] = js.native
  def getOnClickCallback(event: js.Any, action: CalloutAction): js.Any = js.native
  def getText(): String = js.native
  def getToolTop(): String = js.native
  def isEnabled(): Boolean = js.native
  def isVisible(): Boolean = js.native
  def render(): Unit = js.native
  def set(options: CalloutActionOptions): Unit = js.native
}

