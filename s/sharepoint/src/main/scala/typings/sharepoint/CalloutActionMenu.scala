package typings.sharepoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalloutActionMenu extends StObject {
  
  def addAction(action: CalloutAction): Unit
  
  def calculateActionWidth(): Unit
  
  def getActions(): js.Array[CalloutAction]
  
  def refreshActions(): Unit
  
  def render(): Unit
}
object CalloutActionMenu {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: CalloutActionMenu] (val x: Self) extends AnyVal {
    
    inline def setAddAction(value: CalloutAction => Unit): Self = StObject.set(x, "addAction", js.Any.fromFunction1(value))
    
    inline def setCalculateActionWidth(value: () => Unit): Self = StObject.set(x, "calculateActionWidth", js.Any.fromFunction0(value))
    
    inline def setGetActions(value: () => js.Array[CalloutAction]): Self = StObject.set(x, "getActions", js.Any.fromFunction0(value))
    
    inline def setRefreshActions(value: () => Unit): Self = StObject.set(x, "refreshActions", js.Any.fromFunction0(value))
    
    inline def setRender(value: () => Unit): Self = StObject.set(x, "render", js.Any.fromFunction0(value))
  }
}
