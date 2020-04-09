package typings.reactQuery.mod

import typings.reactQuery.AnonQueryKey
import typings.reactQuery.AnonVariables
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
  def apply[TResult, TKey /* <: AnyQueryKey */, TMoreVariable, TVariables /* <: AnyVariables */](hasQueryKeyVariablesQueryFnConfig: AnonQueryKey[TKey, TVariables, TResult, TMoreVariable]): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TSingleKey /* <: String */, TMoreVariable, TVariables /* <: AnyVariables */](hasQueryKeyVariablesQueryFnConfig: AnonVariables[TSingleKey, TVariables, TResult, TMoreVariable]): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */, TMoreVariable](
    queryKey: TKey,
    variables: TVariables,
    queryFn: InfiniteQueryFunctionWithVariables[TResult, TKey, TVariables, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */, TMoreVariable](
    queryKey: TKey,
    variables: TVariables,
    queryFn: InfiniteQueryFunctionWithVariables[TResult, TKey, TVariables, TMoreVariable],
    config: InfiniteQueryOptions[TResult, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */, TMoreVariable](
    queryKey: js.UndefOr[scala.Nothing],
    variables: TVariables,
    queryFn: InfiniteQueryFunctionWithVariables[TResult, TKey, TVariables, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */, TMoreVariable](
    queryKey: js.UndefOr[scala.Nothing],
    variables: TVariables,
    queryFn: InfiniteQueryFunctionWithVariables[TResult, TKey, TVariables, TMoreVariable],
    config: InfiniteQueryOptions[TResult, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */, TMoreVariable](
    queryKey: Null,
    variables: TVariables,
    queryFn: InfiniteQueryFunctionWithVariables[TResult, TKey, TVariables, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */, TMoreVariable](
    queryKey: Null,
    variables: TVariables,
    queryFn: InfiniteQueryFunctionWithVariables[TResult, TKey, TVariables, TMoreVariable],
    config: InfiniteQueryOptions[TResult, TMoreVariable]
  ): InfiniteQueryResult[TResult, TMoreVariable] = js.native
}

