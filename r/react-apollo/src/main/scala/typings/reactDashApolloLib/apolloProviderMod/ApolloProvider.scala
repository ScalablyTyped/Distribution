package typings
package reactDashApolloLib.apolloProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApolloProvider[TCache]
  extends reactLib.reactMod.Component[ApolloProviderProps[TCache], js.Object, js.Any] {
  var operations: js.Any = js.native
  def getChildContext(): reactDashApolloLib.Anon_ClientOperations[TCache] = js.native
}

