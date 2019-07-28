package typings.reactDashApollo.mutationMod

import typings.reactDashApollo.Anon_Args
import typings.reactDashApollo.Anon_ClientOperationsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo/Mutation", JSImport.Default)
@js.native
class default[TData, TVariables] protected () extends Mutation[TData, TVariables] {
  def this(props: MutationProps[TData, TVariables], context: js.Any) = this()
}

/* static members */
@JSImport("react-apollo/Mutation", JSImport.Default)
@js.native
object default extends js.Object {
  var contextTypes: Anon_ClientOperationsObject = js.native
  var propTypes: Anon_Args = js.native
}

