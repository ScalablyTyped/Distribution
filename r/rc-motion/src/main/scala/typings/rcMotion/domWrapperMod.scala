package typings.rcMotion

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domWrapperMod {
  
  @JSImport("rc-motion/es/DomWrapper", JSImport.Default)
  @js.native
  class default () extends DomWrapper
  
  @js.native
  trait DomWrapper
    extends Component[DomWrapperProps, js.Object, js.Any]
  
  @js.native
  trait DomWrapperProps extends StObject {
    
    var children: ReactNode = js.native
  }
  object DomWrapperProps {
    
    @scala.inline
    def apply(): DomWrapperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomWrapperProps]
    }
    
    @scala.inline
    implicit class DomWrapperPropsMutableBuilder[Self <: DomWrapperProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
