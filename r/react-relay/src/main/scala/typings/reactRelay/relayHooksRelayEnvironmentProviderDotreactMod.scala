package typings.reactRelay

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.relayRuntime.libStoreRelayStoreTypesMod.Environment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayHooksRelayEnvironmentProviderDotreactMod {
  
  @JSImport("react-relay/relay-hooks/RelayEnvironmentProvider.react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def RelayEnvironmentProvider(props: Props): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("RelayEnvironmentProvider")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait Props extends StObject {
    
    var children: ReactNode
    
    var environment: Environment
  }
  object Props {
    
    inline def apply(environment: Environment): Props = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    }
  }
}
