package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMediaHeadingMod {
  
  @JSImport("react-bootstrap/lib/MediaHeading", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[MediaHeadingProps, js.Object, Any]
  
  type MediaHeading = Component[MediaHeadingProps, js.Object, Any]
  
  trait MediaHeadingProps
    extends StObject
       with HTMLProps[MediaHeading] {
    
    var componentClass: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object MediaHeadingProps {
    
    inline def apply(): MediaHeadingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaHeadingProps]
    }
    
    extension [Self <: MediaHeadingProps](x: Self) {
      
      inline def setComponentClass(value: ElementType[Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
