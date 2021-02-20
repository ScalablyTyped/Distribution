package typings.reactNativeMaterialUi.mod

import typings.reactNativeMaterialUi.anon.DefaultActionsContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogDefaultActionsProps extends StObject {
  
  var actions: js.Array[String] = js.native
  
  def onActionPress(action: String): Unit = js.native
  
  var style: js.UndefOr[DefaultActionsContainer] = js.native
}
object DialogDefaultActionsProps {
  
  @scala.inline
  def apply(actions: js.Array[String], onActionPress: String => Unit): DialogDefaultActionsProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], onActionPress = js.Any.fromFunction1(onActionPress))
    __obj.asInstanceOf[DialogDefaultActionsProps]
  }
  
  @scala.inline
  implicit class DialogDefaultActionsPropsMutableBuilder[Self <: DialogDefaultActionsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setOnActionPress(value: String => Unit): Self = StObject.set(x, "onActionPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyle(value: DefaultActionsContainer): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
