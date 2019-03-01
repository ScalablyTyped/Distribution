package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLSubscriptionConfig extends js.Object {
  var configs: js.UndefOr[js.Array[RelayMutationConfig]] = js.undefined
  var onCompleted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.undefined
  var onNext: js.UndefOr[js.Function1[/* response */ js.UndefOr[js.Object | scala.Null], scala.Unit]] = js.undefined
  var subscription: GraphQLTaggedNode
  var updater: js.UndefOr[js.Function1[/* store */ RecordSourceSelectorProxy, scala.Unit]] = js.undefined
  var variables: Variables
}

object GraphQLSubscriptionConfig {
  @scala.inline
  def apply(
    subscription: GraphQLTaggedNode,
    variables: Variables,
    configs: js.Array[RelayMutationConfig] = null,
    onCompleted: js.Function0[scala.Unit] = null,
    onError: js.Function1[/* error */ stdLib.Error, scala.Unit] = null,
    onNext: js.Function1[/* response */ js.UndefOr[js.Object | scala.Null], scala.Unit] = null,
    updater: js.Function1[/* store */ RecordSourceSelectorProxy, scala.Unit] = null
  ): GraphQLSubscriptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.updateDynamic("variables")(variables)
    if (configs != null) __obj.updateDynamic("configs")(configs)
    if (onCompleted != null) __obj.updateDynamic("onCompleted")(onCompleted)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onNext != null) __obj.updateDynamic("onNext")(onNext)
    if (updater != null) __obj.updateDynamic("updater")(updater)
    __obj.asInstanceOf[GraphQLSubscriptionConfig]
  }
}

