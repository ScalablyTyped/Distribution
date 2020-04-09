package typings.reactQuery.mod

import typings.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteQueryOptions[TResult, TMoreVariable]
  extends QueryOptions[js.Array[TResult]] {
  def getFetchMore(lastPage: TResult, allPages: js.Array[TResult]): TMoreVariable | `false`
}

object InfiniteQueryOptions {
  @scala.inline
  def apply[TResult, TMoreVariable](
    getFetchMore: (TResult, js.Array[TResult]) => TMoreVariable | `false`,
    cacheTime: Int | Double = null,
    initialData: js.Array[TResult] | js.Function0[js.UndefOr[js.Array[TResult]]] = null,
    manual: js.UndefOr[Boolean] = js.undefined,
    onError: /* err */ js.Any => Unit = null,
    onSettled: (/* data */ js.UndefOr[js.Array[TResult]], /* error */ js.Any | Null) => Unit = null,
    onSuccess: js.Array[TResult] => Unit = null,
    refetchInterval: `false` | Double = null,
    refetchIntervalInBackground: js.UndefOr[Boolean] = js.undefined,
    refetchOnMount: js.UndefOr[Boolean] = js.undefined,
    refetchOnWindowFocus: js.UndefOr[Boolean] = js.undefined,
    retry: Boolean | Double = null,
    retryDelay: /* retryAttempt */ Double => Double = null,
    staleTime: Int | Double = null,
    suspense: js.UndefOr[Boolean] = js.undefined
  ): InfiniteQueryOptions[TResult, TMoreVariable] = {
    val __obj = js.Dynamic.literal(getFetchMore = js.Any.fromFunction2(getFetchMore))
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
    __obj.asInstanceOf[InfiniteQueryOptions[TResult, TMoreVariable]]
  }
}

