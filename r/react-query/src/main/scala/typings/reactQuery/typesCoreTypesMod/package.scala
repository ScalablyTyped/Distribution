package typings.reactQuery.typesCoreTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends string ? [T] : std.Exclude<T, string>
  }}}
  */
type EnsuredQueryKey[T /* <: QueryKey */] = T

type FetchInfiniteQueryOptions[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */] = FetchQueryOptions[TQueryFnData, TError, InfiniteData[TData], TQueryKey]

type GetNextPageParamFunction[TQueryFnData] = js.Function2[/* lastPage */ TQueryFnData, /* allPages */ js.Array[TQueryFnData], Any]

type GetPreviousPageParamFunction[TQueryFnData] = js.Function2[/* firstPage */ TQueryFnData, /* allPages */ js.Array[TQueryFnData], Any]

type InfiniteQueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey /* <: QueryKey */] = QueryObserverOptions[TQueryFnData, TError, InfiniteData[TData], InfiniteData[TQueryData], TQueryKey]

type InitialDataFunction[T] = js.Function0[js.UndefOr[T]]

type InvalidateOptions = RefetchOptions

type MutateFunction[TData, TError, TVariables, TContext] = js.Function2[
/* variables */ TVariables, 
/* options */ js.UndefOr[MutateOptions[TData, TError, TVariables, TContext]], 
js.Promise[TData]]

type MutationFunction[TData, TVariables] = js.Function1[/* variables */ TVariables, js.Promise[TData]]

type MutationKey = String | js.Array[Any]

type MutationMeta = Record[String, Any]

type PlaceholderDataFunction[TResult] = js.Function0[js.UndefOr[TResult]]

type QueryFunction[T, TQueryKey /* <: QueryKey */] = js.Function1[/* context */ QueryFunctionContext[TQueryKey, Any], T | js.Promise[T]]

type QueryKey = String | js.Array[Any]

type QueryKeyHashFunction[TQueryKey /* <: QueryKey */] = js.Function1[/* queryKey */ TQueryKey, String]

type QueryMeta = Record[String, Any]

type ResetOptions = RefetchOptions
