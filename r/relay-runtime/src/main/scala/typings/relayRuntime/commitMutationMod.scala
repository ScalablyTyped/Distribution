package typings.relayRuntime

import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayNetworkTypesMod.PayloadError
import typings.relayRuntime.relayNetworkTypesMod.UploadableMap
import typings.relayRuntime.relayRuntimeTypesMod.CacheConfig
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commitMutationMod {
  
  @JSImport("relay-runtime/lib/mutations/commitMutation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def commitMutation[TOperation /* <: MutationParameters */](
    environment: Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: MutationConfig[TOperation]
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("commitMutation")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  trait MutationConfig[TOperation /* <: MutationParameters */] extends StObject {
    
    var cacheConfig: js.UndefOr[CacheConfig] = js.undefined
    
    var configs: js.UndefOr[js.Array[DeclarativeMutationConfig]] = js.undefined
    
    var mutation: GraphQLTaggedNode
    
    var onCompleted: js.UndefOr[
        (js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ /* response */ js.Any, 
          /* errors */ js.UndefOr[js.Array[PayloadError] | Null], 
          Unit
        ]) | Null
      ] = js.undefined
    
    var onError: js.UndefOr[(js.Function1[/* error */ Error, Unit]) | Null] = js.undefined
    
    var onUnsubscribe: js.UndefOr[js.Function0[js.UndefOr[Unit | Null]]] = js.undefined
    
    var optimisticResponse: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
      ] = js.undefined
    
    var optimisticUpdater: js.UndefOr[
        (SelectorStoreUpdater[
          /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
        ]) | Null
      ] = js.undefined
    
    var updater: js.UndefOr[
        (SelectorStoreUpdater[
          /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
        ]) | Null
      ] = js.undefined
    
    var uploadables: js.UndefOr[UploadableMap | Null] = js.undefined
    
    var variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
  }
  object MutationConfig {
    
    @scala.inline
    def apply[TOperation /* <: MutationParameters */](
      mutation: GraphQLTaggedNode,
      variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
    ): MutationConfig[TOperation] = {
      val __obj = js.Dynamic.literal(mutation = mutation.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[MutationConfig[TOperation]]
    }
    
    @scala.inline
    implicit class MutationConfigMutableBuilder[Self <: MutationConfig[?], TOperation /* <: MutationParameters */] (val x: Self & MutationConfig[TOperation]) extends AnyVal {
      
      @scala.inline
      def setCacheConfig(value: CacheConfig): Self = StObject.set(x, "cacheConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheConfigUndefined: Self = StObject.set(x, "cacheConfig", js.undefined)
      
      @scala.inline
      def setConfigs(value: js.Array[DeclarativeMutationConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
      
      @scala.inline
      def setConfigsVarargs(value: DeclarativeMutationConfig*): Self = StObject.set(x, "configs", js.Array(value :_*))
      
      @scala.inline
      def setMutation(value: GraphQLTaggedNode): Self = StObject.set(x, "mutation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutationFunction0(value: () => ReaderFragment | ConcreteRequest): Self = StObject.set(x, "mutation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCompleted(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ /* response */ js.Any, /* errors */ js.UndefOr[js.Array[PayloadError] | Null]) => Unit
      ): Self = StObject.set(x, "onCompleted", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCompletedNull: Self = StObject.set(x, "onCompleted", null)
      
      @scala.inline
      def setOnCompletedUndefined: Self = StObject.set(x, "onCompleted", js.undefined)
      
      @scala.inline
      def setOnError(value: /* error */ Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorNull: Self = StObject.set(x, "onError", null)
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnUnsubscribe(value: () => js.UndefOr[Unit | Null]): Self = StObject.set(x, "onUnsubscribe", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnUnsubscribeUndefined: Self = StObject.set(x, "onUnsubscribe", js.undefined)
      
      @scala.inline
      def setOptimisticResponse(
        value: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
      ): Self = StObject.set(x, "optimisticResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimisticResponseUndefined: Self = StObject.set(x, "optimisticResponse", js.undefined)
      
      @scala.inline
      def setOptimisticUpdater(
        value: (/* store */ RecordSourceSelectorProxy[
              /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
            ], /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any) => Unit
      ): Self = StObject.set(x, "optimisticUpdater", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOptimisticUpdaterNull: Self = StObject.set(x, "optimisticUpdater", null)
      
      @scala.inline
      def setOptimisticUpdaterUndefined: Self = StObject.set(x, "optimisticUpdater", js.undefined)
      
      @scala.inline
      def setUpdater(
        value: (/* store */ RecordSourceSelectorProxy[
              /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any
            ], /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any) => Unit
      ): Self = StObject.set(x, "updater", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdaterNull: Self = StObject.set(x, "updater", null)
      
      @scala.inline
      def setUpdaterUndefined: Self = StObject.set(x, "updater", js.undefined)
      
      @scala.inline
      def setUploadables(value: UploadableMap): Self = StObject.set(x, "uploadables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadablesNull: Self = StObject.set(x, "uploadables", null)
      
      @scala.inline
      def setUploadablesUndefined: Self = StObject.set(x, "uploadables", js.undefined)
      
      @scala.inline
      def setVariables(
        value: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
      ): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
  
  trait MutationParameters extends StObject {
    
    val rawResponse: js.UndefOr[js.Object] = js.undefined
  }
  object MutationParameters {
    
    @scala.inline
    def apply(): MutationParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MutationParameters]
    }
    
    @scala.inline
    implicit class MutationParametersMutableBuilder[Self <: MutationParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRawResponse(value: js.Object): Self = StObject.set(x, "rawResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawResponseUndefined: Self = StObject.set(x, "rawResponse", js.undefined)
    }
  }
}
