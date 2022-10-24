package typings.reactQuery

import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import typings.reactQuery.anon.OmitMutationFiltersmutati
import typings.reactQuery.reactQueryStrings.mutationFn
import typings.reactQuery.reactQueryStrings.mutationKey
import typings.reactQuery.reactQueryStrings.queryFn
import typings.reactQuery.reactQueryStrings.queryKey
import typings.reactQuery.typesCoreHydrationMod.HydrateOptions
import typings.reactQuery.typesCoreMod.QueryClient
import typings.reactQuery.typesCoreTypesMod.MutationFunction
import typings.reactQuery.typesCoreTypesMod.MutationKey
import typings.reactQuery.typesCoreTypesMod.QueryFunction
import typings.reactQuery.typesCoreTypesMod.QueryKey
import typings.reactQuery.typesCoreUtilsMod.MutationFilters
import typings.reactQuery.typesCoreUtilsMod.QueryFilters
import typings.reactQuery.typesReactHydrateMod.HydrateProps
import typings.reactQuery.typesReactQueryClientProviderMod.QueryClientProviderProps
import typings.reactQuery.typesReactQueryErrorResetBoundaryMod.QueryErrorResetBoundaryProps
import typings.reactQuery.typesReactQueryErrorResetBoundaryMod.QueryErrorResetBoundaryValue
import typings.reactQuery.typesReactTypesMod.UseInfiniteQueryOptions
import typings.reactQuery.typesReactTypesMod.UseInfiniteQueryResult
import typings.reactQuery.typesReactTypesMod.UseMutationOptions
import typings.reactQuery.typesReactTypesMod.UseMutationResult
import typings.reactQuery.typesReactTypesMod.UseQueryOptions
import typings.reactQuery.typesReactTypesMod.UseQueryResult
import typings.reactQuery.typesReactUseQueriesMod.QueriesResults
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReactMod {
  
  @JSImport("react-query/types/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Hydrate(param0: HydrateProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Hydrate")(param0.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def QueryClientProvider(param0: QueryClientProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("QueryClientProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def QueryErrorResetBoundary(param0: QueryErrorResetBoundaryProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("QueryErrorResetBoundary")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useHydrate(state: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useHydrate")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useHydrate(state: Any, options: HydrateOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useHydrate")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useInfiniteQuery[TQueryFnData, TError, TData](queryKey: String): UseInfiniteQueryResult[TData, TError] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInfiniteQuery")(queryKey.asInstanceOf[js.Any]).asInstanceOf[UseInfiniteQueryResult[TData, TError]]
  inline def useInfiniteQuery[TQueryFnData, TError, TData](queryKey: String, queryFn: QueryFunction[TQueryFnData, String]): UseInfiniteQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInfiniteQuery")(queryKey.asInstanceOf[js.Any], queryFn.asInstanceOf[js.Any])).asInstanceOf[UseInfiniteQueryResult[TData, TError]]
  inline def useInfiniteQuery[TQueryFnData, TError, TData](
    queryKey: String,
    queryFn: QueryFunction[TQueryFnData, String],
    options: Omit[
      UseInfiniteQueryOptions[TQueryFnData, TError, TData, TQueryFnData, String], 
      queryKey | queryFn
    ]
  ): UseInfiniteQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInfiniteQuery")(queryKey.asInstanceOf[js.Any], queryFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseInfiniteQueryResult[TData, TError]]
  inline def useInfiniteQuery[TQueryFnData, TError, TData](queryKey: js.Array[Any]): UseInfiniteQueryResult[TData, TError] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInfiniteQuery")(queryKey.asInstanceOf[js.Any]).asInstanceOf[UseInfiniteQueryResult[TData, TError]]
  inline def useInfiniteQuery[TQueryFnData, TError, TData](queryKey: js.Array[Any], queryFn: QueryFunction[TQueryFnData, js.Array[Any]]): UseInfiniteQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInfiniteQuery")(queryKey.asInstanceOf[js.Any], queryFn.asInstanceOf[js.Any])).asInstanceOf[UseInfiniteQueryResult[TData, TError]]
  inline def useInfiniteQuery[TQueryFnData, TError, TData](
    queryKey: js.Array[Any],
    queryFn: QueryFunction[TQueryFnData, js.Array[Any]],
    options: Omit[
      UseInfiniteQueryOptions[TQueryFnData, TError, TData, TQueryFnData, js.Array[Any]], 
      queryKey | queryFn
    ]
  ): UseInfiniteQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInfiniteQuery")(queryKey.asInstanceOf[js.Any], queryFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseInfiniteQueryResult[TData, TError]]
  inline def useInfiniteQuery[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */](options: UseInfiniteQueryOptions[TQueryFnData, TError, TData, TQueryFnData, TQueryKey]): UseInfiniteQueryResult[TData, TError] = ^.asInstanceOf[js.Dynamic].applyDynamic("useInfiniteQuery")(options.asInstanceOf[js.Any]).asInstanceOf[UseInfiniteQueryResult[TData, TError]]
  
  inline def useInfiniteQuery_queryKey[TQueryFnData, TError, TData](
    queryKey: String,
    options: Omit[
      UseInfiniteQueryOptions[TQueryFnData, TError, TData, TQueryFnData, String], 
      queryKey
    ]
  ): UseInfiniteQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInfiniteQuery")(queryKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseInfiniteQueryResult[TData, TError]]
  inline def useInfiniteQuery_queryKey[TQueryFnData, TError, TData](
    queryKey: js.Array[Any],
    options: Omit[
      UseInfiniteQueryOptions[TQueryFnData, TError, TData, TQueryFnData, js.Array[Any]], 
      queryKey
    ]
  ): UseInfiniteQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useInfiniteQuery")(queryKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseInfiniteQueryResult[TData, TError]]
  
  inline def useIsFetching(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsFetching")().asInstanceOf[Double]
  inline def useIsFetching(filters: QueryFilters): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsFetching")(filters.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def useIsFetching(queryKey: Unit, filters: QueryFilters): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsFetching")(queryKey.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def useIsFetching(queryKey: QueryKey): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsFetching")(queryKey.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def useIsFetching(queryKey: QueryKey, filters: QueryFilters): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsFetching")(queryKey.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def useIsMutating(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsMutating")().asInstanceOf[Double]
  inline def useIsMutating(filters: MutationFilters): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsMutating")(filters.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def useIsMutating(mutationKey: Unit, filters: OmitMutationFiltersmutati): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsMutating")(mutationKey.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def useIsMutating(mutationKey: MutationKey): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsMutating")(mutationKey.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def useIsMutating(mutationKey: MutationKey, filters: OmitMutationFiltersmutati): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsMutating")(mutationKey.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def useMutation[TData, TError, TVariables, TContext](mutationFn: MutationFunction[TData, TVariables]): UseMutationResult[TData, TError, TVariables, TContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutationFn.asInstanceOf[js.Any]).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  inline def useMutation[TData, TError, TVariables, TContext](mutationKey: MutationKey): UseMutationResult[TData, TError, TVariables, TContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutationKey.asInstanceOf[js.Any]).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  inline def useMutation[TData, TError, TVariables, TContext](
    mutationKey: MutationKey,
    mutationFn: Unit,
    options: Omit[UseMutationOptions[TData, TError, TVariables, TContext], mutationKey | mutationFn]
  ): UseMutationResult[TData, TError, TVariables, TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutationKey.asInstanceOf[js.Any], mutationFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  inline def useMutation[TData, TError, TVariables, TContext](mutationKey: MutationKey, mutationFn: MutationFunction[TData, TVariables]): UseMutationResult[TData, TError, TVariables, TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutationKey.asInstanceOf[js.Any], mutationFn.asInstanceOf[js.Any])).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  inline def useMutation[TData, TError, TVariables, TContext](
    mutationKey: MutationKey,
    mutationFn: MutationFunction[TData, TVariables],
    options: Omit[UseMutationOptions[TData, TError, TVariables, TContext], mutationKey | mutationFn]
  ): UseMutationResult[TData, TError, TVariables, TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutationKey.asInstanceOf[js.Any], mutationFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  inline def useMutation[TData, TError, TVariables, TContext](options: UseMutationOptions[TData, TError, TVariables, TContext]): UseMutationResult[TData, TError, TVariables, TContext] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(options.asInstanceOf[js.Any]).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  
  inline def useMutation_mutationFn[TData, TError, TVariables, TContext](
    mutationFn: MutationFunction[TData, TVariables],
    options: Omit[UseMutationOptions[TData, TError, TVariables, TContext], mutationFn]
  ): UseMutationResult[TData, TError, TVariables, TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutationFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  
  inline def useMutation_mutationKey[TData, TError, TVariables, TContext](
    mutationKey: MutationKey,
    options: Omit[UseMutationOptions[TData, TError, TVariables, TContext], mutationKey]
  ): UseMutationResult[TData, TError, TVariables, TContext] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMutation")(mutationKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseMutationResult[TData, TError, TVariables, TContext]]
  
  inline def useQueries[T /* <: js.Array[Any] */](
    queries: /* import warning: importer.ImportType#apply c repeated non-array type: []['length'] extends react-query.react-query/types/react/useQueries.MAXIMUM_DEPTH ? std.Array<react-query.react-query/types/react/types.UseQueryOptions<unknown, unknown, unknown, react-query.react-query/types/core/types.QueryKey>> : T extends [] ? [] : T extends [infer Head] ? [...[], react-query.react-query/types/react/useQueries.GetOptions<Head>] : T extends [infer Head, ...infer Tail] ? react-query.react-query/types/react/useQueries.QueriesOptions<[...Tail], [...[], react-query.react-query/types/react/useQueries.GetOptions<Head>], [...[], 1]> : std.Array<unknown> extends T ? T : T extends std.Array<react-query.react-query/types/react/types.UseQueryOptions<infer TQueryFnData, infer TError, infer TData, infer TQueryKey>> ? std.Array<react-query.react-query/types/react/types.UseQueryOptions<TQueryFnData, TError, TData, TQueryKey>> : std.Array<react-query.react-query/types/react/types.UseQueryOptions<unknown, unknown, unknown, react-query.react-query/types/core/types.QueryKey>> */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: []['length'] extends react-query.react-query/types/react/useQueries.MAXIMUM_DEPTH ? std.Array<react-query.react-query/types/react/types.UseQueryOptions<unknown, unknown, unknown, react-query.react-query/types/core/types.QueryKey>> : T extends [] ? [] : T extends [infer Head] ? [...[], react-query.react-query/types/react/useQueries.GetOptions<Head>] : T extends [infer Head, ...infer Tail] ? react-query.react-query/types/react/useQueries.QueriesOptions<[...Tail], [...[], react-query.react-query/types/react/useQueries.GetOptions<Head>], [...[], 1]> : std.Array<unknown> extends T ? T : T extends std.Array<react-query.react-query/types/react/types.UseQueryOptions<infer TQueryFnData, infer TError, infer TData, infer TQueryKey>> ? std.Array<react-query.react-query/types/react/types.UseQueryOptions<TQueryFnData, TError, TData, TQueryKey>> : std.Array<react-query.react-query/types/react/types.UseQueryOptions<unknown, unknown, unknown, react-query.react-query/types/core/types.QueryKey>> */ js.Any
    ]
  ): QueriesResults[T, js.Array[Any], js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueries")(queries.asInstanceOf[js.Any]).asInstanceOf[QueriesResults[T, js.Array[Any], js.Array[Any]]]
  
  inline def useQuery[TQueryFnData, TError, TData](queryKey: String): UseQueryResult[TData, TError] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(queryKey.asInstanceOf[js.Any]).asInstanceOf[UseQueryResult[TData, TError]]
  inline def useQuery[TQueryFnData, TError, TData](queryKey: String, queryFn: QueryFunction[TQueryFnData, String]): UseQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(queryKey.asInstanceOf[js.Any], queryFn.asInstanceOf[js.Any])).asInstanceOf[UseQueryResult[TData, TError]]
  inline def useQuery[TQueryFnData, TError, TData](
    queryKey: String,
    queryFn: QueryFunction[TQueryFnData, String],
    options: Omit[UseQueryOptions[TQueryFnData, TError, TData, String], queryKey | queryFn]
  ): UseQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(queryKey.asInstanceOf[js.Any], queryFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseQueryResult[TData, TError]]
  inline def useQuery[TQueryFnData, TError, TData](queryKey: js.Array[Any]): UseQueryResult[TData, TError] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(queryKey.asInstanceOf[js.Any]).asInstanceOf[UseQueryResult[TData, TError]]
  inline def useQuery[TQueryFnData, TError, TData](queryKey: js.Array[Any], queryFn: QueryFunction[TQueryFnData, js.Array[Any]]): UseQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(queryKey.asInstanceOf[js.Any], queryFn.asInstanceOf[js.Any])).asInstanceOf[UseQueryResult[TData, TError]]
  inline def useQuery[TQueryFnData, TError, TData](
    queryKey: js.Array[Any],
    queryFn: QueryFunction[TQueryFnData, js.Array[Any]],
    options: Omit[UseQueryOptions[TQueryFnData, TError, TData, js.Array[Any]], queryKey | queryFn]
  ): UseQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(queryKey.asInstanceOf[js.Any], queryFn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseQueryResult[TData, TError]]
  inline def useQuery[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */](options: UseQueryOptions[TQueryFnData, TError, TData, TQueryKey]): UseQueryResult[TData, TError] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(options.asInstanceOf[js.Any]).asInstanceOf[UseQueryResult[TData, TError]]
  
  inline def useQueryClient(): QueryClient = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueryClient")().asInstanceOf[QueryClient]
  
  inline def useQueryErrorResetBoundary(): QueryErrorResetBoundaryValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueryErrorResetBoundary")().asInstanceOf[QueryErrorResetBoundaryValue]
  
  inline def useQuery_queryKey[TQueryFnData, TError, TData](queryKey: String, options: Omit[UseQueryOptions[TQueryFnData, TError, TData, String], queryKey]): UseQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(queryKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseQueryResult[TData, TError]]
  inline def useQuery_queryKey[TQueryFnData, TError, TData](
    queryKey: js.Array[Any],
    options: Omit[UseQueryOptions[TQueryFnData, TError, TData, js.Array[Any]], queryKey]
  ): UseQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(queryKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseQueryResult[TData, TError]]
}
