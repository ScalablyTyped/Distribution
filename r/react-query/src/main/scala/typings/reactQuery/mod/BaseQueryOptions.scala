package typings.reactQuery.mod

import typings.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseQueryOptions extends js.Object {
  var cacheTime: js.UndefOr[Double] = js.undefined
  /**
    * Set this to `true` to disable automatic refetching when the query mounts or changes query keys.
    * To refetch the query, use the `refetch` method returned from the `useQuery` instance.
    */
  var manual: js.UndefOr[Boolean] = js.undefined
  var onError: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.undefined
  var refetchInterval: js.UndefOr[`false` | Double] = js.undefined
  var refetchIntervalInBackground: js.UndefOr[Boolean] = js.undefined
  var refetchOnMount: js.UndefOr[Boolean] = js.undefined
  var refetchOnWindowFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * If `false`, failed queries will not retry by default.
    * If `true`, failed queries will retry infinitely.
    * If set to an integer number, e.g. 3, failed queries will retry until the failed query count meets that number.
    */
  var retry: js.UndefOr[Boolean | Double] = js.undefined
  var retryDelay: js.UndefOr[js.Function1[/* retryAttempt */ Double, Double]] = js.undefined
  var staleTime: js.UndefOr[Double] = js.undefined
  var suspense: js.UndefOr[Boolean] = js.undefined
}

object BaseQueryOptions {
  @scala.inline
  def apply(
    cacheTime: Int | Double = null,
    manual: js.UndefOr[Boolean] = js.undefined,
    onError: /* err */ js.Any => Unit = null,
    refetchInterval: `false` | Double = null,
    refetchIntervalInBackground: js.UndefOr[Boolean] = js.undefined,
    refetchOnMount: js.UndefOr[Boolean] = js.undefined,
    refetchOnWindowFocus: js.UndefOr[Boolean] = js.undefined,
    retry: Boolean | Double = null,
    retryDelay: /* retryAttempt */ Double => Double = null,
    staleTime: Int | Double = null,
    suspense: js.UndefOr[Boolean] = js.undefined
  ): BaseQueryOptions = {
    val __obj = js.Dynamic.literal()
    if (cacheTime != null) __obj.updateDynamic("cacheTime")(cacheTime.asInstanceOf[js.Any])
    if (!js.isUndefined(manual)) __obj.updateDynamic("manual")(manual.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (refetchInterval != null) __obj.updateDynamic("refetchInterval")(refetchInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(refetchIntervalInBackground)) __obj.updateDynamic("refetchIntervalInBackground")(refetchIntervalInBackground.asInstanceOf[js.Any])
    if (!js.isUndefined(refetchOnMount)) __obj.updateDynamic("refetchOnMount")(refetchOnMount.asInstanceOf[js.Any])
    if (!js.isUndefined(refetchOnWindowFocus)) __obj.updateDynamic("refetchOnWindowFocus")(refetchOnWindowFocus.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (retryDelay != null) __obj.updateDynamic("retryDelay")(js.Any.fromFunction1(retryDelay))
    if (staleTime != null) __obj.updateDynamic("staleTime")(staleTime.asInstanceOf[js.Any])
    if (!js.isUndefined(suspense)) __obj.updateDynamic("suspense")(suspense.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseQueryOptions]
  }
}

