package typings
package reactDashApolloLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutateProps[TData, TGraphQLVariables] extends js.Object {
  var mutate: reactDashApolloLib.mutationMod.MutationFn[TData, TGraphQLVariables]
}

object MutateProps {
  @scala.inline
  def apply[TData, TGraphQLVariables](mutate: reactDashApolloLib.mutationMod.MutationFn[TData, TGraphQLVariables]): MutateProps[TData, TGraphQLVariables] = {
    val __obj = js.Dynamic.literal(mutate = mutate)
  
    __obj.asInstanceOf[MutateProps[TData, TGraphQLVariables]]
  }
}

