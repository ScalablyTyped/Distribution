package typings.reactQuery

import typings.reactQuery.reactQueryInts.`20`
import typings.reactQuery.reactTypesMod.UseQueryOptions
import typings.reactQuery.reactTypesMod.UseQueryResult
import typings.reactQuery.typesMod.QueryKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useQueriesMod {
  
  @JSImport("react-query/types/react/useQueries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useQueries[T /* <: js.Array[Any] */](
    queries: /* import warning: importer.ImportType#apply c repeated non-array type: []['length'] extends react-query.react-query/types/react/useQueries.MAXIMUM_DEPTH ? std.Array<react-query.react-query/types/react/types.UseQueryOptions<unknown, unknown, unknown, react-query.react-query/types/core/types.QueryKey>> : T extends [] ? [] : T extends [infer Head] ? [...[], react-query.react-query/types/react/useQueries.GetOptions<any>] : T extends [infer Head, ...infer Tail] ? any : std.Array<unknown> extends T ? T : T extends std.Array<react-query.react-query/types/react/types.UseQueryOptions<infer TQueryFnData, infer TError, infer TData, infer TQueryKey>> ? std.Array<react-query.react-query/types/react/types.UseQueryOptions<any, any, any, any>> : std.Array<react-query.react-query/types/react/types.UseQueryOptions<unknown, unknown, unknown, react-query.react-query/types/core/types.QueryKey>> */ js.Array[
      (js.Array[Any | js.Array[Any] | (UseQueryOptions[Any, Any, Any, Any | QueryKey])]) | T
    ]
  ): QueriesResults[T, js.Array[Any], js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueries")(queries.asInstanceOf[js.Any]).asInstanceOf[QueriesResults[T, js.Array[Any], js.Array[Any]]]
  
  type GetOptions[T /* <: Any */] = UseQueryOptions[Any, Any, Any, Any | QueryKey]
  
  type GetResults[T] = UseQueryResult[Any, Any]
  
  type MAXIMUM_DEPTH = `20`
  
  type QueriesOptions[T /* <: js.Array[Any] */, Result /* <: js.Array[Any] */, Depth /* <: js.Array[Double] */] = (js.Array[Any | Result | (UseQueryOptions[Any, Any, Any, Any | QueryKey])]) | T
  
  type QueriesResults[T /* <: js.Array[Any] */, Result /* <: js.Array[Any] */, Depth /* <: js.Array[Double] */] = js.Array[Any | Result | (UseQueryResult[Any, Any])]
}
