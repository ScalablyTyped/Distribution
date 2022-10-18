package typings.reactQuery

import typings.reactQuery.reactQueryInts.`20`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReactUseQueriesMod {
  
  @JSImport("react-query/types/react/useQueries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useQueries[T /* <: js.Array[Any] */](
    queries: /* import warning: importer.ImportType#apply c repeated non-array type: []['length'] extends react-query.react-query/types/react/useQueries.MAXIMUM_DEPTH ? std.Array<react-query.react-query/types/react/types.UseQueryOptions<unknown, unknown, unknown, react-query.react-query/types/core/types.QueryKey>> : T extends [] ? [] : T extends [infer Head] ? [...[], react-query.react-query/types/react/useQueries.GetOptions<Head>] : T extends [infer Head, ...infer Tail] ? react-query.react-query/types/react/useQueries.QueriesOptions<[...Tail], [...[], react-query.react-query/types/react/useQueries.GetOptions<Head>], [...[], 1]> : std.Array<unknown> extends T ? T : T extends std.Array<react-query.react-query/types/react/types.UseQueryOptions<infer TQueryFnData, infer TError, infer TData, infer TQueryKey>> ? std.Array<react-query.react-query/types/react/types.UseQueryOptions<TQueryFnData, TError, TData, TQueryKey>> : std.Array<react-query.react-query/types/react/types.UseQueryOptions<unknown, unknown, unknown, react-query.react-query/types/core/types.QueryKey>> */ js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: []['length'] extends react-query.react-query/types/react/useQueries.MAXIMUM_DEPTH ? std.Array<react-query.react-query/types/react/types.UseQueryOptions<unknown, unknown, unknown, react-query.react-query/types/core/types.QueryKey>> : T extends [] ? [] : T extends [infer Head] ? [...[], react-query.react-query/types/react/useQueries.GetOptions<Head>] : T extends [infer Head, ...infer Tail] ? react-query.react-query/types/react/useQueries.QueriesOptions<[...Tail], [...[], react-query.react-query/types/react/useQueries.GetOptions<Head>], [...[], 1]> : std.Array<unknown> extends T ? T : T extends std.Array<react-query.react-query/types/react/types.UseQueryOptions<infer TQueryFnData, infer TError, infer TData, infer TQueryKey>> ? std.Array<react-query.react-query/types/react/types.UseQueryOptions<TQueryFnData, TError, TData, TQueryKey>> : std.Array<react-query.react-query/types/react/types.UseQueryOptions<unknown, unknown, unknown, react-query.react-query/types/core/types.QueryKey>> */ js.Any
    ]
  ): QueriesResults[T, js.Array[Any], js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueries")(queries.asInstanceOf[js.Any]).asInstanceOf[QueriesResults[T, js.Array[Any], js.Array[Any]]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends {  queryFnData :infer TQueryFnData,   error :infer TError | undefined,   data :infer TData} ? react-query.react-query/types/react/types.UseQueryOptions<TQueryFnData, TError, TData, react-query.react-query/types/core/types.QueryKey> : T extends {  queryFnData :infer TQueryFnData,   error :infer TError | undefined} ? react-query.react-query/types/react/types.UseQueryOptions<TQueryFnData, TError, TQueryFnData, react-query.react-query/types/core/types.QueryKey> : T extends {  data :infer TData,   error :infer TError | undefined} ? react-query.react-query/types/react/types.UseQueryOptions<unknown, TError, TData, react-query.react-query/types/core/types.QueryKey> : T extends [infer TQueryFnData, infer TError, infer TData] ? react-query.react-query/types/react/types.UseQueryOptions<TQueryFnData, TError, TData, react-query.react-query/types/core/types.QueryKey> : T extends [infer TQueryFnData, infer TError] ? react-query.react-query/types/react/types.UseQueryOptions<TQueryFnData, TError, TQueryFnData, react-query.react-query/types/core/types.QueryKey> : T extends [infer TQueryFnData] ? react-query.react-query/types/react/types.UseQueryOptions<TQueryFnData, unknown, TQueryFnData, react-query.react-query/types/core/types.QueryKey> : T extends {  queryFn :react-query.react-query/types/core/types.QueryFunction<infer TQueryFnData, infer TQueryKey> | undefined, select (data : any): infer TData} ? react-query.react-query/types/react/types.UseQueryOptions<TQueryFnData, unknown, TData, TQueryKey> : T extends {  queryFn :react-query.react-query/types/core/types.QueryFunction<infer TQueryFnData, infer TQueryKey> | undefined} ? react-query.react-query/types/react/types.UseQueryOptions<TQueryFnData, unknown, TQueryFnData, TQueryKey> : react-query.react-query/types/react/types.UseQueryOptions<unknown, unknown, unknown, react-query.react-query/types/core/types.QueryKey>
    }}}
    */
  @js.native
  trait GetOptions[T /* <: Any */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends {  queryFnData :any,   error :infer TError | undefined,   data :infer TData} ? react-query.react-query/types/react/types.UseQueryResult<TData, TError> : T extends {  queryFnData :infer TQueryFnData,   error :infer TError | undefined} ? react-query.react-query/types/react/types.UseQueryResult<TQueryFnData, TError> : T extends {  data :infer TData,   error :infer TError | undefined} ? react-query.react-query/types/react/types.UseQueryResult<TData, TError> : T extends [any, infer TError, infer TData] ? react-query.react-query/types/react/types.UseQueryResult<TData, TError> : T extends [infer TQueryFnData, infer TError] ? react-query.react-query/types/react/types.UseQueryResult<TQueryFnData, TError> : T extends [infer TQueryFnData] ? react-query.react-query/types/react/types.UseQueryResult<TQueryFnData, unknown> : T extends {  queryFn :react-query.react-query/types/core/types.QueryFunction<any, any> | undefined, select (data : any): infer TData} ? react-query.react-query/types/react/types.UseQueryResult<TData, unknown> : T extends {  queryFn :react-query.react-query/types/core/types.QueryFunction<infer TQueryFnData, any> | undefined} ? react-query.react-query/types/react/types.UseQueryResult<TQueryFnData, unknown> : react-query.react-query/types/react/types.UseQueryResult<unknown, unknown>
    }}}
    */
  @js.native
  trait GetResults[T] extends StObject
  
  type MAXIMUM_DEPTH = `20`
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Depth['length'] extends react-query.react-query/types/react/useQueries.MAXIMUM_DEPTH ? std.Array<react-query.react-query/types/react/types.UseQueryOptions<unknown, unknown, unknown, react-query.react-query/types/core/types.QueryKey>> : T extends [] ? [] : T extends [infer Head] ? [...Result, react-query.react-query/types/react/useQueries.GetOptions<Head>] : T extends [infer Head, ...infer Tail] ? react-query.react-query/types/react/useQueries.QueriesOptions<[...Tail], [...Result, react-query.react-query/types/react/useQueries.GetOptions<Head>], [...Depth, 1]> : std.Array<unknown> extends T ? T : T extends std.Array<react-query.react-query/types/react/types.UseQueryOptions<infer TQueryFnData, infer TError, infer TData, infer TQueryKey>> ? std.Array<react-query.react-query/types/react/types.UseQueryOptions<TQueryFnData, TError, TData, TQueryKey>> : std.Array<react-query.react-query/types/react/types.UseQueryOptions<unknown, unknown, unknown, react-query.react-query/types/core/types.QueryKey>>
    }}}
    */
  @js.native
  trait QueriesOptions[T /* <: js.Array[Any] */, Result /* <: js.Array[Any] */, Depth /* <: js.Array[Double] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Depth['length'] extends react-query.react-query/types/react/useQueries.MAXIMUM_DEPTH ? std.Array<react-query.react-query/types/react/types.UseQueryResult<unknown, unknown>> : T extends [] ? [] : T extends [infer Head] ? [...Result, react-query.react-query/types/react/useQueries.GetResults<Head>] : T extends [infer Head, ...infer Tail] ? react-query.react-query/types/react/useQueries.QueriesResults<[...Tail], [...Result, react-query.react-query/types/react/useQueries.GetResults<Head>], [...Depth, 1]> : T extends std.Array<react-query.react-query/types/react/types.UseQueryOptions<infer TQueryFnData, infer TError, infer TData, any>> ? std.Array<react-query.react-query/types/react/types.UseQueryResult<unknown extends TData ? TQueryFnData : TData, TError>> : std.Array<react-query.react-query/types/react/types.UseQueryResult<unknown, unknown>>
    }}}
    */
  @js.native
  trait QueriesResults[T /* <: js.Array[Any] */, Result /* <: js.Array[Any] */, Depth /* <: js.Array[Double] */] extends StObject
}
