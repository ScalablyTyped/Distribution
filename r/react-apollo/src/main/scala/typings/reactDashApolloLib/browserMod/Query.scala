package typings
package reactDashApolloLib.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo/browser", "Query")
@js.native
class Query[TData, TVariables] protected ()
  extends reactDashApolloLib.queryMod.default[TData, TVariables] {
  def this(props: reactDashApolloLib.queryMod.QueryProps[TData, TVariables], context: reactDashApolloLib.queryMod.QueryContext) = this()
}

@JSImport("react-apollo/browser", "Query")
@js.native
object Query extends js.Object {
  var contextTypes: reactDashApolloLib.Anon_ClientOperationsRenderPromises = js.native
  var propTypes: reactDashApolloLib.Anon_ChildrenArgs = js.native
}

