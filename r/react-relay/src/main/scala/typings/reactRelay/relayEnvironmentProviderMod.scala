package typings.reactRelay

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.relayRuntime.relayStoreTypesMod.Environment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayEnvironmentProviderMod {
  
  @JSImport("react-relay/lib/relay-experimental/RelayEnvironmentProvider", "RelayEnvironmentProvider")
  @js.native
  def RelayEnvironmentProvider(props: Props): ReactElement = js.native
  
  @js.native
  trait Props extends StObject {
    
    var children: ReactNode = js.native
    
    var environment: Environment = js.native
  }
  object Props {
    
    @scala.inline
    def apply(environment: Environment): Props = {
      val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    }
  }
}
