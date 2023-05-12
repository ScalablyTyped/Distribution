package typings.relayRuntime

import typings.relayRuntime.libMutationsRelayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typings.relayRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.libStoreRelayStoreTypesMod.Environment
import typings.relayRuntime.libStoreRelayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.libStoreRelayStoreTypesMod.SelectorStoreUpdater
import typings.relayRuntime.libUtilReaderNodeMod.ReaderFragment
import typings.relayRuntime.libUtilReaderNodeMod.ReaderInlineDataFragment
import typings.relayRuntime.libUtilRelayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.CacheConfig
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.Disposable
import typings.relayRuntime.libUtilRelayRuntimeTypesMod.OperationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSubscriptionRequestSubscriptionMod {
  
  @JSImport("relay-runtime/lib/subscription/requestSubscription", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def requestSubscription[TSubscription /* <: OperationType */](
    environment: Environment,
    // eslint-disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscription]
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("requestSubscription")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  trait GraphQLSubscriptionConfig[TSubscription /* <: OperationType */] extends StObject {
    
    var cacheConfig: js.UndefOr[CacheConfig] = js.undefined
    
    var configs: js.UndefOr[js.Array[DeclarativeMutationConfig]] = js.undefined
    
    var onCompleted: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    var onNext: js.UndefOr[
        js.Function1[
          /* response */ js.UndefOr[
            (/* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any) | Null
          ], 
          Unit
        ]
      ] = js.undefined
    
    var subscription: GraphQLTaggedNode
    
    var updater: js.UndefOr[
        SelectorStoreUpdater[
          /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any
        ]
      ] = js.undefined
    
    var variables: /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['variables'] */ js.Any
  }
  object GraphQLSubscriptionConfig {
    
    inline def apply[TSubscription /* <: OperationType */](
      subscription: GraphQLTaggedNode,
      variables: /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['variables'] */ js.Any
    ): GraphQLSubscriptionConfig[TSubscription] = {
      val __obj = js.Dynamic.literal(subscription = subscription.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLSubscriptionConfig[TSubscription]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GraphQLSubscriptionConfig[?], TSubscription /* <: OperationType */] (val x: Self & GraphQLSubscriptionConfig[TSubscription]) extends AnyVal {
      
      inline def setCacheConfig(value: CacheConfig): Self = StObject.set(x, "cacheConfig", value.asInstanceOf[js.Any])
      
      inline def setCacheConfigUndefined: Self = StObject.set(x, "cacheConfig", js.undefined)
      
      inline def setConfigs(value: js.Array[DeclarativeMutationConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
      
      inline def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
      
      inline def setConfigsVarargs(value: DeclarativeMutationConfig*): Self = StObject.set(x, "configs", js.Array(value*))
      
      inline def setOnCompleted(value: () => Unit): Self = StObject.set(x, "onCompleted", js.Any.fromFunction0(value))
      
      inline def setOnCompletedUndefined: Self = StObject.set(x, "onCompleted", js.undefined)
      
      inline def setOnError(value: /* error */ js.Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnNext(
        value: /* response */ js.UndefOr[
              (/* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any) | Null
            ] => Unit
      ): Self = StObject.set(x, "onNext", js.Any.fromFunction1(value))
      
      inline def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
      
      inline def setSubscription(value: GraphQLTaggedNode): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionFunction0(value: () => ReaderFragment | ConcreteRequest | ReaderInlineDataFragment): Self = StObject.set(x, "subscription", js.Any.fromFunction0(value))
      
      inline def setUpdater(
        value: (/* store */ RecordSourceSelectorProxy[
              /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any
            ], /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any) => Unit
      ): Self = StObject.set(x, "updater", js.Any.fromFunction2(value))
      
      inline def setUpdaterUndefined: Self = StObject.set(x, "updater", js.undefined)
      
      inline def setVariables(
        value: /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['variables'] */ js.Any
      ): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
}
