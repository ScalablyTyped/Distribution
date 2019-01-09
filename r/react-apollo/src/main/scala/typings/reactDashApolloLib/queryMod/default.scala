package typings
package reactDashApolloLib.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo/Query", JSImport.Default)
@js.native
class default[TData, TVariables] protected () extends Query[TData, TVariables] {
  def this(props: QueryProps[TData, TVariables], context: QueryContext) = this()
}

@JSImport("react-apollo/Query", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: reactDashApolloLib.Anon_ClientOperationsRenderPromises = js.native
  var propTypes: reactDashApolloLib.Anon_ArgsChildren = js.native
}

