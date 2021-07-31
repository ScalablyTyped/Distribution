package typings.relayRuntime

import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applyOptimisticMutationMod {
  
  @JSImport("relay-runtime/lib/mutations/applyOptimisticMutation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def applyOptimisticMutation(environment: Environment, config: OptimisticMutationConfig): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("applyOptimisticMutation")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  trait OptimisticMutationConfig extends StObject {
    
    var configs: js.UndefOr[js.Array[DeclarativeMutationConfig] | Null] = js.undefined
    
    var mutation: GraphQLTaggedNode
    
    var optimisticResponse: js.UndefOr[js.Object] = js.undefined
    
    var optimisticUpdater: js.UndefOr[SelectorStoreUpdater[js.Object] | Null] = js.undefined
    
    var variables: Variables
  }
  object OptimisticMutationConfig {
    
    @scala.inline
    def apply(mutation: GraphQLTaggedNode, variables: Variables): OptimisticMutationConfig = {
      val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptimisticMutationConfig]
    }
    
    @scala.inline
    implicit class OptimisticMutationConfigMutableBuilder[Self <: OptimisticMutationConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigs(value: js.Array[DeclarativeMutationConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigsNull: Self = StObject.set(x, "configs", null)
      
      @scala.inline
      def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
      
      @scala.inline
      def setConfigsVarargs(value: DeclarativeMutationConfig*): Self = StObject.set(x, "configs", js.Array(value :_*))
      
      @scala.inline
      def setMutation(value: GraphQLTaggedNode): Self = StObject.set(x, "mutation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutationFunction0(value: () => ReaderFragment | ConcreteRequest): Self = StObject.set(x, "mutation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOptimisticResponse(value: js.Object): Self = StObject.set(x, "optimisticResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimisticResponseUndefined: Self = StObject.set(x, "optimisticResponse", js.undefined)
      
      @scala.inline
      def setOptimisticUpdater(value: (/* store */ RecordSourceSelectorProxy[js.Object], js.Object) => Unit): Self = StObject.set(x, "optimisticUpdater", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOptimisticUpdaterNull: Self = StObject.set(x, "optimisticUpdater", null)
      
      @scala.inline
      def setOptimisticUpdaterUndefined: Self = StObject.set(x, "optimisticUpdater", js.undefined)
      
      @scala.inline
      def setVariables(value: Variables): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
}
