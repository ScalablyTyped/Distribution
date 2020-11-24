package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalloutActionMenu extends js.Object {
  
  def addAction(action: CalloutAction): Unit = js.native
  
  def calculateActionWidth(): Unit = js.native
  
  def getActions(): js.Array[CalloutAction] = js.native
  
  def refreshActions(): Unit = js.native
  
  def render(): Unit = js.native
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
  
  @scala.inline
  implicit class CalloutActionMenuOps[Self <: CalloutActionMenu] (val x: Self) extends AnyVal {
    
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
    def setAddAction(value: CalloutAction => Unit): Self = this.set("addAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalculateActionWidth(value: () => Unit): Self = this.set("calculateActionWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetActions(value: () => js.Array[CalloutAction]): Self = this.set("getActions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRefreshActions(value: () => Unit): Self = this.set("refreshActions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRender(value: () => Unit): Self = this.set("render", js.Any.fromFunction0(value))
  }
}
