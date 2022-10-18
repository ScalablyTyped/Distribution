package typings.reactRelay

import typings.relayRuntime.libMutationsCommitMutationMod.MutationConfig
import typings.relayRuntime.libMutationsCommitMutationMod.MutationParameters
import typings.relayRuntime.libMutationsRelayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typings.relayRuntime.libNetworkRelayNetworkTypesMod.PayloadError
import typings.relayRuntime.libNetworkRelayNetworkTypesMod.UploadableMap
import typings.relayRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.libStoreRelayStoreTypesMod.Environment
import typings.relayRuntime.libStoreRelayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.libStoreRelayStoreTypesMod.SelectorStoreUpdater
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Disposable
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.VariablesOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relayHooksUseMutationMod {
  
  @JSImport("react-relay/relay-hooks/useMutation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useMutation[TMutation /* <: MutationParameters */](mutation: GraphQLTaggedNode): js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutation.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean]]
  inline def useMutation[TMutation /* <: MutationParameters */](
    mutation: GraphQLTaggedNode,
    commitMutationFn: js.Function2[/* environment */ Environment, /* config */ MutationConfig[TMutation], Disposable]
  ): js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutation.asInstanceOf[js.Any], commitMutationFn.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean]]
  
  trait UseMutationConfig[TMutation /* <: MutationParameters */] extends StObject {
    
    var configs: js.UndefOr[js.Array[DeclarativeMutationConfig]] = js.undefined
    
    var onCompleted: js.UndefOr[
        js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ /* response */ js.Any, 
          /* errors */ js.Array[PayloadError] | Null, 
          Unit | Null
        ]
      ] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit | Null]] = js.undefined
    
    var onUnsubscribe: js.UndefOr[js.Function0[Unit | Null]] = js.undefined
    
    var optimisticResponse: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: TMutation['rawResponse'] */ js.Any
      ] = js.undefined
    
    var optimisticUpdater: js.UndefOr[
        (SelectorStoreUpdater[
          /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any
        ]) | Null
      ] = js.undefined
    
    var updater: js.UndefOr[
        (SelectorStoreUpdater[
          /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any
        ]) | Null
      ] = js.undefined
    
    var uploadables: js.UndefOr[UploadableMap] = js.undefined
    
    var variables: VariablesOf[TMutation]
  }
  object UseMutationConfig {
    
    inline def apply[TMutation /* <: MutationParameters */](variables: VariablesOf[TMutation]): UseMutationConfig[TMutation] = {
      val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseMutationConfig[TMutation]]
    }
    
    extension [Self <: UseMutationConfig[?], TMutation /* <: MutationParameters */](x: Self & UseMutationConfig[TMutation]) {
      
      inline def setConfigs(value: js.Array[DeclarativeMutationConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
      
      inline def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
      
      inline def setConfigsVarargs(value: DeclarativeMutationConfig*): Self = StObject.set(x, "configs", js.Array(value*))
      
      inline def setOnCompleted(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ /* response */ js.Any, /* errors */ js.Array[PayloadError] | Null) => Unit | Null
      ): Self = StObject.set(x, "onCompleted", js.Any.fromFunction2(value))
      
      inline def setOnCompletedUndefined: Self = StObject.set(x, "onCompleted", js.undefined)
      
      inline def setOnError(value: /* error */ js.Error => Unit | Null): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnUnsubscribe(value: () => Unit | Null): Self = StObject.set(x, "onUnsubscribe", js.Any.fromFunction0(value))
      
      inline def setOnUnsubscribeUndefined: Self = StObject.set(x, "onUnsubscribe", js.undefined)
      
      inline def setOptimisticResponse(
        value: /* import warning: importer.ImportType#apply Failed type conversion: TMutation['rawResponse'] */ js.Any
      ): Self = StObject.set(x, "optimisticResponse", value.asInstanceOf[js.Any])
      
      inline def setOptimisticResponseUndefined: Self = StObject.set(x, "optimisticResponse", js.undefined)
      
      inline def setOptimisticUpdater(
        value: (/* store */ RecordSourceSelectorProxy[
              /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any
            ], /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any) => Unit
      ): Self = StObject.set(x, "optimisticUpdater", js.Any.fromFunction2(value))
      
      inline def setOptimisticUpdaterNull: Self = StObject.set(x, "optimisticUpdater", null)
      
      inline def setOptimisticUpdaterUndefined: Self = StObject.set(x, "optimisticUpdater", js.undefined)
      
      inline def setUpdater(
        value: (/* store */ RecordSourceSelectorProxy[
              /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any
            ], /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any) => Unit
      ): Self = StObject.set(x, "updater", js.Any.fromFunction2(value))
      
      inline def setUpdaterNull: Self = StObject.set(x, "updater", null)
      
      inline def setUpdaterUndefined: Self = StObject.set(x, "updater", js.undefined)
      
      inline def setUploadables(value: UploadableMap): Self = StObject.set(x, "uploadables", value.asInstanceOf[js.Any])
      
      inline def setUploadablesUndefined: Self = StObject.set(x, "uploadables", js.undefined)
      
      inline def setVariables(value: VariablesOf[TMutation]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
}
