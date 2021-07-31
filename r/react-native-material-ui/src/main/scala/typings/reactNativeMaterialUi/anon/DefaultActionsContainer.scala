package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultActionsContainer extends StObject {
  
  var defaultActionsContainer: js.UndefOr[ViewStyle] = js.undefined
}
object DefaultActionsContainer {
  
  @scala.inline
  def apply(): DefaultActionsContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultActionsContainer]
  }
  
  @scala.inline
  implicit class DefaultActionsContainerMutableBuilder[Self <: DefaultActionsContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultActionsContainer(value: ViewStyle): Self = StObject.set(x, "defaultActionsContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultActionsContainerNull: Self = StObject.set(x, "defaultActionsContainer", null)
    
    @scala.inline
    def setDefaultActionsContainerUndefined: Self = StObject.set(x, "defaultActionsContainer", js.undefined)
  }
}
