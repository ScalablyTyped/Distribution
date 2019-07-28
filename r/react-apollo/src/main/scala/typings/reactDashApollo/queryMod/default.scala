package typings.reactDashApollo.queryMod

import typings.reactDashApollo.Anon_ArgsChildren
import typings.reactDashApollo.Anon_ClientOperationsRenderPromises
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo/Query", JSImport.Default)
@js.native
class default[TData, TVariables] protected () extends Query[TData, TVariables] {
  def this(props: QueryProps[TData, TVariables], context: QueryContext) = this()
}

/* static members */
@JSImport("react-apollo/Query", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: Anon_ClientOperationsRenderPromises = js.native
  var propTypes: Anon_ArgsChildren = js.native
}

