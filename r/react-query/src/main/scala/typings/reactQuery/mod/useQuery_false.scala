package typings.reactQuery.mod

import typings.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-query", "useQuery")
@js.native
object useQuery_false extends js.Object {
  def apply[TResult, TSingleKey /* <: String */](
    queryKey: js.Function0[js.UndefOr[TSingleKey | `false` | Null]],
    queryFn: QueryFunction[TResult, js.Array[TSingleKey]]
  ): QueryResult[TResult] = js.native
  def apply[TResult, TSingleKey /* <: String */](
    queryKey: js.Function0[js.UndefOr[TSingleKey | `false` | Null]],
    queryFn: QueryFunction[TResult, js.Array[TSingleKey]],
    config: QueryOptions[TResult]
  ): QueryResult[TResult] = js.native
  def apply[TResult, TSingleKey /* <: String */](queryKey: `false`, queryFn: QueryFunction[TResult, js.Array[TSingleKey]]): QueryResult[TResult] = js.native
  def apply[TResult, TSingleKey /* <: String */](
    queryKey: `false`,
    queryFn: QueryFunction[TResult, js.Array[TSingleKey]],
    config: QueryOptions[TResult]
  ): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](
    queryKey: js.Function0[js.UndefOr[TKey | `false` | Null]],
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables]
  ): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](
    queryKey: js.Function0[js.UndefOr[TKey | `false` | Null]],
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables],
    config: QueryOptions[TResult]
  ): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](
    queryKey: `false`,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables]
  ): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](
    queryKey: `false`,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables],
    config: QueryOptions[TResult]
  ): QueryResult[TResult] = js.native
}

