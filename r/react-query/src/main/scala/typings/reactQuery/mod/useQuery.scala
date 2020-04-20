package typings.reactQuery.mod

import typings.reactQuery.AnonConfig
import typings.reactQuery.AnonQueryFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-query", "useQuery")
@js.native
object useQuery extends js.Object {
  def apply[TResult, TKey /* <: AnyQueryKey */](queryKey: TKey, queryFn: QueryFunction[TResult, TKey]): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */](queryKey: TKey, queryFn: QueryFunction[TResult, TKey], config: QueryOptions[TResult]): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */](queryKey: js.UndefOr[scala.Nothing], queryFn: QueryFunction[TResult, TKey]): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */](
    queryKey: js.UndefOr[scala.Nothing],
    queryFn: QueryFunction[TResult, TKey],
    config: QueryOptions[TResult]
  ): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */](queryKey: Null, queryFn: QueryFunction[TResult, TKey]): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */](queryKey: Null, queryFn: QueryFunction[TResult, TKey], config: QueryOptions[TResult]): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](hasQueryKeyVariablesQueryFnConfig: AnonConfig[TKey, TVariables, TResult]): QueryResult[TResult] = js.native
  def apply[TResult, TSingleKey /* <: String */, TVariables /* <: AnyVariables */](hasQueryKeyVariablesQueryFnConfig: AnonQueryFn[TSingleKey, TVariables, TResult]): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: TKey,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables]
  ): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: TKey,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables],
    config: QueryOptions[TResult]
  ): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: js.UndefOr[scala.Nothing],
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables]
  ): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: js.UndefOr[scala.Nothing],
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables],
    config: QueryOptions[TResult]
  ): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: Null,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables]
  ): QueryResult[TResult] = js.native
  def apply[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: Null,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables],
    config: QueryOptions[TResult]
  ): QueryResult[TResult] = js.native
}

