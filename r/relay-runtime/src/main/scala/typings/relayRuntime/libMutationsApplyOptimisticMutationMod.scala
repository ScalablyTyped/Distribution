package typings.relayRuntime

import typings.relayRuntime.libMutationsRelayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typings.relayRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.libStoreRelayStoreTypesMod.Environment
import typings.relayRuntime.libStoreRelayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.libStoreRelayStoreTypesMod.SelectorStoreUpdater
import typings.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import typings.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Disposable
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Variables
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMutationsApplyOptimisticMutationMod {
  
  @JSImport("relay-runtime/lib/mutations/applyOptimisticMutation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyOptimisticMutation(environment: Environment, config: OptimisticMutationConfig): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOptimisticMutation")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  trait OptimisticMutationConfig extends StObject {
    
    var configs: js.UndefOr[js.Array[DeclarativeMutationConfig] | Null] = js.undefined
    
    var mutation: GraphQLTaggedNode
    
    var optimisticResponse: js.UndefOr[js.Object] = js.undefined
    
    var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
    
    var variables: Variables
  }
  object OptimisticMutationConfig {
    
    inline def apply(mutation: GraphQLTaggedNode, variables: Variables): OptimisticMutationConfig = {
      val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptimisticMutationConfig]
    }
    
    extension [Self <: OptimisticMutationConfig](x: Self) {
      
      inline def setConfigs(value: js.Array[DeclarativeMutationConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
      
      inline def setConfigsNull: Self = StObject.set(x, "configs", null)
      
      inline def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
      
      inline def setConfigsVarargs(value: DeclarativeMutationConfig*): Self = StObject.set(x, "configs", js.Array(value*))
      
      inline def setMutation(value: GraphQLTaggedNode): Self = StObject.set(x, "mutation", value.asInstanceOf[js.Any])
      
      inline def setMutationFunction0(value: () => ReaderFragment | ConcreteRequest): Self = StObject.set(x, "mutation", js.Any.fromFunction0(value))
      
      inline def setOptimisticResponse(value: js.Object): Self = StObject.set(x, "optimisticResponse", value.asInstanceOf[js.Any])
      
      inline def setOptimisticResponseUndefined: Self = StObject.set(x, "optimisticResponse", js.undefined)
      
      inline def setOptimisticUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit): Self = StObject.set(x, "optimisticUpdater", js.Any.fromFunction2(value))
      
      inline def setOptimisticUpdaterNull: Self = StObject.set(x, "optimisticUpdater", null)
      
      inline def setOptimisticUpdaterUndefined: Self = StObject.set(x, "optimisticUpdater", js.undefined)
      
      inline def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
}
