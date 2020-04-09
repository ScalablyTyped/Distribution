package typings.reactQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-query", "useMutation")
@js.native
object useMutation extends js.Object {
  def apply[TResults, TVariables](mutationFn: MutationFunction[TResults, TVariables]): js.Tuple2[MutateFunction[TResults, TVariables], MutationResult[TResults]] = js.native
  def apply[TResults, TVariables](
    mutationFn: MutationFunction[TResults, TVariables],
    mutationOptions: MutationOptions[TResults, TVariables]
  ): js.Tuple2[MutateFunction[TResults, TVariables], MutationResult[TResults]] = js.native
}

