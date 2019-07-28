package typings.reactDashApollo.reactDashApolloMod

import typings.reactDashApollo.Anon_ArgsChildrenOnSubscriptionComplete
import typings.reactDashApollo.Anon_ClientObject
import typings.reactDashApollo.subscriptionsMod.SubscriptionContext
import typings.reactDashApollo.subscriptionsMod.SubscriptionProps
import typings.reactDashApollo.subscriptionsMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo", "Subscription")
@js.native
class Subscription[TData, TVariables] protected () extends default[TData, TVariables] {
  def this(props: SubscriptionProps[TData, TVariables], context: SubscriptionContext) = this()
}

/* static members */
@JSImport("react-apollo", "Subscription")
@js.native
object Subscription extends js.Object {
  var contextTypes: Anon_ClientObject = js.native
  var propTypes: Anon_ArgsChildrenOnSubscriptionComplete = js.native
}

