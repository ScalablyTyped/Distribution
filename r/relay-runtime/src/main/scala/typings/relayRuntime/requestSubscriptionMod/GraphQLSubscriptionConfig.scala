package typings.relayRuntime.requestSubscriptionMod

import typings.relayRuntime.readerNodeMod.ReaderFragment
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphQLSubscriptionConfig[TSubscription /* <: OperationType */] extends js.Object {
  
  var configs: js.UndefOr[js.Array[DeclarativeMutationConfig]] = js.native
  
  var onCompleted: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  
  var onNext: js.UndefOr[
    js.Function1[
      /* response */ js.UndefOr[
        (/* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any) | Null
      ], 
      Unit
    ]
  ] = js.native
  
  var subscription: GraphQLTaggedNode = js.native
  
  var updater: js.UndefOr[
    SelectorStoreUpdater[
      /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any
    ]
  ] = js.native
  
  var variables: /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['variables'] */ js.Any = js.native
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
  implicit class GraphQLSubscriptionConfigOps[Self <: GraphQLSubscriptionConfig[_], TSubscription /* <: OperationType */] (val x: Self with GraphQLSubscriptionConfig[TSubscription]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSubscriptionFunction0(value: () => ReaderFragment | ConcreteRequest): Self = this.set("subscription", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubscription(value: GraphQLTaggedNode): Self = this.set("subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariables(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['variables'] */ js.Any
    ): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigsVarargs(value: DeclarativeMutationConfig*): Self = this.set("configs", js.Array(value :_*))
    
    @scala.inline
    def setConfigs(value: js.Array[DeclarativeMutationConfig]): Self = this.set("configs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigs: Self = this.set("configs", js.undefined)
    
    @scala.inline
    def setOnCompleted(value: () => Unit): Self = this.set("onCompleted", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnCompleted: Self = this.set("onCompleted", js.undefined)
    
    @scala.inline
    def setOnError(value: /* error */ Error => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnNext(
      value: /* response */ js.UndefOr[
          (/* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any) | Null
        ] => Unit
    ): Self = this.set("onNext", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnNext: Self = this.set("onNext", js.undefined)
    
    @scala.inline
    def setUpdater(
      value: (/* store */ RecordSourceSelectorProxy[
          /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any
        ], /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any) => Unit
    ): Self = this.set("updater", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteUpdater: Self = this.set("updater", js.undefined)
  }
}
