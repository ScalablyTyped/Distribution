package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CalloutAction")
@js.native
class CalloutAction protected () extends js.Object {
  def this(options: CalloutActionOptions) = this()
  def getDisabledToolTip(): java.lang.String = js.native
  def getIsDisabledCallback(action: CalloutAction): scala.Boolean = js.native
  def getIsMenu(): scala.Boolean = js.native
  def getIsVisibleCallback(action: CalloutAction): scala.Boolean = js.native
  def getMenuEntries(): js.Array[CalloutActionMenuEntry] = js.native
  def getOnClickCallback(event: js.Any, action: CalloutAction): js.Any = js.native
  def getText(): java.lang.String = js.native
  def getToolTop(): java.lang.String = js.native
  def isEnabled(): scala.Boolean = js.native
  def isVisible(): scala.Boolean = js.native
  def render(): scala.Unit = js.native
  def set(options: CalloutActionOptions): scala.Unit = js.native
}

