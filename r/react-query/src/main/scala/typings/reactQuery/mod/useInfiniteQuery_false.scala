package typings.reactQuery.mod

import typings.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-query", "useInfiniteQuery")
@js.native
object useInfiniteQuery_false extends js.Object {
  def apply[TResult, TKey /* <: String */, TMoreVariable](
    queryKey: js.Function0[js.UndefOr[TKey | `false` | Null]],
    queryFn: InfiniteQueryFunction[TResult, js.Array[TKey], TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: String */, TMoreVariable](
    queryKey: js.Function0[js.UndefOr[TKey | `false` | Null]],
    queryFn: InfiniteQueryFunction[TResult, js.Array[TKey], TMoreVariable],
    config: InfiniteQueryOptions[TResult, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: String */, TMoreVariable](queryKey: `false`, queryFn: InfiniteQueryFunction[TResult, js.Array[TKey], TMoreVariable]): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: String */, TMoreVariable](
    queryKey: `false`,
    queryFn: InfiniteQueryFunction[TResult, js.Array[TKey], TMoreVariable],
    config: InfiniteQueryOptions[TResult, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */, TMoreVariable](
    queryKey: js.Function0[js.UndefOr[TKey | `false` | Null]],
    variables: TVariables,
    queryFn: InfiniteQueryFunctionWithVariables[TResult, TKey, TVariables, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */, TMoreVariable](
    queryKey: js.Function0[js.UndefOr[TKey | `false` | Null]],
    variables: TVariables,
    queryFn: InfiniteQueryFunctionWithVariables[TResult, TKey, TVariables, TMoreVariable],
    config: InfiniteQueryOptions[TResult, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */, TMoreVariable](
    queryKey: `false`,
    variables: TVariables,
    queryFn: InfiniteQueryFunctionWithVariables[TResult, TKey, TVariables, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */, TMoreVariable](
    queryKey: `false`,
    variables: TVariables,
    queryFn: InfiniteQueryFunctionWithVariables[TResult, TKey, TVariables, TMoreVariable],
    config: InfiniteQueryOptions[TResult, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
}

