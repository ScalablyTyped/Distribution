package typings.reactRelay

import typings.relayRuntime.commitMutationMod.MutationConfig
import typings.relayRuntime.commitMutationMod.MutationParameters
import typings.relayRuntime.relayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayNetworkTypesMod.PayloadError
import typings.relayRuntime.relayNetworkTypesMod.UploadableMap
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayRuntimeTypesMod.VariablesOf
import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMutationMod {
  
  @JSImport("react-relay/lib/relay-experimental/useMutation", "useMutation")
  @js.native
  def useMutation[TMutation /* <: MutationParameters */](mutation: GraphQLTaggedNode): js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean] = js.native
  @JSImport("react-relay/lib/relay-experimental/useMutation", "useMutation")
  @js.native
  def useMutation[TMutation /* <: MutationParameters */](
    mutation: GraphQLTaggedNode,
    commitMutationFn: js.Function2[/* environment */ Environment, /* config */ MutationConfig[TMutation], Disposable]
  ): js.Tuple2[js.Function1[/* config */ UseMutationConfig[TMutation], Disposable], Boolean] = js.native
  
  @js.native
  trait UseMutationConfig[TMutation /* <: MutationParameters */] extends StObject {
    
    var configs: js.UndefOr[js.Array[DeclarativeMutationConfig]] = js.native
    
    var onCompleted: js.UndefOr[
        js.Function2[
          /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ /* response */ js.Any, 
          /* errors */ js.Array[PayloadError], 
          Unit | Null
        ]
      ] = js.native
    
    var onError: js.UndefOr[js.Function1[/* error */ Error, Unit | Null]] = js.native
    
    var onUnsubscribe: js.UndefOr[js.Function0[Unit | Null]] = js.native
    
    var optimisticResponse: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: TMutation['rawResponse'] */ js.Any
      ] = js.native
    
    var optimisticUpdater: js.UndefOr[
        (SelectorStoreUpdater[
          /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any
        ]) | Null
      ] = js.native
    
    var updater: js.UndefOr[
        (SelectorStoreUpdater[
          /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any
        ]) | Null
      ] = js.native
    
    var uploadables: js.UndefOr[UploadableMap] = js.native
    
    var variables: VariablesOf[TMutation] = js.native
  }
  object UseMutationConfig {
    
    @scala.inline
    def apply[TMutation /* <: MutationParameters */](variables: VariablesOf[TMutation]): UseMutationConfig[TMutation] = {
      val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[UseMutationConfig[TMutation]]
    }
    
    @scala.inline
    implicit class UseMutationConfigMutableBuilder[Self <: UseMutationConfig[_], TMutation /* <: MutationParameters */] (val x: Self with UseMutationConfig[TMutation]) extends AnyVal {
      
      @scala.inline
      def setConfigs(value: js.Array[DeclarativeMutationConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
      
      @scala.inline
      def setConfigsVarargs(value: DeclarativeMutationConfig*): Self = StObject.set(x, "configs", js.Array(value :_*))
      
      @scala.inline
      def setOnCompleted(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ /* response */ js.Any, /* errors */ js.Array[PayloadError]) => Unit | Null
      ): Self = StObject.set(x, "onCompleted", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCompletedUndefined: Self = StObject.set(x, "onCompleted", js.undefined)
      
      @scala.inline
      def setOnError(value: /* error */ Error => Unit | Null): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnUnsubscribe(value: () => Unit | Null): Self = StObject.set(x, "onUnsubscribe", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnUnsubscribeUndefined: Self = StObject.set(x, "onUnsubscribe", js.undefined)
      
      @scala.inline
      def setOptimisticResponse(
        value: /* import warning: importer.ImportType#apply Failed type conversion: TMutation['rawResponse'] */ js.Any
      ): Self = StObject.set(x, "optimisticResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimisticResponseUndefined: Self = StObject.set(x, "optimisticResponse", js.undefined)
      
      @scala.inline
      def setOptimisticUpdater(
        value: (/* store */ RecordSourceSelectorProxy[
              /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any
            ], /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any) => Unit
      ): Self = StObject.set(x, "optimisticUpdater", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOptimisticUpdaterNull: Self = StObject.set(x, "optimisticUpdater", null)
      
      @scala.inline
      def setOptimisticUpdaterUndefined: Self = StObject.set(x, "optimisticUpdater", js.undefined)
      
      @scala.inline
      def setUpdater(
        value: (/* store */ RecordSourceSelectorProxy[
              /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any
            ], /* import warning: importer.ImportType#apply Failed type conversion: TMutation['response'] */ js.Any) => Unit
      ): Self = StObject.set(x, "updater", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdaterNull: Self = StObject.set(x, "updater", null)
      
      @scala.inline
      def setUpdaterUndefined: Self = StObject.set(x, "updater", js.undefined)
      
      @scala.inline
      def setUploadables(value: UploadableMap): Self = StObject.set(x, "uploadables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadablesUndefined: Self = StObject.set(x, "uploadables", js.undefined)
      
      @scala.inline
      def setVariables(value: VariablesOf[TMutation]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
}
