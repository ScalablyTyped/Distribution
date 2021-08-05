package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsContainer extends StObject {
  
  var actionsContainer: js.UndefOr[ViewStyle] = js.undefined
}
object ActionsContainer {
  
  inline def apply(): ActionsContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionsContainer]
  }
  
  extension [Self <: ActionsContainer](x: Self) {
    
    inline def setActionsContainer(value: ViewStyle): Self = StObject.set(x, "actionsContainer", value.asInstanceOf[js.Any])
    
    inline def setActionsContainerNull: Self = StObject.set(x, "actionsContainer", null)
    
    inline def setActionsContainerUndefined: Self = StObject.set(x, "actionsContainer", js.undefined)
  }
}
