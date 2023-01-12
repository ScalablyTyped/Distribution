package typings.reactNativePaper

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNativePaper.libTypescriptComponentsPortalPortalHostMod.PortalMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsPortalPortalConsumerMod {
  
  @JSImport("react-native-paper/lib/typescript/components/Portal/PortalConsumer", JSImport.Default)
  @js.native
  open class default () extends PortalConsumer
  
  @js.native
  trait PortalConsumer
    extends Component[Props, js.Object, Any] {
    
    /* private */ var checkManager: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPortalConsumer(): js.Promise[Unit] = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPortalConsumer(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPortalConsumer(): Unit = js.native
    
    /* private */ var key: Any = js.native
  }
  
  trait Props extends StObject {
    
    var children: ReactNode
    
    var manager: PortalMethods
  }
  object Props {
    
    inline def apply(manager: PortalMethods): Props = {
      val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setManager(value: PortalMethods): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
    }
  }
}
