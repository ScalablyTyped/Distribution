package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultActionsContainer extends StObject {
  
  var defaultActionsContainer: js.UndefOr[ViewStyle] = js.undefined
}
object DefaultActionsContainer {
  
  inline def apply(): DefaultActionsContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultActionsContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultActionsContainer] (val x: Self) extends AnyVal {
    
    inline def setDefaultActionsContainer(value: ViewStyle): Self = StObject.set(x, "defaultActionsContainer", value.asInstanceOf[js.Any])
    
    inline def setDefaultActionsContainerNull: Self = StObject.set(x, "defaultActionsContainer", null)
    
    inline def setDefaultActionsContainerUndefined: Self = StObject.set(x, "defaultActionsContainer", js.undefined)
  }
}
