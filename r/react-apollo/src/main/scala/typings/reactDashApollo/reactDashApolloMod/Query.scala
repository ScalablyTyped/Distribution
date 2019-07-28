package typings.reactDashApollo.reactDashApolloMod

import typings.reactDashApollo.Anon_ArgsChildren
import typings.reactDashApollo.Anon_ClientOperationsRenderPromises
import typings.reactDashApollo.queryMod.QueryContext
import typings.reactDashApollo.queryMod.QueryProps
import typings.reactDashApollo.queryMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo", "Query")
@js.native
class Query[TData, TVariables] protected () extends default[TData, TVariables] {
  def this(props: QueryProps[TData, TVariables], context: QueryContext) = this()
}

/* static members */
@JSImport("react-apollo", "Query")
@js.native
object Query extends js.Object {
  var contextTypes: Anon_ClientOperationsRenderPromises = js.native
  var propTypes: Anon_ArgsChildren = js.native
}

