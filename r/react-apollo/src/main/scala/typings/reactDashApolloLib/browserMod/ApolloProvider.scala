package typings
package reactDashApolloLib.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo/browser", "ApolloProvider")
@js.native
class ApolloProvider[TCache] protected ()
  extends reactDashApolloLib.apolloproviderMod.default[TCache] {
  def this(props: reactDashApolloLib.apolloproviderMod.ApolloProviderProps[TCache], context: js.Any) = this()
}

@JSImport("react-apollo/browser", "ApolloProvider")
@js.native
object ApolloProvider extends js.Object {
  var childContextTypes: reactDashApolloLib.Anon_Client = js.native
  var propTypes: reactDashApolloLib.Anon_Children = js.native
}

