package typings.reactDashApollo.subscriptionsMod

import typings.reactDashApollo.Anon_ArgsChildrenOnSubscriptionComplete
import typings.reactDashApollo.Anon_ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo/Subscriptions", JSImport.Default)
@js.native
class default[TData, TVariables] protected () extends Subscription[TData, TVariables] {
  def this(props: SubscriptionProps[TData, TVariables], context: SubscriptionContext) = this()
}

/* static members */
@JSImport("react-apollo/Subscriptions", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: Anon_ClientObject = js.native
  var propTypes: Anon_ArgsChildrenOnSubscriptionComplete = js.native
}

