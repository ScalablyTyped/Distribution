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
  var onSubscriptionData: js.UndefOr[js.Function1[/* options */ OnSubscriptionDataOptions[TData], _]] = js.undefined
  var shouldResubscribe: js.UndefOr[js.Any] = js.undefined
  var subscription: graphqlLib.languageAstMod.DocumentNode
  var variables: js.UndefOr[TVariables] = js.undefined
}

