package typings.reactQuery.mod

import typings.reactQuery.anon.QueryKey
import typings.reactQuery.anon.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-query", "useInfiniteQuery")
@js.native
object useInfiniteQuery extends js.Object {
  def apply[TResult, TKey /* <: String */, TMoreVariable](queryKey: TKey, queryFn: InfiniteQueryFunction[TResult, js.Array[TKey], TMoreVariable]): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: String */, TMoreVariable](
    queryKey: TKey,
    queryFn: InfiniteQueryFunction[TResult, js.Array[TKey], TMoreVariable],
    config: InfiniteQueryOptions[TResult, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: String */, TMoreVariable](
    queryKey: js.UndefOr[scala.Nothing],
    queryFn: InfiniteQueryFunction[TResult, js.Array[TKey], TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: String */, TMoreVariable](
    queryKey: js.UndefOr[scala.Nothing],
    queryFn: InfiniteQueryFunction[TResult, js.Array[TKey], TMoreVariable],
    config: InfiniteQueryOptions[TResult, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: String */, TMoreVariable](queryKey: Null, queryFn: InfiniteQueryFunction[TResult, js.Array[TKey], TMoreVariable]): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: String */, TMoreVariable](
    queryKey: Null,
    queryFn: InfiniteQueryFunction[TResult, js.Array[TKey], TMoreVariable],
    config: InfiniteQueryOptions[TResult, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TMoreVariable, TVariables /* <: AnyVariables */](hasQueryKeyVariablesQueryFnConfig: QueryKey[TKey, TVariables, TResult, TMoreVariable]): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TSingleKey /* <: String */, TMoreVariable, TVariables /* <: AnyVariables */](hasQueryKeyVariablesQueryFnConfig: Variables[TSingleKey, TVariables, TResult, TMoreVariable]): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */, TMoreVariable](
    queryKey: TKey,
    variables: TVariables,
    queryFn: InfiniteQueryFunctionWithVariables[TResult, js.Array[TKey], TVariables, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */, TMoreVariable](
    queryKey: TKey,
    variables: TVariables,
    queryFn: InfiniteQueryFunctionWithVariables[TResult, js.Array[TKey], TVariables, TMoreVariable],
    config: InfiniteQueryOptions[TResult, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */, TMoreVariable](
    queryKey: js.UndefOr[scala.Nothing],
    variables: TVariables,
    queryFn: InfiniteQueryFunctionWithVariables[TResult, js.Array[TKey], TVariables, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */, TMoreVariable](
    queryKey: js.UndefOr[scala.Nothing],
    variables: TVariables,
    queryFn: InfiniteQueryFunctionWithVariables[TResult, js.Array[TKey], TVariables, TMoreVariable],
    config: InfiniteQueryOptions[TResult, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */, TMoreVariable](
    queryKey: Null,
    variables: TVariables,
    queryFn: InfiniteQueryFunctionWithVariables[TResult, js.Array[TKey], TVariables, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */, TMoreVariable](
    queryKey: Null,
    variables: TVariables,
    queryFn: InfiniteQueryFunctionWithVariables[TResult, js.Array[TKey], TVariables, TMoreVariable],
    config: InfiniteQueryOptions[TResult, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
}

