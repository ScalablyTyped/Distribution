package typings.reactQuery.typesCoreTypesMod

import typings.reactQuery.reactQueryBooleans.`false`
import typings.reactQuery.reactQueryStrings.always
import typings.reactQuery.reactQueryStrings.tracked
import typings.reactQuery.typesCoreQueryMod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey /* <: QueryKey */]
  extends StObject
     with QueryOptions[TQueryFnData, TError, TQueryData, TQueryKey] {
  
  /**
    * Set this to `false` to disable automatic refetching when the query mounts or changes query keys.
    * To refetch the query, use the `refetch` method returned from the `useQuery` instance.
    * Defaults to `true`.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set this to `true` to keep the previous `data` when fetching based on a new query key.
    * Defaults to `false`.
    */
  var keepPreviousData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set, the component will only re-render if any of the listed properties change.
    * When set to `['data', 'error']`, the component will only re-render when the `data` or `error` properties change.
    * When set to `tracked`, access to properties will be tracked, and the component will only re-render when one of the tracked properties change.
    */
  var notifyOnChangeProps: js.UndefOr[
    (js.Array[
      /* keyof react-query.react-query/types/core/types.InfiniteQueryObserverResult<unknown, unknown> */ String
    ]) | tracked
  ] = js.undefined
  
  /**
    * If set, the component will not re-render if any of the listed properties change.
    */
  var notifyOnChangePropsExclusions: js.UndefOr[
    js.Array[
      /* keyof react-query.react-query/types/core/types.InfiniteQueryObserverResult<unknown, unknown> */ String
    ]
  ] = js.undefined
  
  /**
    * This callback will fire if the query encounters an error and will be passed the error.
    */
  var onError: js.UndefOr[js.Function1[/* err */ TError, Unit]] = js.undefined
  
  /**
    * This callback will fire any time the query is either successfully fetched or errors and be passed either the data or error.
    */
  var onSettled: js.UndefOr[js.Function2[/* data */ js.UndefOr[TData], /* error */ TError | Null, Unit]] = js.undefined
  
  /**
    * This callback will fire any time the query successfully fetches new data or the cache is updated via `setQueryData`.
    */
  var onSuccess: js.UndefOr[js.Function1[/* data */ TData, Unit]] = js.undefined
  
  /**
    * If set, the observer will optimistically set the result in fetching state before the query has actually started fetching.
    * This is to make sure the results are not lagging behind.
    * Defaults to `true`.
    */
  var optimisticResults: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set, this value will be used as the placeholder data for this particular query observer while the query is still in the `loading` data and no initialData has been provided.
    */
  var placeholderData: js.UndefOr[TQueryData | PlaceholderDataFunction[TQueryData]] = js.undefined
  
  /**
    * If set to a number, the query will continuously refetch at this frequency in milliseconds.
    * If set to a function, the function will be executed with the latest data and query to compute a frequency
    * Defaults to `false`.
    */
  var refetchInterval: js.UndefOr[
    Double | `false` | (js.Function2[
      /* data */ js.UndefOr[TData], 
      /* query */ Query[TQueryFnData, TError, TQueryData, TQueryKey], 
      Double | `false`
    ])
  ] = js.undefined
  
  /**
    * If set to `true`, the query will continue to refetch while their tab/window is in the background.
    * Defaults to `false`.
    */
  var refetchIntervalInBackground: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to `true`, the query will refetch on mount if the data is stale.
    * If set to `false`, will disable additional instances of a query to trigger background refetches.
    * If set to `'always'`, the query will always refetch on mount.
    * If set to a function, the function will be executed with the latest data and query to compute the value
    * Defaults to `true`.
    */
  var refetchOnMount: js.UndefOr[
    Boolean | always | (js.Function1[/* query */ Query[TQueryFnData, TError, TQueryData, TQueryKey], Boolean | always])
  ] = js.undefined
  
  /**
    * If set to `true`, the query will refetch on reconnect if the data is stale.
    * If set to `false`, the query will not refetch on reconnect.
    * If set to `'always'`, the query will always refetch on reconnect.
    * If set to a function, the function will be executed with the latest data and query to compute the value.
    * Defaults to `true`.
    */
  var refetchOnReconnect: js.UndefOr[
    Boolean | always | (js.Function1[/* query */ Query[TQueryFnData, TError, TQueryData, TQueryKey], Boolean | always])
  ] = js.undefined
  
  /**
    * If set to `true`, the query will refetch on window focus if the data is stale.
    * If set to `false`, the query will not refetch on window focus.
    * If set to `'always'`, the query will always refetch on window focus.
    * If set to a function, the function will be executed with the latest data and query to compute the value.
    * Defaults to `true`.
    */
  var refetchOnWindowFocus: js.UndefOr[
    Boolean | always | (js.Function1[/* query */ Query[TQueryFnData, TError, TQueryData, TQueryKey], Boolean | always])
  ] = js.undefined
  
  /**
    * If set to `false`, the query will not be retried on mount if it contains an error.
    * Defaults to `true`.
    */
  var retryOnMount: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This option can be used to transform or select a part of the data returned by the query function.
    */
  var select: js.UndefOr[js.Function1[/* data */ TQueryData, TData]] = js.undefined
  
  /**
    * The time in milliseconds after data is considered stale.
    * If set to `Infinity`, the data will never be considered stale.
    */
  var staleTime: js.UndefOr[Double] = js.undefined
  
  /**
    * If set to `true`, the query will suspend when `status === 'loading'`
    * and throw errors when `status === 'error'`.
    * Defaults to `false`.
    */
  var suspense: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether errors should be thrown instead of setting the `error` property.
    * If set to `true` or `suspense` is `true`, all errors will be thrown to the error boundary.
    * If set to `false` and `suspense` is `false`, errors are returned as state.
    * If set to a function, it will be passed the error and the query, and it should return a boolean indicating whether to show the error in an error boundary (`true`) or return the error as state (`false`).
    * Defaults to `false`.
    */
  var useErrorBoundary: js.UndefOr[
    Boolean | (js.Function2[
      /* error */ TError, 
      /* query */ Query[TQueryFnData, TError, TQueryData, TQueryKey], 
      Boolean
    ])
  ] = js.undefined
}
object QueryObserverOptions {
  
  inline def apply[TQueryFnData, TError, TData, TQueryData, TQueryKey /* <: QueryKey */](): QueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey]]
  }
  
  extension [Self <: QueryObserverOptions[?, ?, ?, ?, ?], TQueryFnData, TError, TData, TQueryData, TQueryKey /* <: QueryKey */](x: Self & (QueryObserverOptions[TQueryFnData, TError, TData, TQueryData, TQueryKey])) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setKeepPreviousData(value: Boolean): Self = StObject.set(x, "keepPreviousData", value.asInstanceOf[js.Any])
    
    inline def setKeepPreviousDataUndefined: Self = StObject.set(x, "keepPreviousData", js.undefined)
    
    inline def setNotifyOnChangeProps(
      value: (js.Array[
          /* keyof react-query.react-query/types/core/types.InfiniteQueryObserverResult<unknown, unknown> */ String
        ]) | tracked
    ): Self = StObject.set(x, "notifyOnChangeProps", value.asInstanceOf[js.Any])
    
    inline def setNotifyOnChangePropsExclusions(
      value: js.Array[
          /* keyof react-query.react-query/types/core/types.InfiniteQueryObserverResult<unknown, unknown> */ String
        ]
    ): Self = StObject.set(x, "notifyOnChangePropsExclusions", value.asInstanceOf[js.Any])
    
    inline def setNotifyOnChangePropsExclusionsUndefined: Self = StObject.set(x, "notifyOnChangePropsExclusions", js.undefined)
    
    inline def setNotifyOnChangePropsExclusionsVarargs(
      value: (/* keyof react-query.react-query/types/core/types.InfiniteQueryObserverResult<unknown, unknown> */ String)*
    ): Self = StObject.set(x, "notifyOnChangePropsExclusions", js.Array(value*))
    
    inline def setNotifyOnChangePropsUndefined: Self = StObject.set(x, "notifyOnChangeProps", js.undefined)
    
    inline def setNotifyOnChangePropsVarargs(
      value: (/* keyof react-query.react-query/types/core/types.InfiniteQueryObserverResult<unknown, unknown> */ String)*
    ): Self = StObject.set(x, "notifyOnChangeProps", js.Array(value*))
    
    inline def setOnError(value: /* err */ TError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnSettled(value: (/* data */ js.UndefOr[TData], /* error */ TError | Null) => Unit): Self = StObject.set(x, "onSettled", js.Any.fromFunction2(value))
    
    inline def setOnSettledUndefined: Self = StObject.set(x, "onSettled", js.undefined)
    
    inline def setOnSuccess(value: /* data */ TData => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    
    inline def setOptimisticResults(value: Boolean): Self = StObject.set(x, "optimisticResults", value.asInstanceOf[js.Any])
    
    inline def setOptimisticResultsUndefined: Self = StObject.set(x, "optimisticResults", js.undefined)
    
    inline def setPlaceholderData(value: TQueryData | PlaceholderDataFunction[TQueryData]): Self = StObject.set(x, "placeholderData", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderDataFunction0(value: () => js.UndefOr[TQueryData]): Self = StObject.set(x, "placeholderData", js.Any.fromFunction0(value))
    
    inline def setPlaceholderDataUndefined: Self = StObject.set(x, "placeholderData", js.undefined)
    
    inline def setRefetchInterval(
      value: Double | `false` | (js.Function2[
          /* data */ js.UndefOr[TData], 
          /* query */ Query[TQueryFnData, TError, TQueryData, TQueryKey], 
          Double | `false`
        ])
    ): Self = StObject.set(x, "refetchInterval", value.asInstanceOf[js.Any])
    
    inline def setRefetchIntervalFunction2(
      value: (/* data */ js.UndefOr[TData], /* query */ Query[TQueryFnData, TError, TQueryData, TQueryKey]) => Double | `false`
    ): Self = StObject.set(x, "refetchInterval", js.Any.fromFunction2(value))
    
    inline def setRefetchIntervalInBackground(value: Boolean): Self = StObject.set(x, "refetchIntervalInBackground", value.asInstanceOf[js.Any])
    
    inline def setRefetchIntervalInBackgroundUndefined: Self = StObject.set(x, "refetchIntervalInBackground", js.undefined)
    
    inline def setRefetchIntervalUndefined: Self = StObject.set(x, "refetchInterval", js.undefined)
    
    inline def setRefetchOnMount(
      value: Boolean | always | (js.Function1[/* query */ Query[TQueryFnData, TError, TQueryData, TQueryKey], Boolean | always])
    ): Self = StObject.set(x, "refetchOnMount", value.asInstanceOf[js.Any])
    
    inline def setRefetchOnMountFunction1(value: /* query */ Query[TQueryFnData, TError, TQueryData, TQueryKey] => Boolean | always): Self = StObject.set(x, "refetchOnMount", js.Any.fromFunction1(value))
    
    inline def setRefetchOnMountUndefined: Self = StObject.set(x, "refetchOnMount", js.undefined)
    
    inline def setRefetchOnReconnect(
      value: Boolean | always | (js.Function1[/* query */ Query[TQueryFnData, TError, TQueryData, TQueryKey], Boolean | always])
    ): Self = StObject.set(x, "refetchOnReconnect", value.asInstanceOf[js.Any])
    
    inline def setRefetchOnReconnectFunction1(value: /* query */ Query[TQueryFnData, TError, TQueryData, TQueryKey] => Boolean | always): Self = StObject.set(x, "refetchOnReconnect", js.Any.fromFunction1(value))
    
    inline def setRefetchOnReconnectUndefined: Self = StObject.set(x, "refetchOnReconnect", js.undefined)
    
    inline def setRefetchOnWindowFocus(
      value: Boolean | always | (js.Function1[/* query */ Query[TQueryFnData, TError, TQueryData, TQueryKey], Boolean | always])
    ): Self = StObject.set(x, "refetchOnWindowFocus", value.asInstanceOf[js.Any])
    
    inline def setRefetchOnWindowFocusFunction1(value: /* query */ Query[TQueryFnData, TError, TQueryData, TQueryKey] => Boolean | always): Self = StObject.set(x, "refetchOnWindowFocus", js.Any.fromFunction1(value))
    
    inline def setRefetchOnWindowFocusUndefined: Self = StObject.set(x, "refetchOnWindowFocus", js.undefined)
    
    inline def setRetryOnMount(value: Boolean): Self = StObject.set(x, "retryOnMount", value.asInstanceOf[js.Any])
    
    inline def setRetryOnMountUndefined: Self = StObject.set(x, "retryOnMount", js.undefined)
    
    inline def setSelect(value: /* data */ TQueryData => TData): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setStaleTime(value: Double): Self = StObject.set(x, "staleTime", value.asInstanceOf[js.Any])
    
    inline def setStaleTimeUndefined: Self = StObject.set(x, "staleTime", js.undefined)
    
    inline def setSuspense(value: Boolean): Self = StObject.set(x, "suspense", value.asInstanceOf[js.Any])
    
    inline def setSuspenseUndefined: Self = StObject.set(x, "suspense", js.undefined)
    
    inline def setUseErrorBoundary(
      value: Boolean | (js.Function2[
          /* error */ TError, 
          /* query */ Query[TQueryFnData, TError, TQueryData, TQueryKey], 
          Boolean
        ])
    ): Self = StObject.set(x, "useErrorBoundary", value.asInstanceOf[js.Any])
    
    inline def setUseErrorBoundaryFunction2(
      value: (/* error */ TError, /* query */ Query[TQueryFnData, TError, TQueryData, TQueryKey]) => Boolean
    ): Self = StObject.set(x, "useErrorBoundary", js.Any.fromFunction2(value))
    
    inline def setUseErrorBoundaryUndefined: Self = StObject.set(x, "useErrorBoundary", js.undefined)
  }
}
