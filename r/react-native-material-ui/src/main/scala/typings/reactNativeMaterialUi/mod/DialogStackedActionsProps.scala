package typings.reactNativeMaterialUi.mod

import typings.reactNativeMaterialUi.anon.StackedActionsContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogStackedActionsProps extends StObject {
  
  var actions: js.Array[String]
  
  def onActionPress(action: String): Unit
  
  var style: js.UndefOr[StackedActionsContainer] = js.undefined
}
object DialogStackedActionsProps {
  
  @scala.inline
  def apply(actions: js.Array[String], onActionPress: String => Unit): DialogStackedActionsProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], onActionPress = js.Any.fromFunction1(onActionPress))
    __obj.asInstanceOf[DialogStackedActionsProps]
  }
  
  @scala.inline
  implicit class DialogStackedActionsPropsMutableBuilder[Self <: DialogStackedActionsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setOnActionPress(value: String => Unit): Self = StObject.set(x, "onActionPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyle(value: StackedActionsContainer): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
