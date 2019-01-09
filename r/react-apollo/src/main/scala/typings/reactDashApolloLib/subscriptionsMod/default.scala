package typings
package reactDashApolloLib.subscriptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo/Subscriptions", JSImport.Default)
@js.native
class default[TData, TVariables] protected () extends Subscription[TData, TVariables] {
  def this(props: SubscriptionProps[TData, TVariables], context: SubscriptionContext) = this()
}

@JSImport("react-apollo/Subscriptions", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: reactDashApolloLib.Anon_ClientComponentName = js.native
  var propTypes: reactDashApolloLib.Anon_ArgsChildrenComponentName = js.native
}

