package typings.reactQuery.mod

import typings.reactQuery.anon.Config
import typings.reactQuery.anon.Exact
import typings.reactQuery.anon.`0`
import typings.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryCache_ extends js.Object {
  var isFetching: Double = js.native
  def clear(): js.Array[CachedQuery] = js.native
  def getQueries(queryKey: AnyQueryKey): js.Array[CachedQuery] = js.native
  def getQuery(queryKey: AnyQueryKey): js.UndefOr[CachedQuery] = js.native
  def getQueryData(key: String): js.UndefOr[js.Any] = js.native
  def getQueryData(key: AnyQueryKey): js.UndefOr[js.Any] = js.native
  def prefetchQuery[TResult, TKey /* <: String */](queryKey: TKey, queryFn: QueryFunction[TResult, js.Array[TKey]]): js.Promise[TResult] = js.native
  def prefetchQuery[TResult, TKey /* <: String */](queryKey: TKey, queryFn: QueryFunction[TResult, js.Array[TKey]], config: QueryOptions[TResult]): js.Promise[TResult] = js.native
  def prefetchQuery[TResult, TKey /* <: String */](queryKey: js.UndefOr[scala.Nothing], queryFn: QueryFunction[TResult, js.Array[TKey]]): js.Promise[TResult] = js.native
  def prefetchQuery[TResult, TKey /* <: String */](
    queryKey: js.UndefOr[scala.Nothing],
    queryFn: QueryFunction[TResult, js.Array[TKey]],
    config: QueryOptions[TResult]
  ): js.Promise[TResult] = js.native
  def prefetchQuery[TResult, TKey /* <: String */](queryKey: Null, queryFn: QueryFunction[TResult, js.Array[TKey]]): js.Promise[TResult] = js.native
  def prefetchQuery[TResult, TKey /* <: String */](queryKey: Null, queryFn: QueryFunction[TResult, js.Array[TKey]], config: QueryOptions[TResult]): js.Promise[TResult] = js.native
  def prefetchQuery[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](hasQueryKeyVariablesQueryFnConfig: Config[TKey, TVariables, TResult]): js.Promise[TResult] = js.native
  def prefetchQuery[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](
    queryKey: TKey,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables]
  ): js.Promise[TResult] = js.native
  def prefetchQuery[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](
    queryKey: TKey,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables],
    config: QueryOptions[TResult]
  ): js.Promise[TResult] = js.native
  def prefetchQuery[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](
    queryKey: js.UndefOr[scala.Nothing],
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables]
  ): js.Promise[TResult] = js.native
  def prefetchQuery[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](
    queryKey: js.UndefOr[scala.Nothing],
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables],
    config: QueryOptions[TResult]
  ): js.Promise[TResult] = js.native
  def prefetchQuery[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](
    queryKey: Null,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables]
  ): js.Promise[TResult] = js.native
  def prefetchQuery[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](
    queryKey: Null,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables],
    config: QueryOptions[TResult]
  ): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_TResultTKey_AnyQueryKey[TResult, TKey /* <: AnyQueryKey */](queryKey: TKey, queryFn: QueryFunction[TResult, TKey]): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_TResultTKey_AnyQueryKey[TResult, TKey /* <: AnyQueryKey */](queryKey: TKey, queryFn: QueryFunction[TResult, TKey], config: QueryOptions[TResult]): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_TResultTKey_AnyQueryKey[TResult, TKey /* <: AnyQueryKey */](queryKey: js.UndefOr[scala.Nothing], queryFn: QueryFunction[TResult, TKey]): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_TResultTKey_AnyQueryKey[TResult, TKey /* <: AnyQueryKey */](
    queryKey: js.UndefOr[scala.Nothing],
    queryFn: QueryFunction[TResult, TKey],
    config: QueryOptions[TResult]
  ): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_TResultTKey_AnyQueryKey[TResult, TKey /* <: AnyQueryKey */](queryKey: Null, queryFn: QueryFunction[TResult, TKey]): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_TResultTKey_AnyQueryKey[TResult, TKey /* <: AnyQueryKey */](queryKey: Null, queryFn: QueryFunction[TResult, TKey], config: QueryOptions[TResult]): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_TResultTKey_StringTVariables_AnyVariables[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: TKey,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables]
  ): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_TResultTKey_StringTVariables_AnyVariables[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: TKey,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables],
    config: QueryOptions[TResult]
  ): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_TResultTKey_StringTVariables_AnyVariables[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: js.UndefOr[scala.Nothing],
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables]
  ): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_TResultTKey_StringTVariables_AnyVariables[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: js.UndefOr[scala.Nothing],
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables],
    config: QueryOptions[TResult]
  ): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_TResultTKey_StringTVariables_AnyVariables[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: Null,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables]
  ): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_TResultTKey_StringTVariables_AnyVariables[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: Null,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables],
    config: QueryOptions[TResult]
  ): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_false[TResult, TKey /* <: String */](
    queryKey: js.Function0[js.UndefOr[TKey | `false` | Null]],
    queryFn: QueryFunction[TResult, js.Array[TKey]]
  ): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_false[TResult, TKey /* <: String */](
    queryKey: js.Function0[js.UndefOr[TKey | `false` | Null]],
    queryFn: QueryFunction[TResult, js.Array[TKey]],
    config: QueryOptions[TResult]
  ): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_false[TResult, TKey /* <: String */](queryKey: `false`, queryFn: QueryFunction[TResult, js.Array[TKey]]): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_false[TResult, TKey /* <: String */](queryKey: `false`, queryFn: QueryFunction[TResult, js.Array[TKey]], config: QueryOptions[TResult]): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_false[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](
    queryKey: js.Function0[js.UndefOr[TKey | `false` | Null]],
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables]
  ): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_false[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](
    queryKey: js.Function0[js.UndefOr[TKey | `false` | Null]],
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables],
    config: QueryOptions[TResult]
  ): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_false[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](
    queryKey: `false`,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables]
  ): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_false[TResult, TKey /* <: AnyQueryKey */, TVariables /* <: AnyVariables */](
    queryKey: `false`,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, TKey, TVariables],
    config: QueryOptions[TResult]
  ): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_false_TResultTKey_AnyQueryKey[TResult, TKey /* <: AnyQueryKey */](queryKey: js.Function0[js.UndefOr[TKey | `false` | Null]], queryFn: QueryFunction[TResult, TKey]): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_false_TResultTKey_AnyQueryKey[TResult, TKey /* <: AnyQueryKey */](
    queryKey: js.Function0[js.UndefOr[TKey | `false` | Null]],
    queryFn: QueryFunction[TResult, TKey],
    config: QueryOptions[TResult]
  ): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_false_TResultTKey_AnyQueryKey[TResult, TKey /* <: AnyQueryKey */](queryKey: `false`, queryFn: QueryFunction[TResult, TKey]): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_false_TResultTKey_AnyQueryKey[TResult, TKey /* <: AnyQueryKey */](queryKey: `false`, queryFn: QueryFunction[TResult, TKey], config: QueryOptions[TResult]): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_false_TResultTKey_StringTVariables_AnyVariables[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: js.Function0[js.UndefOr[TKey | `false` | Null]],
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables]
  ): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_false_TResultTKey_StringTVariables_AnyVariables[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: js.Function0[js.UndefOr[TKey | `false` | Null]],
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables],
    config: QueryOptions[TResult]
  ): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_false_TResultTKey_StringTVariables_AnyVariables[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: `false`,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables]
  ): js.Promise[TResult] = js.native
  @JSName("prefetchQuery")
  def prefetchQuery_false_TResultTKey_StringTVariables_AnyVariables[TResult, TKey /* <: String */, TVariables /* <: AnyVariables */](
    queryKey: `false`,
    variables: TVariables,
    queryFn: QueryFunctionWithVariables[TResult, js.Array[TKey], TVariables],
    config: QueryOptions[TResult]
  ): js.Promise[TResult] = js.native
  def refetchQueries(queryKeyOrPredicateFn: String): js.Promise[Unit] = js.native
  def refetchQueries(queryKeyOrPredicateFn: String, hasExactThrowOnErrorForce: Exact): js.Promise[Unit] = js.native
  def refetchQueries(queryKeyOrPredicateFn: js.Function1[/* query */ CachedQuery, Boolean]): js.Promise[Unit] = js.native
  def refetchQueries(
    queryKeyOrPredicateFn: js.Function1[/* query */ CachedQuery, Boolean],
    hasExactThrowOnErrorForce: Exact
  ): js.Promise[Unit] = js.native
  def refetchQueries(queryKeyOrPredicateFn: AnyQueryKey): js.Promise[Unit] = js.native
  def refetchQueries(queryKeyOrPredicateFn: AnyQueryKey, hasExactThrowOnErrorForce: Exact): js.Promise[Unit] = js.native
  def removeQueries(queryKeyOrPredicateFn: String): js.Promise[Unit] = js.native
  def removeQueries(queryKeyOrPredicateFn: String, hasExact: `0`): js.Promise[Unit] = js.native
  def removeQueries(queryKeyOrPredicateFn: js.Function1[/* query */ CachedQuery, Boolean]): js.Promise[Unit] = js.native
  def removeQueries(queryKeyOrPredicateFn: js.Function1[/* query */ CachedQuery, Boolean], hasExact: `0`): js.Promise[Unit] = js.native
  def removeQueries(queryKeyOrPredicateFn: AnyQueryKey): js.Promise[Unit] = js.native
  def removeQueries(queryKeyOrPredicateFn: AnyQueryKey, hasExact: `0`): js.Promise[Unit] = js.native
  def setQueryData(key: String, dataOrUpdater: js.Any): Unit = js.native
  def setQueryData(key: String, dataOrUpdater: js.Function1[/* oldData */ js.UndefOr[js.Any], _]): Unit = js.native
  def setQueryData(key: AnyQueryKey, dataOrUpdater: js.Any): Unit = js.native
  def setQueryData(key: AnyQueryKey, dataOrUpdater: js.Function1[/* oldData */ js.UndefOr[js.Any], _]): Unit = js.native
  def subscribe(callback: js.Function1[/* queryCache */ this.type, Unit]): js.Function0[Unit] = js.native
}

