package typings.reactNativeMaterialUi.anon

import typings.reactNativeMaterialUi.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerIcon extends StObject {
  
  var container: js.UndefOr[ViewStyle] = js.undefined
  
  var icon: js.UndefOr[ViewStyle] = js.undefined
}
object ContainerIcon {
  
  inline def apply(): ContainerIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerIcon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerIcon] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerNull: Self = StObject.set(x, "container", null)
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setIcon(value: ViewStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconNull: Self = StObject.set(x, "icon", null)
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
  }
}
