package typings
package reactDashApolloLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutateProps[TData, TGraphQLVariables] extends js.Object {
  var mutate: reactDashApolloLib.mutationMod.MutationFn[TData, TGraphQLVariables]
  var result: reactDashApolloLib.mutationMod.MutationResult[TData]
}

object MutateProps {
  @scala.inline
  def apply[TData, TGraphQLVariables](
    mutate: reactDashApolloLib.mutationMod.MutationFn[TData, TGraphQLVariables],
    result: reactDashApolloLib.mutationMod.MutationResult[TData]
  ): MutateProps[TData, TGraphQLVariables] = {
    val __obj = js.Dynamic.literal(mutate = mutate, result = result)
  
    __obj.asInstanceOf[MutateProps[TData, TGraphQLVariables]]
  }
}

