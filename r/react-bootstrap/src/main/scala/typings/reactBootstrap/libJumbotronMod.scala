package typings.reactBootstrap

import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJumbotronMod {
  
  @JSImport("react-bootstrap/lib/Jumbotron", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[JumbotronProps, js.Object, Any]
  
  type Jumbotron = Component[JumbotronProps, js.Object, Any]
  
  trait JumbotronProps
    extends StObject
       with HTMLProps[Jumbotron] {
    
    var componentClass: js.UndefOr[ElementType[Any]] = js.undefined
  }
  object JumbotronProps {
    
    inline def apply(): JumbotronProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JumbotronProps]
    }
    
    extension [Self <: JumbotronProps](x: Self) {
      
      inline def setComponentClass(value: ElementType[Any]): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
    }
  }
}
