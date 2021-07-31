package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.TextStyle
import typings.reactNativeMaterialUi.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  var container: js.UndefOr[ViewStyle] = js.undefined
  
  var icon: js.UndefOr[TextStyle] = js.undefined
  
  var positionContainer: js.UndefOr[ViewStyle] = js.undefined
}
object Container {
  
  @scala.inline
  def apply(): Container = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit class ContainerMutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerNull: Self = StObject.set(x, "container", null)
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setIcon(value: TextStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconNull: Self = StObject.set(x, "icon", null)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setPositionContainer(value: ViewStyle): Self = StObject.set(x, "positionContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionContainerNull: Self = StObject.set(x, "positionContainer", null)
    
    @scala.inline
    def setPositionContainerUndefined: Self = StObject.set(x, "positionContainer", js.undefined)
  }
}
