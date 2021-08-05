package typings.reactDataGrid.AdazzleReactDataGrid

import typings.reactDataGrid.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionMenu extends StObject {
  
  var actions: js.Array[Callback]
  
  var icon: String
}
object ActionMenu {
  
  inline def apply(actions: js.Array[Callback], icon: String): ActionMenu = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMenu]
  }
  
  extension [Self <: ActionMenu](x: Self) {
    
    inline def setActions(value: js.Array[Callback]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: Callback*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
  }
}
