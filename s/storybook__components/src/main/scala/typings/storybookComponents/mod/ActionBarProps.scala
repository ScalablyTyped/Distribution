package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionBarProps extends StObject {
  
  var actionItems: js.Array[ActionItem]
}
object ActionBarProps {
  
  inline def apply(actionItems: js.Array[ActionItem]): ActionBarProps = {
    val __obj = js.Dynamic.literal(actionItems = actionItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionBarProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionBarProps] (val x: Self) extends AnyVal {
    
    inline def setActionItems(value: js.Array[ActionItem]): Self = StObject.set(x, "actionItems", value.asInstanceOf[js.Any])
    
    inline def setActionItemsVarargs(value: ActionItem*): Self = StObject.set(x, "actionItems", js.Array(value*))
  }
}
