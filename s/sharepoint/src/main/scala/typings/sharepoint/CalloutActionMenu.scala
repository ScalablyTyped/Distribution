package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CalloutActionMenu")
@js.native
class CalloutActionMenu protected () extends js.Object {
  def this(actionsId: js.Any) = this()
  def addAction(action: CalloutAction): Unit = js.native
  def calculateActionWidth(): Unit = js.native
  def getActions(): js.Array[CalloutAction] = js.native
  def refreshActions(): Unit = js.native
  def render(): Unit = js.native
}

