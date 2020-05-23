package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalloutActionMenu extends js.Object {
  def addAction(action: CalloutAction): Unit
  def calculateActionWidth(): Unit
  def getActions(): js.Array[CalloutAction]
  def refreshActions(): Unit
  def render(): Unit
}

object CalloutActionMenu {
  @scala.inline
  def apply(
    addAction: CalloutAction => Unit,
    calculateActionWidth: () => Unit,
    getActions: () => js.Array[CalloutAction],
    refreshActions: () => Unit,
    render: () => Unit
  ): CalloutActionMenu = {
    val __obj = js.Dynamic.literal(addAction = js.Any.fromFunction1(addAction), calculateActionWidth = js.Any.fromFunction0(calculateActionWidth), getActions = js.Any.fromFunction0(getActions), refreshActions = js.Any.fromFunction0(refreshActions), render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[CalloutActionMenu]
  }
}

