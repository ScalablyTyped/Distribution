package typings
package reactDashApolloLib.reactDashApolloMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo", "Query")
@js.native
class Query[TData, TVariables] protected ()
  extends reactDashApolloLib.queryMod.Query[TData, TVariables] {
  def this(props: reactDashApolloLib.queryMod.QueryProps[TData, TVariables], context: reactDashApolloLib.queryMod.QueryContext) = this()
}

/* static members */
@JSImport("react-apollo", "Query")
@js.native
object Query extends js.Object {
  var contextTypes: reactDashApolloLib.Anon_ClientOperationsRenderPromises = js.native
  var propTypes: reactDashApolloLib.Anon_ArgsChildren = js.native
}

