package typings
package reactDashApolloLib.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo/browser", "Subscription")
@js.native
class Subscription[TData, TVariables] protected ()
  extends reactDashApolloLib.subscriptionsMod.default[TData, TVariables] {
  def this(props: reactDashApolloLib.subscriptionsMod.SubscriptionProps[TData, TVariables], context: reactDashApolloLib.subscriptionsMod.SubscriptionContext) = this()
}

@JSImport("react-apollo/browser", "Subscription")
@js.native
object Subscription extends js.Object {
  var contextTypes: reactDashApolloLib.Anon_ClientComponentName = js.native
  var propTypes: reactDashApolloLib.Anon_ArgsChildrenComponentName = js.native
}

