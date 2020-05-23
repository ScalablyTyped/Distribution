package typings.reactQuery.mod

import typings.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-query", "useInfiniteQuery")
@js.native
object useInfiniteQuery_false extends js.Object {
  def apply[TResult, TKey /* <: String */, TMoreVariable](
    queryKey: js.UndefOr[(js.Function0[js.UndefOr[TKey | `false` | Null]]) | `false`],
    queryFn: InfiniteQueryFunction[TResult, js.Array[TKey], TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: String */, TMoreVariable](
    queryKey: js.UndefOr[(js.Function0[js.UndefOr[TKey | `false` | Null]]) | `false`],
    queryFn: InfiniteQueryFunction[TResult, js.Array[TKey], TMoreVariable],
    config: InfiniteQueryOptions[TResult, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */, TMoreVariable](
    queryKey: js.UndefOr[(js.Function0[js.UndefOr[TKey | `false` | Null]]) | `false`],
    variables: TVariables,
    queryFn: InfiniteQueryFunctionWithVariables[TResult, js.Array[TKey], TVariables, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */, TMoreVariable](
    queryKey: js.UndefOr[(js.Function0[js.UndefOr[TKey | `false` | Null]]) | `false`],
    variables: TVariables,
    queryFn: InfiniteQueryFunctionWithVariables[TResult, js.Array[TKey], TVariables, TMoreVariable],
    config: InfiniteQueryOptions[TResult, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
}

