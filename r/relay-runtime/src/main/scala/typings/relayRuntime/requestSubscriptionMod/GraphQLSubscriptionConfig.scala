package typings.relayRuntime.requestSubscriptionMod

import typings.relayRuntime.relayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.relayRuntime.relayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLSubscriptionConfig[TSubscription /* <: OperationType */] extends js.Object {
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
  def apply[/* <: typings.relayRuntime.relayRuntimeTypesMod.OperationType */ TSubscription](
    subscription: GraphQLTaggedNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['variables'] */ js.Any,
    configs: js.Array[DeclarativeMutationConfig] = null,
    onCompleted: () => Unit = null,
    onError: /* error */ Error => Unit = null,
    onNext: /* response */ js.UndefOr[
      (/* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any) | Null
    ] => Unit = null,
    updater: (/* store */ RecordSourceSelectorProxy[
      /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any
    ], /* import warning: importer.ImportType#apply Failed type conversion: TSubscription['response'] */ js.Any) => Unit = null
  ): GraphQLSubscriptionConfig[TSubscription] = {
    val __obj = js.Dynamic.literal(subscription = subscription.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    if (configs != null) __obj.updateDynamic("configs")(configs.asInstanceOf[js.Any])
    if (onCompleted != null) __obj.updateDynamic("onCompleted")(js.Any.fromFunction0(onCompleted))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction1(onNext))
    if (updater != null) __obj.updateDynamic("updater")(js.Any.fromFunction2(updater))
    __obj.asInstanceOf[GraphQLSubscriptionConfig[TSubscription]]
  }
}

