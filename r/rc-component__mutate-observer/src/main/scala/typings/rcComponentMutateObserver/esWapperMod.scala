package typings.rcComponentMutateObserver

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esWapperMod {
  
  @JSImport("@rc-component/mutate-observer/es/wapper", JSImport.Default)
  @js.native
  open class default () extends DomWrapper
  
  @js.native
  trait DomWrapper
    extends Component[DomWrapperProps, js.Object, Any]
  
  trait DomWrapperProps extends StObject {
    
    var children: ReactNode
  }
  object DomWrapperProps {
    
    inline def apply(): DomWrapperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomWrapperProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DomWrapperProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
