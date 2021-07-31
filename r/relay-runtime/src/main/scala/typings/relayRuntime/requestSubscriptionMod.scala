package typings.relayRuntime

import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.Disposable
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.relayStoreTypesMod.Environment
import typings.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestSubscriptionMod {
  
  @JSImport("relay-runtime/lib/subscription/requestSubscription", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def requestSubscription[TSubscription /* <: OperationType */](
    environment: Environment,
    // tslint:disable-next-line no-unnecessary-generics
  config: GraphQLSubscriptionConfig[TSubscription]
  ): Disposable = (^.asInstanceOf[js.Dynamic].applyDynamic("requestSubscription")(environment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Disposable]
  
  trait GraphQLSubscriptionConfig[TSubscription /* <: OperationType */] extends StObject {
    
    var configs: js.UndefOr[js.Array[DeclarativeMutationConfig]] = js.undefined
    
    var onCompleted: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
    
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
    
    @scala.inline
    def apply[TSubscription /* <: OperationType */](
      subscription: GraphQLTaggedNode,
      variables: /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['variables'] */ js.Any
    ): GraphQLSubscriptionConfig[TSubscription] = {
      val __obj = js.Dynamic.literal(subscription = subscription.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphQLSubscriptionConfig[TSubscription]]
    }
    
    @scala.inline
    implicit class GraphQLSubscriptionConfigMutableBuilder[Self <: GraphQLSubscriptionConfig[?], TSubscription /* <: OperationType */] (val x: Self & GraphQLSubscriptionConfig[TSubscription]) extends AnyVal {
      
      @scala.inline
      def setConfigs(value: js.Array[DeclarativeMutationConfig]): Self = StObject.set(x, "configs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigsUndefined: Self = StObject.set(x, "configs", js.undefined)
      
      @scala.inline
      def setConfigsVarargs(value: DeclarativeMutationConfig*): Self = StObject.set(x, "configs", js.Array(value :_*))
      
      @scala.inline
      def setOnCompleted(value: () => Unit): Self = StObject.set(x, "onCompleted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCompletedUndefined: Self = StObject.set(x, "onCompleted", js.undefined)
      
      @scala.inline
      def setOnError(value: /* error */ Error => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnNext(
        value: /* response */ js.UndefOr[
              (/* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any) | Null
            ] => Unit
      ): Self = StObject.set(x, "onNext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
      
      @scala.inline
      def setSubscription(value: GraphQLTaggedNode): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionFunction0(value: () => ReaderFragment | ConcreteRequest): Self = StObject.set(x, "subscription", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdater(
        value: (/* store */ RecordSourceSelectorProxy[
              /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any
            ], /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any) => Unit
      ): Self = StObject.set(x, "updater", js.Any.fromFunction2(value))
      
      @scala.inline
      def setUpdaterUndefined: Self = StObject.set(x, "updater", js.undefined)
      
      @scala.inline
      def setVariables(
        value: /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['variables'] */ js.Any
      ): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
}
