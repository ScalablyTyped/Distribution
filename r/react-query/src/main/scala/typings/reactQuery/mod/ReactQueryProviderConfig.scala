package typings.reactQuery.mod

import typings.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactQueryProviderConfig extends BaseQueryOptions {
  @JSName("onError")
  var onError_ReactQueryProviderConfig: js.UndefOr[js.Function2[/* err */ js.Any, /* snapshotValue */ js.UndefOr[js.Any], Unit]] = js.undefined
  var onMutate: js.UndefOr[js.Function1[/* variables */ js.Any, js.Promise[_] | _]] = js.undefined
  var onSettled: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[js.Any], 
      /* error */ js.Any | Null, 
      /* snapshotValue */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  var onSuccess: js.UndefOr[js.Function2[/* data */ js.Any, /* variables */ js.UndefOr[js.Any], Unit]] = js.undefined
  var queryKeySerializerFn: js.UndefOr[
    js.Function1[
      /* queryKey */ js.UndefOr[
        js.Array[QueryKeyPart] | String | `false` | (js.Function0[js.UndefOr[js.Array[QueryKeyPart] | String | `false`]])
      ], 
      (js.Tuple2[String, js.Array[QueryKeyPart]]) | js.Array[js.Any]
    ]
  ] = js.undefined
  var refetchAllOnWindowFocus: js.UndefOr[Boolean] = js.undefined
  var throwOnError: js.UndefOr[Boolean] = js.undefined
  /** Defaults to the value of `suspense` if not defined otherwise */
  var useErrorBoundary: js.UndefOr[Boolean] = js.undefined
}

object ReactQueryProviderConfig {
  @scala.inline
  def apply(
    cacheTime: js.UndefOr[Double] = js.undefined,
    manual: js.UndefOr[Boolean] = js.undefined,
    onError: (/* err */ js.Any, /* snapshotValue */ js.UndefOr[js.Any]) => Unit = null,
    onMutate: /* variables */ js.Any => js.Promise[_] | _ = null,
    onSettled: (/* data */ js.UndefOr[js.Any], /* error */ js.Any | Null, /* snapshotValue */ js.UndefOr[js.Any]) => Unit = null,
    onSuccess: (/* data */ js.Any, /* variables */ js.UndefOr[js.Any]) => Unit = null,
    queryKeySerializerFn: /* queryKey */ js.UndefOr[
      js.Array[QueryKeyPart] | String | `false` | (js.Function0[js.UndefOr[js.Array[QueryKeyPart] | String | `false`]])
    ] => (js.Tuple2[String, js.Array[QueryKeyPart]]) | js.Array[js.Any] = null,
    refetchAllOnWindowFocus: js.UndefOr[Boolean] = js.undefined,
    refetchInterval: `false` | Double = null,
    refetchIntervalInBackground: js.UndefOr[Boolean] = js.undefined,
    refetchOnMount: js.UndefOr[Boolean] = js.undefined,
    refetchOnWindowFocus: js.UndefOr[Boolean] = js.undefined,
    retry: Boolean | Double = null,
    retryDelay: /* retryAttempt */ Double => Double = null,
    staleTime: js.UndefOr[Double] = js.undefined,
    suspense: js.UndefOr[Boolean] = js.undefined,
    throwOnError: js.UndefOr[Boolean] = js.undefined,
    useErrorBoundary: js.UndefOr[Boolean] = js.undefined
  ): ReactQueryProviderConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheTime)) __obj.updateDynamic("cacheTime")(cacheTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(manual)) __obj.updateDynamic("manual")(manual.get.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction2(onError))
    if (onMutate != null) __obj.updateDynamic("onMutate")(js.Any.fromFunction1(onMutate))
    if (onSettled != null) __obj.updateDynamic("onSettled")(js.Any.fromFunction3(onSettled))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction2(onSuccess))
    if (queryKeySerializerFn != null) __obj.updateDynamic("queryKeySerializerFn")(js.Any.fromFunction1(queryKeySerializerFn))
    if (!js.isUndefined(refetchAllOnWindowFocus)) __obj.updateDynamic("refetchAllOnWindowFocus")(refetchAllOnWindowFocus.get.asInstanceOf[js.Any])
    if (refetchInterval != null) __obj.updateDynamic("refetchInterval")(refetchInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(refetchIntervalInBackground)) __obj.updateDynamic("refetchIntervalInBackground")(refetchIntervalInBackground.get.asInstanceOf[js.Any])
    if (!js.isUndefined(refetchOnMount)) __obj.updateDynamic("refetchOnMount")(refetchOnMount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(refetchOnWindowFocus)) __obj.updateDynamic("refetchOnWindowFocus")(refetchOnWindowFocus.get.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (retryDelay != null) __obj.updateDynamic("retryDelay")(js.Any.fromFunction1(retryDelay))
    if (!js.isUndefined(staleTime)) __obj.updateDynamic("staleTime")(staleTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suspense)) __obj.updateDynamic("suspense")(suspense.get.asInstanceOf[js.Any])
    if (!js.isUndefined(throwOnError)) __obj.updateDynamic("throwOnError")(throwOnError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useErrorBoundary)) __obj.updateDynamic("useErrorBoundary")(useErrorBoundary.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactQueryProviderConfig]
  }
}

