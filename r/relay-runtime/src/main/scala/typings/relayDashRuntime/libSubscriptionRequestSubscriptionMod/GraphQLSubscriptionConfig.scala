package typings.relayDashRuntime.libSubscriptionRequestSubscriptionMod

import typings.relayDashRuntime.libMutationsRelayDeclarativeMutationConfigMod.DeclarativeMutationConfig
import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.RecordSourceSelectorProxy
import typings.relayDashRuntime.libStoreRelayStoreTypesMod.SelectorStoreUpdater
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.Variables
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLSubscriptionConfig[TSubscriptionPayload] extends js.Object {
  var configs: js.UndefOr[js.Array[DeclarativeMutationConfig]] = js.undefined
  var onCompleted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  var onNext: js.UndefOr[js.Function1[/* response */ js.UndefOr[TSubscriptionPayload | Null], Unit]] = js.undefined
  var subscription: GraphQLTaggedNode
  var updater: js.UndefOr[SelectorStoreUpdater[TSubscriptionPayload]] = js.undefined
  var variables: Variables
}

object GraphQLSubscriptionConfig {
  @scala.inline
  def apply[TSubscriptionPayload](
    subscription: GraphQLTaggedNode,
    variables: Variables,
    configs: js.Array[DeclarativeMutationConfig] = null,
    onCompleted: () => Unit = null,
    onError: /* error */ Error => Unit = null,
    onNext: /* response */ js.UndefOr[TSubscriptionPayload | Null] => Unit = null,
    updater: (/* store */ RecordSourceSelectorProxy[TSubscriptionPayload], TSubscriptionPayload) => Unit = null
  ): GraphQLSubscriptionConfig[TSubscriptionPayload] = {
    val __obj = js.Dynamic.literal(subscription = subscription.asInstanceOf[js.Any], variables = variables)
    if (configs != null) __obj.updateDynamic("configs")(configs)
    if (onCompleted != null) __obj.updateDynamic("onCompleted")(js.Any.fromFunction0(onCompleted))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction1(onNext))
    if (updater != null) __obj.updateDynamic("updater")(js.Any.fromFunction2(updater))
    __obj.asInstanceOf[GraphQLSubscriptionConfig[TSubscriptionPayload]]
  }
}

