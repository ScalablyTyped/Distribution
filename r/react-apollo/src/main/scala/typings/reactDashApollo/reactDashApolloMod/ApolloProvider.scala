package typings.reactDashApollo.reactDashApolloMod

import typings.reactDashApollo.Anon_Children
import typings.reactDashApollo.Anon_Client
import typings.reactDashApollo.apolloProviderMod.ApolloProviderProps
import typings.reactDashApollo.apolloProviderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo", "ApolloProvider")
@js.native
class ApolloProvider[TCache] protected () extends default[TCache] {
  def this(props: ApolloProviderProps[TCache], context: js.Any) = this()
}

/* static members */
@JSImport("react-apollo", "ApolloProvider")
@js.native
object ApolloProvider extends js.Object {
  var childContextTypes: Anon_Client = js.native
  var propTypes: Anon_Children = js.native
}

