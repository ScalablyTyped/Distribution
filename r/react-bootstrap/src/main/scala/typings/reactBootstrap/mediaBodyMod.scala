package typings.reactBootstrap

import typings.react.mod.ClassAttributes
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mediaBodyMod {
  
  @JSImport("react-bootstrap/lib/MediaBody", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[MediaBodyProps, js.Object, Any]
  
  type MediaBody = Component[MediaBodyProps, js.Object, Any]
  
  trait MediaBodyProps
    extends StObject
       with ClassAttributes[MediaBody] {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var componentClass: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object MediaBodyProps {
    
    inline def apply(): MediaBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaBodyProps]
    }
    
    extension [Self <: MediaBodyProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setComponentClass(value: ElementType[Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
