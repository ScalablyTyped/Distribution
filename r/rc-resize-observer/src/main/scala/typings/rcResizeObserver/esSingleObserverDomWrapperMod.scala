package typings.rcResizeObserver

import typings.react.mod.Component
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esSingleObserverDomWrapperMod {
  
  @JSImport("rc-resize-observer/es/SingleObserver/DomWrapper", JSImport.Default)
  @js.native
  open class default () extends DomWrapper
  
  @js.native
  trait DomWrapper
    extends Component[DomWrapperProps, js.Object, Any]
  
  trait DomWrapperProps extends StObject {
    
    var children: ReactElement
  }
  object DomWrapperProps {
    
    inline def apply(children: ReactElement): DomWrapperProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomWrapperProps]
    }
    
    extension [Self <: DomWrapperProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
}
