package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaListItemMod {
  
  @JSImport("react-bootstrap/lib/MediaListItem", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[MediaListItemProps, js.Object, Any]
  
  type MediaListItem = Component[MediaListItemProps, js.Object, Any]
  
  trait MediaListItemProps
    extends StObject
       with HTMLProps[MediaListItem] {
    
    var componentClass: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object MediaListItemProps {
    
    inline def apply(): MediaListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaListItemProps]
    }
    
    extension [Self <: MediaListItemProps](x: Self) {
      
      inline def setComponentClass(value: ElementType[Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
