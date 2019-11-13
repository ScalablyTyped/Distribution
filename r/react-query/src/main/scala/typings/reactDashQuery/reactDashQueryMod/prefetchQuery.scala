package typings.reactDashQuery.reactDashQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-query", "prefetchQuery")
@js.native
object prefetchQuery extends js.Object {
  def apply[TResult, TVariables /* <: js.Object */](queryKey: QueryKey[TVariables], queryFn: QueryFunction[TResult, TVariables]): js.Promise[TResult] = js.native
  def apply[TResult, TVariables /* <: js.Object */](
    queryKey: QueryKey[TVariables],
    queryFn: QueryFunction[TResult, TVariables],
    options: PrefetchQueryOptions[TResult]
  ): js.Promise[TResult] = js.native
}

