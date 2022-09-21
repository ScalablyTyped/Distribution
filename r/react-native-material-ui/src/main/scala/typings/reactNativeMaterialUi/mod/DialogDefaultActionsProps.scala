package typings.reactNativeMaterialUi.mod

import typings.reactNativeMaterialUi.anon.DefaultActionsContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogDefaultActionsProps extends StObject {
  
  var actions: js.Array[String]
  
  def onActionPress(action: String): Unit
  
  var style: js.UndefOr[DefaultActionsContainer] = js.undefined
}
object DialogDefaultActionsProps {
  
  inline def apply(actions: js.Array[String], onActionPress: String => Unit): DialogDefaultActionsProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], onActionPress = js.Any.fromFunction1(onActionPress))
    __obj.asInstanceOf[DialogDefaultActionsProps]
  }
  
  extension [Self <: DialogDefaultActionsProps](x: Self) {
    
    inline def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setOnActionPress(value: String => Unit): Self = StObject.set(x, "onActionPress", js.Any.fromFunction1(value))
    
    inline def setStyle(value: DefaultActionsContainer): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
