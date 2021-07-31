package typings.reactDataGrid.AdazzleReactDataGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionButton extends StObject {
  
  def callback(): Unit
  
  var icon: String
}
object ActionButton {
  
  @scala.inline
  def apply(callback: () => Unit, icon: String): ActionButton = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionButton]
  }
  
  @scala.inline
  implicit class ActionButtonMutableBuilder[Self <: ActionButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
  }
}
