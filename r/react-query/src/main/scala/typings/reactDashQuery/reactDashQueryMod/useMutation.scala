package typings.reactDashQuery.reactDashQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-query", "useMutation")
@js.native
object useMutation extends js.Object {
  def apply[TResults, TVariables /* <: js.Object */](mutationFn: MutationFunction[TResults, TVariables]): js.Tuple2[MutateFunction[TResults, TVariables], MutationResult[TResults]] = js.native
  def apply[TResults, TVariables /* <: js.Object */](mutationFn: MutationFunction[TResults, TVariables], mutationOptions: MutationOptions): js.Tuple2[MutateFunction[TResults, TVariables], MutationResult[TResults]] = js.native
}

