package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackedActionsContainer extends StObject {
  
  var stackedActionsContainer: js.UndefOr[ViewStyle] = js.undefined
}
object StackedActionsContainer {
  
  @scala.inline
  def apply(): StackedActionsContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackedActionsContainer]
  }
  
  @scala.inline
  implicit class StackedActionsContainerMutableBuilder[Self <: StackedActionsContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackedActionsContainer(value: ViewStyle): Self = StObject.set(x, "stackedActionsContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackedActionsContainerNull: Self = StObject.set(x, "stackedActionsContainer", null)
    
    @scala.inline
    def setStackedActionsContainerUndefined: Self = StObject.set(x, "stackedActionsContainer", js.undefined)
  }
}
