package typings
package reactDashApolloLib.subscriptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscription[TData, TVariables]
  extends reactLib.reactMod.Component[SubscriptionProps[TData, TVariables], SubscriptionState[TData], js.Any] {
  var client: js.Any = js.native
  var completeSubscription: js.Any = js.native
  var endSubscription: js.Any = js.native
  var getInitialState: js.Any = js.native
  var initialize: js.Any = js.native
  var queryObservable: js.UndefOr[js.Any] = js.native
  var querySubscription: js.UndefOr[js.Any] = js.native
  var startSubscription: js.Any = js.native
  var updateCurrentData: js.Any = js.native
  var updateError: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSubscription(): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSubscription(nextProps: SubscriptionProps[TData, TVariables], nextContext: SubscriptionContext): scala.Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSubscription(): scala.Unit = js.native
}

