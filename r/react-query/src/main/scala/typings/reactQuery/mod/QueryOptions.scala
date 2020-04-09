package typings.reactQuery.mod

import typings.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions[TResult] extends BaseQueryOptions {
  var initialData: js.UndefOr[TResult | js.Function0[js.UndefOr[TResult]]] = js.undefined
  var onSettled: js.UndefOr[js.Function2[/* data */ js.UndefOr[TResult], /* error */ js.Any | Null, Unit]] = js.undefined
  var onSuccess: js.UndefOr[js.Function1[/* data */ TResult, Unit]] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply[TResult](
    cacheTime: Int | Double = null,
    initialData: TResult | js.Function0[js.UndefOr[TResult]] = null,
    manual: js.UndefOr[Boolean] = js.undefined,
    onError: /* err */ js.Any => Unit = null,
    onSettled: (/* data */ js.UndefOr[TResult], /* error */ js.Any | Null) => Unit = null,
    onSuccess: /* data */ TResult => Unit = null,
    refetchInterval: `false` | Double = null,
    refetchIntervalInBackground: js.UndefOr[Boolean] = js.undefined,
    refetchOnMount: js.UndefOr[Boolean] = js.undefined,
    refetchOnWindowFocus: js.UndefOr[Boolean] = js.undefined,
    retry: Boolean | Double = null,
    retryDelay: /* retryAttempt */ Double => Double = null,
    staleTime: Int | Double = null,
    suspense: js.UndefOr[Boolean] = js.undefined
  ): QueryOptions[TResult] = {
    val __obj = js.Dynamic.literal()
    if (cacheTime != null) __obj.updateDynamic("cacheTime")(cacheTime.asInstanceOf[js.Any])
    if (initialData != null) __obj.updateDynamic("initialData")(initialData.asInstanceOf[js.Any])
    if (!js.isUndefined(manual)) __obj.updateDynamic("manual")(manual.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onSettled != null) __obj.updateDynamic("onSettled")(js.Any.fromFunction2(onSettled))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1(onSuccess))
    if (refetchInterval != null) __obj.updateDynamic("refetchInterval")(refetchInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(refetchIntervalInBackground)) __obj.updateDynamic("refetchIntervalInBackground")(refetchIntervalInBackground.asInstanceOf[js.Any])
    if (!js.isUndefined(refetchOnMount)) __obj.updateDynamic("refetchOnMount")(refetchOnMount.asInstanceOf[js.Any])
    if (!js.isUndefined(refetchOnWindowFocus)) __obj.updateDynamic("refetchOnWindowFocus")(refetchOnWindowFocus.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (retryDelay != null) __obj.updateDynamic("retryDelay")(js.Any.fromFunction1(retryDelay))
    if (staleTime != null) __obj.updateDynamic("staleTime")(staleTime.asInstanceOf[js.Any])
    if (!js.isUndefined(suspense)) __obj.updateDynamic("suspense")(suspense.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptions[TResult]]
  }
}

