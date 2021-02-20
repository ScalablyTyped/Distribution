package typings.reactFns

import typings.react.mod.Component
import typings.reactFns.typesMod.SharedRenderProps
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkNetworkMod {
  
  @JSImport("react-fns/dist/Network/Network", "Network")
  @js.native
  class Network protected ()
    extends Component[SharedRenderProps[NetworkProps], NetworkProps, js.Any] {
    def this(props: SharedRenderProps[NetworkProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[NetworkProps], context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MNetwork(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MNetwork(): Unit = js.native
    
    def handleOffline(): Unit = js.native
    
    def handleOnline(): Unit = js.native
  }
  
  @js.native
  trait NetworkProps extends StObject {
    
    var offlineAt: js.UndefOr[Date] = js.native
    
    var online: Boolean = js.native
  }
  object NetworkProps {
    
    @scala.inline
    def apply(online: Boolean): NetworkProps = {
      val __obj = js.Dynamic.literal(online = online.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkProps]
    }
    
    @scala.inline
    implicit class NetworkPropsMutableBuilder[Self <: NetworkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOfflineAt(value: Date): Self = StObject.set(x, "offlineAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOfflineAtUndefined: Self = StObject.set(x, "offlineAt", js.undefined)
      
      @scala.inline
      def setOnline(value: Boolean): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    }
  }
}
