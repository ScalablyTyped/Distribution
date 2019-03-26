package typings
package reactDashApolloLib.reactDashApolloMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo", "Subscription")
@js.native
class Subscription[TData, TVariables] protected ()
  extends reactDashApolloLib.subscriptionsMod.default[TData, TVariables] {
  def this(props: reactDashApolloLib.subscriptionsMod.SubscriptionProps[TData, TVariables], context: reactDashApolloLib.subscriptionsMod.SubscriptionContext) = this()
}

/* static members */
@JSImport("react-apollo", "Subscription")
@js.native
object Subscription extends js.Object {
  var contextTypes: reactDashApolloLib.Anon_ClientObject = js.native
  var propTypes: reactDashApolloLib.Anon_ArgsChildrenOnSubscriptionComplete = js.native
}

