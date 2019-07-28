package typings.reactDashApollo.apolloProviderMod

import typings.react.reactMod.Component
import typings.reactDashApollo.Anon_ClientOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloProvider[TCache]
  extends Component[ApolloProviderProps[TCache], js.Object, js.Any] {
  var operations: js.Any = js.native
  def getChildContext(): Anon_ClientOperations[TCache] = js.native
}

