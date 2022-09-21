package typings.reactFns

import typings.react.mod.Component
import typings.reactFns.typesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkNetworkMod {
  
  @JSImport("react-fns/dist/Network/Network", "Network")
  @js.native
  open class Network protected () extends Component[SharedRenderProps[NetworkProps], NetworkProps, Any] {
    def this(props: SharedRenderProps[NetworkProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[NetworkProps], context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MNetwork(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MNetwork(): Unit = js.native
    
    def handleOffline(): Unit = js.native
    
    def handleOnline(): Unit = js.native
  }
  
  trait NetworkProps extends StObject {
    
    var offlineAt: js.UndefOr[js.Date] = js.undefined
    
    var online: Boolean
  }
  object NetworkProps {
    
    inline def apply(online: Boolean): NetworkProps = {
      val __obj = js.Dynamic.literal(online = online.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkProps]
    }
    
    extension [Self <: NetworkProps](x: Self) {
      
      inline def setOfflineAt(value: js.Date): Self = StObject.set(x, "offlineAt", value.asInstanceOf[js.Any])
      
      inline def setOfflineAtUndefined: Self = StObject.set(x, "offlineAt", js.undefined)
      
      inline def setOnline(value: Boolean): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    }
  }
}
