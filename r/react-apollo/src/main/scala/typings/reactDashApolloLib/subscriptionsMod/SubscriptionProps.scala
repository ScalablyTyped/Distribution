package typings
package reactDashApolloLib.subscriptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionProps[TData, TVariables] extends js.Object {
  var children: js.UndefOr[
    js.Function1[/* result */ SubscriptionResult[TData], reactLib.reactMod.ReactNs.ReactNode]
  ] = js.undefined
  var client: js.UndefOr[apolloDashClientLib.apolloDashClientMod.default[js.Object]] = js.undefined
  var fetchPolicy: js.UndefOr[apolloDashClientLib.coreWatchQueryOptionsMod.FetchPolicy] = js.undefined
  var onSubscriptionComplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSubscriptionData: js.UndefOr[js.Function1[/* options */ OnSubscriptionDataOptions[TData], _]] = js.undefined
  var shouldResubscribe: js.UndefOr[js.Any] = js.undefined
  var subscription: graphqlLib.languageAstMod.DocumentNode
  var variables: js.UndefOr[TVariables] = js.undefined
}

object SubscriptionProps {
  @scala.inline
  def apply[TData, TVariables](
    subscription: graphqlLib.languageAstMod.DocumentNode,
    children: /* result */ SubscriptionResult[TData] => reactLib.reactMod.ReactNs.ReactNode = null,
    client: apolloDashClientLib.apolloDashClientMod.default[js.Object] = null,
    fetchPolicy: apolloDashClientLib.coreWatchQueryOptionsMod.FetchPolicy = null,
    onSubscriptionComplete: () => scala.Unit = null,
    onSubscriptionData: /* options */ OnSubscriptionDataOptions[TData] => _ = null,
    shouldResubscribe: js.Any = null,
    variables: TVariables = null
  ): SubscriptionProps[TData, TVariables] = {
    val __obj = js.Dynamic.literal(subscription = subscription)
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (client != null) __obj.updateDynamic("client")(client)
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy)
    if (onSubscriptionComplete != null) __obj.updateDynamic("onSubscriptionComplete")(js.Any.fromFunction0(onSubscriptionComplete))
    if (onSubscriptionData != null) __obj.updateDynamic("onSubscriptionData")(js.Any.fromFunction1(onSubscriptionData))
    if (shouldResubscribe != null) __obj.updateDynamic("shouldResubscribe")(shouldResubscribe)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionProps[TData, TVariables]]
  }
}

