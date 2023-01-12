package typings.reactQuery

import typings.reactQuery.typesCoreMutationMod.Mutation
import typings.reactQuery.typesCoreQueryMod.Query
import typings.reactQuery.typesCoreTypesMod.EnsuredQueryKey
import typings.reactQuery.typesCoreTypesMod.MutationFunction
import typings.reactQuery.typesCoreTypesMod.MutationKey
import typings.reactQuery.typesCoreTypesMod.MutationOptions
import typings.reactQuery.typesCoreTypesMod.QueryFunction
import typings.reactQuery.typesCoreTypesMod.QueryKey
import typings.reactQuery.typesCoreTypesMod.QueryOptions
import typings.std.AbortController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreUtilsMod {
  
  @JSImport("react-query/types/core/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def difference[T](array1: js.Array[T], array2: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def ensureQueryKeyArray(value: String): EnsuredQueryKey[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureQueryKeyArray")(value.asInstanceOf[js.Any]).asInstanceOf[EnsuredQueryKey[String]]
  inline def ensureQueryKeyArray(value: js.Array[Any]): EnsuredQueryKey[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureQueryKeyArray")(value.asInstanceOf[js.Any]).asInstanceOf[EnsuredQueryKey[js.Array[Any]]]
  
  inline def functionalUpdate[TInput, TOutput](updater: Updater[TInput, TOutput], input: TInput): TOutput = (^.asInstanceOf[js.Dynamic].applyDynamic("functionalUpdate")(updater.asInstanceOf[js.Any], input.asInstanceOf[js.Any])).asInstanceOf[TOutput]
  
  inline def getAbortController(): js.UndefOr[AbortController] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAbortController")().asInstanceOf[js.UndefOr[AbortController]]
  
  inline def hashQueryKey(queryKey: QueryKey): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashQueryKey")(queryKey.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hashQueryKeyByOptions(queryKey: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashQueryKeyByOptions")(queryKey.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hashQueryKeyByOptions(queryKey: String, options: QueryOptions[Any, Any, Any, String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hashQueryKeyByOptions")(queryKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def hashQueryKeyByOptions(queryKey: js.Array[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hashQueryKeyByOptions")(queryKey.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def hashQueryKeyByOptions(queryKey: js.Array[Any], options: QueryOptions[Any, Any, Any, js.Array[Any]]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("hashQueryKeyByOptions")(queryKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isError(value: Any): /* is std.Error */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isError")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.Error */ Boolean]
  
  inline def isPlainObject(o: Any): /* is std.Object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(o.asInstanceOf[js.Any]).asInstanceOf[/* is std.Object */ Boolean]
  
  inline def isQueryKey(value: Any): /* is react-query.react-query/types/core/types.QueryKey */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isQueryKey")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react-query.react-query/types/core/types.QueryKey */ Boolean]
  
  @JSImport("react-query/types/core/utils", "isServer")
  @js.native
  val isServer: Boolean = js.native
  
  inline def isValidTimeout(value: Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidTimeout")(value.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def mapQueryStatusFilter(): QueryStatusFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("mapQueryStatusFilter")().asInstanceOf[QueryStatusFilter]
  inline def mapQueryStatusFilter(active: Boolean): QueryStatusFilter = ^.asInstanceOf[js.Dynamic].applyDynamic("mapQueryStatusFilter")(active.asInstanceOf[js.Any]).asInstanceOf[QueryStatusFilter]
  inline def mapQueryStatusFilter(active: Boolean, inactive: Boolean): QueryStatusFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("mapQueryStatusFilter")(active.asInstanceOf[js.Any], inactive.asInstanceOf[js.Any])).asInstanceOf[QueryStatusFilter]
  inline def mapQueryStatusFilter(active: Unit, inactive: Boolean): QueryStatusFilter = (^.asInstanceOf[js.Dynamic].applyDynamic("mapQueryStatusFilter")(active.asInstanceOf[js.Any], inactive.asInstanceOf[js.Any])).asInstanceOf[QueryStatusFilter]
  
  inline def matchMutation(filters: MutationFilters, mutation: Mutation[Any, Any, Unit, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchMutation")(filters.asInstanceOf[js.Any], mutation.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def matchQuery(filters: QueryFilters, query: Query[Any, Any, Any, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchQuery")(filters.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
  
  inline def parseFilterArgs[TFilters /* <: QueryFilters */, TOptions](): js.Tuple2[TFilters, js.UndefOr[TOptions]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFilterArgs")().asInstanceOf[js.Tuple2[TFilters, js.UndefOr[TOptions]]]
  inline def parseFilterArgs[TFilters /* <: QueryFilters */, TOptions](arg1: QueryKey | TFilters): js.Tuple2[TFilters, js.UndefOr[TOptions]] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFilterArgs")(arg1.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TFilters, js.UndefOr[TOptions]]]
  inline def parseFilterArgs[TFilters /* <: QueryFilters */, TOptions](arg1: QueryKey | TFilters, arg2: TFilters | TOptions): js.Tuple2[TFilters, js.UndefOr[TOptions]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFilterArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TFilters, js.UndefOr[TOptions]]]
  inline def parseFilterArgs[TFilters /* <: QueryFilters */, TOptions](arg1: QueryKey | TFilters, arg2: TFilters | TOptions, arg3: TOptions): js.Tuple2[TFilters, js.UndefOr[TOptions]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFilterArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TFilters, js.UndefOr[TOptions]]]
  inline def parseFilterArgs[TFilters /* <: QueryFilters */, TOptions](arg1: QueryKey | TFilters, arg2: Unit, arg3: TOptions): js.Tuple2[TFilters, js.UndefOr[TOptions]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFilterArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TFilters, js.UndefOr[TOptions]]]
  inline def parseFilterArgs[TFilters /* <: QueryFilters */, TOptions](arg1: Unit, arg2: TFilters | TOptions): js.Tuple2[TFilters, js.UndefOr[TOptions]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFilterArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TFilters, js.UndefOr[TOptions]]]
  inline def parseFilterArgs[TFilters /* <: QueryFilters */, TOptions](arg1: Unit, arg2: TFilters | TOptions, arg3: TOptions): js.Tuple2[TFilters, js.UndefOr[TOptions]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFilterArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TFilters, js.UndefOr[TOptions]]]
  inline def parseFilterArgs[TFilters /* <: QueryFilters */, TOptions](arg1: Unit, arg2: Unit, arg3: TOptions): js.Tuple2[TFilters, js.UndefOr[TOptions]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFilterArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[TFilters, js.UndefOr[TOptions]]]
  
  inline def parseMutationArgs[TOptions /* <: MutationOptions[Any, Any, Any, Any] */](arg1: MutationKey | TOptions): TOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMutationArgs")(arg1.asInstanceOf[js.Any]).asInstanceOf[TOptions]
  inline def parseMutationArgs[TOptions /* <: MutationOptions[Any, Any, Any, Any] */](arg1: MutationKey | TOptions, arg2: TOptions): TOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMutationArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[TOptions]
  inline def parseMutationArgs[TOptions /* <: MutationOptions[Any, Any, Any, Any] */](arg1: MutationKey | TOptions, arg2: TOptions, arg3: TOptions): TOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMutationArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[TOptions]
  inline def parseMutationArgs[TOptions /* <: MutationOptions[Any, Any, Any, Any] */](arg1: MutationKey | TOptions, arg2: Unit, arg3: TOptions): TOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMutationArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[TOptions]
  inline def parseMutationArgs[TOptions /* <: MutationOptions[Any, Any, Any, Any] */](arg1: MutationKey | TOptions, arg2: MutationFunction[Any, Any]): TOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMutationArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[TOptions]
  inline def parseMutationArgs[TOptions /* <: MutationOptions[Any, Any, Any, Any] */](arg1: MutationKey | TOptions, arg2: MutationFunction[Any, Any], arg3: TOptions): TOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMutationArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[TOptions]
  inline def parseMutationArgs[TOptions /* <: MutationOptions[Any, Any, Any, Any] */](arg1: MutationFunction[Any, Any]): TOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMutationArgs")(arg1.asInstanceOf[js.Any]).asInstanceOf[TOptions]
  inline def parseMutationArgs[TOptions /* <: MutationOptions[Any, Any, Any, Any] */](arg1: MutationFunction[Any, Any], arg2: TOptions): TOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMutationArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[TOptions]
  inline def parseMutationArgs[TOptions /* <: MutationOptions[Any, Any, Any, Any] */](arg1: MutationFunction[Any, Any], arg2: TOptions, arg3: TOptions): TOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMutationArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[TOptions]
  inline def parseMutationArgs[TOptions /* <: MutationOptions[Any, Any, Any, Any] */](arg1: MutationFunction[Any, Any], arg2: Unit, arg3: TOptions): TOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMutationArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[TOptions]
  inline def parseMutationArgs[TOptions /* <: MutationOptions[Any, Any, Any, Any] */](arg1: MutationFunction[Any, Any], arg2: MutationFunction[Any, Any]): TOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMutationArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[TOptions]
  inline def parseMutationArgs[TOptions /* <: MutationOptions[Any, Any, Any, Any] */](arg1: MutationFunction[Any, Any], arg2: MutationFunction[Any, Any], arg3: TOptions): TOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMutationArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[TOptions]
  
  inline def parseMutationFilterArgs(): js.UndefOr[MutationFilters] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMutationFilterArgs")().asInstanceOf[js.UndefOr[MutationFilters]]
  inline def parseMutationFilterArgs(arg1: Unit, arg2: MutationFilters): js.UndefOr[MutationFilters] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMutationFilterArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[MutationFilters]]
  inline def parseMutationFilterArgs(arg1: QueryKey): js.UndefOr[MutationFilters] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMutationFilterArgs")(arg1.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[MutationFilters]]
  inline def parseMutationFilterArgs(arg1: QueryKey, arg2: MutationFilters): js.UndefOr[MutationFilters] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMutationFilterArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[MutationFilters]]
  inline def parseMutationFilterArgs(arg1: MutationFilters): js.UndefOr[MutationFilters] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMutationFilterArgs")(arg1.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[MutationFilters]]
  inline def parseMutationFilterArgs(arg1: MutationFilters, arg2: MutationFilters): js.UndefOr[MutationFilters] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMutationFilterArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[MutationFilters]]
  
  inline def parseQueryArgs[TOptions /* <: QueryOptions[Any, Any, Any, TQueryKey] */, TQueryKey /* <: QueryKey */](arg1: TOptions | TQueryKey): TOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseQueryArgs")(arg1.asInstanceOf[js.Any]).asInstanceOf[TOptions]
  inline def parseQueryArgs[TOptions /* <: QueryOptions[Any, Any, Any, TQueryKey] */, TQueryKey /* <: QueryKey */](arg1: TOptions | TQueryKey, arg2: TOptions): TOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("parseQueryArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[TOptions]
  inline def parseQueryArgs[TOptions /* <: QueryOptions[Any, Any, Any, TQueryKey] */, TQueryKey /* <: QueryKey */](arg1: TOptions | TQueryKey, arg2: TOptions, arg3: TOptions): TOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("parseQueryArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[TOptions]
  inline def parseQueryArgs[TOptions /* <: QueryOptions[Any, Any, Any, TQueryKey] */, TQueryKey /* <: QueryKey */](arg1: TOptions | TQueryKey, arg2: Unit, arg3: TOptions): TOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("parseQueryArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[TOptions]
  inline def parseQueryArgs[TOptions /* <: QueryOptions[Any, Any, Any, TQueryKey] */, TQueryKey /* <: QueryKey */](arg1: TOptions | TQueryKey, arg2: QueryFunction[Any, TQueryKey]): TOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("parseQueryArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any])).asInstanceOf[TOptions]
  inline def parseQueryArgs[TOptions /* <: QueryOptions[Any, Any, Any, TQueryKey] */, TQueryKey /* <: QueryKey */](arg1: TOptions | TQueryKey, arg2: QueryFunction[Any, TQueryKey], arg3: TOptions): TOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("parseQueryArgs")(arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[TOptions]
  
  inline def partialDeepEqual(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("partialDeepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def partialMatchKey(a: QueryKey, b: QueryKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("partialMatchKey")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def replaceAt[T](array: js.Array[T], index: Double, value: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceAt")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def replaceEqualDeep[T](a: Any, b: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceEqualDeep")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def scheduleMicrotask(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("scheduleMicrotask")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def shallowEqualObjects[T](a: T, b: T): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEqualObjects")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def sleep(timeout: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def stableValueHash(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stableValueHash")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def timeUntilStale(updatedAt: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timeUntilStale")(updatedAt.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def timeUntilStale(updatedAt: Double, staleTime: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("timeUntilStale")(updatedAt.asInstanceOf[js.Any], staleTime.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  type DataUpdateFunction[TInput, TOutput] = js.Function1[/* input */ TInput, TOutput]
  
  trait MutationFilters extends StObject {
    
    /**
      * Match mutation key exactly
      */
    var exact: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Include or exclude fetching mutations
      */
    var fetching: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Include mutations matching this mutation key
      */
    var mutationKey: js.UndefOr[MutationKey] = js.undefined
    
    /**
      * Include mutations matching this predicate function
      */
    var predicate: js.UndefOr[js.Function1[/* mutation */ Mutation[Any, Any, Any, Any], Boolean]] = js.undefined
  }
  object MutationFilters {
    
    inline def apply(): MutationFilters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MutationFilters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MutationFilters] (val x: Self) extends AnyVal {
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      inline def setFetching(value: Boolean): Self = StObject.set(x, "fetching", value.asInstanceOf[js.Any])
      
      inline def setFetchingUndefined: Self = StObject.set(x, "fetching", js.undefined)
      
      inline def setMutationKey(value: MutationKey): Self = StObject.set(x, "mutationKey", value.asInstanceOf[js.Any])
      
      inline def setMutationKeyUndefined: Self = StObject.set(x, "mutationKey", js.undefined)
      
      inline def setMutationKeyVarargs(value: Any*): Self = StObject.set(x, "mutationKey", js.Array(value*))
      
      inline def setPredicate(value: /* mutation */ Mutation[Any, Any, Any, Any] => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
      
      inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
    }
  }
  
  trait QueryFilters extends StObject {
    
    /**
      * Include or exclude active queries
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Match query key exactly
      */
    var exact: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Include or exclude fetching queries
      */
    var fetching: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Include or exclude inactive queries
      */
    var inactive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Include queries matching this predicate function
      */
    var predicate: js.UndefOr[js.Function1[/* query */ Query[Any, Any, Any, QueryKey], Boolean]] = js.undefined
    
    /**
      * Include queries matching this query key
      */
    var queryKey: js.UndefOr[QueryKey] = js.undefined
    
    /**
      * Include or exclude stale queries
      */
    var stale: js.UndefOr[Boolean] = js.undefined
  }
  object QueryFilters {
    
    inline def apply(): QueryFilters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryFilters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryFilters] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      inline def setFetching(value: Boolean): Self = StObject.set(x, "fetching", value.asInstanceOf[js.Any])
      
      inline def setFetchingUndefined: Self = StObject.set(x, "fetching", js.undefined)
      
      inline def setInactive(value: Boolean): Self = StObject.set(x, "inactive", value.asInstanceOf[js.Any])
      
      inline def setInactiveUndefined: Self = StObject.set(x, "inactive", js.undefined)
      
      inline def setPredicate(value: /* query */ Query[Any, Any, Any, QueryKey] => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
      
      inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
      
      inline def setQueryKey(value: QueryKey): Self = StObject.set(x, "queryKey", value.asInstanceOf[js.Any])
      
      inline def setQueryKeyUndefined: Self = StObject.set(x, "queryKey", js.undefined)
      
      inline def setQueryKeyVarargs(value: Any*): Self = StObject.set(x, "queryKey", js.Array(value*))
      
      inline def setStale(value: Boolean): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      inline def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactQuery.reactQueryStrings.all
    - typings.reactQuery.reactQueryStrings.active
    - typings.reactQuery.reactQueryStrings.inactive
    - typings.reactQuery.reactQueryStrings.none
  */
  trait QueryStatusFilter extends StObject
  object QueryStatusFilter {
    
    inline def active: typings.reactQuery.reactQueryStrings.active = "active".asInstanceOf[typings.reactQuery.reactQueryStrings.active]
    
    inline def all: typings.reactQuery.reactQueryStrings.all = "all".asInstanceOf[typings.reactQuery.reactQueryStrings.all]
    
    inline def inactive: typings.reactQuery.reactQueryStrings.inactive = "inactive".asInstanceOf[typings.reactQuery.reactQueryStrings.inactive]
    
    inline def none: typings.reactQuery.reactQueryStrings.none = "none".asInstanceOf[typings.reactQuery.reactQueryStrings.none]
  }
  
  type Updater[TInput, TOutput] = TOutput | (DataUpdateFunction[TInput, TOutput])
}
