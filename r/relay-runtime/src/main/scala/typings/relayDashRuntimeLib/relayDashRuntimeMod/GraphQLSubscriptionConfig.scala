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

