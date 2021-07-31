package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsContainer extends StObject {
  
  var actionsContainer: js.UndefOr[ViewStyle] = js.undefined
}
object ActionsContainer {
  
  @scala.inline
  def apply(): ActionsContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionsContainer]
  }
  
  @scala.inline
  implicit class ActionsContainerMutableBuilder[Self <: ActionsContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionsContainer(value: ViewStyle): Self = StObject.set(x, "actionsContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsContainerNull: Self = StObject.set(x, "actionsContainer", null)
    
    @scala.inline
    def setActionsContainerUndefined: Self = StObject.set(x, "actionsContainer", js.undefined)
  }
}
