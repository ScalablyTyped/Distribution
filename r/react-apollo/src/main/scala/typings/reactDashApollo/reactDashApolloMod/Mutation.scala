package typings.reactDashApollo.reactDashApolloMod

import typings.reactDashApollo.Anon_Args
import typings.reactDashApollo.Anon_ClientOperationsObject
import typings.reactDashApollo.mutationMod.MutationProps
import typings.reactDashApollo.mutationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo", "Mutation")
@js.native
class Mutation[TData, TVariables] protected () extends default[TData, TVariables] {
  def this(props: MutationProps[TData, TVariables], context: js.Any) = this()
}

/* static members */
@JSImport("react-apollo", "Mutation")
@js.native
object Mutation extends js.Object {
  var contextTypes: Anon_ClientOperationsObject = js.native
  var propTypes: Anon_Args = js.native
}

