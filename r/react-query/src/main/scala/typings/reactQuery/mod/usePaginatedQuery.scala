package typings.reactQuery.mod

import typings.reactQuery.AnonConfig
import typings.reactQuery.AnonQueryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-query", "usePaginatedQuery")
@js.native
object usePaginatedQuery extends js.Object {
  def apply[TResult, TKey /* <: String */](queryKey: TKey, queryFn: QueryFunction[TResult, js.Array[TKey]]): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */](queryKey: TKey, queryFn: QueryFunction[TResult, js.Array[TKey]], config: QueryOptions[TResult]): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */](queryKey: js.UndefOr[scala.Nothing], queryFn: QueryFunction[TResult, js.Array[TKey]]): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */](
    queryKey: js.UndefOr[scala.Nothing],
    queryFn: QueryFunction[TResult, js.Array[TKey]],
    config: QueryOptions[TResult]
  ): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */](queryKey: Null, queryFn: QueryFunction[TResult, js.Array[TKey]]): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */](queryKey: Null, queryFn: QueryFunction[TResult, js.Array[TKey]], config: QueryOptions[TResult]): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](hasQueryKeyVariablesQueryFnConfig: AnonConfig[TKey, TVariables, TResult]): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TSingleKey /* <: String */, TVariables /* <: AnyVariables */](hasQueryKeyVariablesQueryFnConfig: AnonQueryFn[TSingleKey, TVariables, TResult]): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: TKey,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables]
  ): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: TKey,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables],
    config: QueryOptions[TResult]
  ): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: js.UndefOr[scala.Nothing],
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables]
  ): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: js.UndefOr[scala.Nothing],
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables],
    config: QueryOptions[TResult]
  ): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: Null,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables]
  ): PaginatedQueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: Null,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables],
    config: QueryOptions[TResult]
  ): PaginatedQueryResult[TResult] = js.native
}

