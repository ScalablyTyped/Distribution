package typings.reactQuery

import typings.reactQuery.reactQueryStrings.queryFn
import typings.reactQuery.reactQueryStrings.queryKey
import typings.reactQuery.typesCoreTypesMod.QueryFunction
import typings.reactQuery.typesCoreTypesMod.QueryKey
import typings.reactQuery.typesReactTypesMod.UseQueryOptions
import typings.reactQuery.typesReactTypesMod.UseQueryResult
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReactUseQueryMod {
  
  @JSImport("react-query/types/react/useQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def useQuery_queryKey[TQueryFnData, TError, TData](queryKey: String, options: Omit[UseQueryOptions[TQueryFnData, TError, TData, String], queryKey]): UseQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(queryKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseQueryResult[TData, TError]]
  inline def useQuery_queryKey[TQueryFnData, TError, TData](
    queryKey: js.Array[Any],
    options: Omit[UseQueryOptions[TQueryFnData, TError, TData, js.Array[Any]], queryKey]
  ): UseQueryResult[TData, TError] = (^.asInstanceOf[js.Dynamic].applyDynamic("useQuery")(queryKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseQueryResult[TData, TError]]
}
