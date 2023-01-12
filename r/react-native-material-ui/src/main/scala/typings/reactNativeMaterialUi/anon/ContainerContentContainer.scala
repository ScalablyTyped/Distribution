package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerContentContainer extends StObject {
  
  var container: js.UndefOr[ViewStyle] = js.undefined
  
  var contentContainer: js.UndefOr[ViewStyle] = js.undefined
}
object ContainerContentContainer {
  
  inline def apply(): ContainerContentContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerContentContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerContentContainer] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerNull: Self = StObject.set(x, "container", null)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setContentContainer(value: ViewStyle): Self = StObject.set(x, "contentContainer", value.asInstanceOf[js.Any])
    
    inline def setContentContainerNull: Self = StObject.set(x, "contentContainer", null)
    
    inline def setContentContainerUndefined: Self = StObject.set(x, "contentContainer", js.undefined)
  }
}
