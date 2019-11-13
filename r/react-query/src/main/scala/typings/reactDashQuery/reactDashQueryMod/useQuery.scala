package typings.reactDashQuery.reactDashQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-query", "useQuery")
@js.native
object useQuery extends js.Object {
  def apply[TResult, TVariables /* <: js.Object */](queryKey: QueryKey[TVariables], queryFn: QueryFunction[TResult, TVariables]): QueryResult[TResult, TVariables] = js.native
  def apply[TResult, TVariables /* <: js.Object */](
    queryKey: QueryKey[TVariables],
    queryFn: QueryFunction[TResult, TVariables],
    options: QueryOptions[TResult]
  ): QueryResult[TResult, TVariables] = js.native
}

