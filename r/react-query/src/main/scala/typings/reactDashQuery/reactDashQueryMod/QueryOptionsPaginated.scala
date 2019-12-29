package typings.reactDashQuery.reactDashQueryMod

import typings.reactDashQuery.reactDashQueryBooleans.`false`
import typings.reactDashQuery.reactDashQueryBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptionsPaginated[TResult] extends QueryOptions[TResult] {
  var paginated: `true`
  def getCanFetchMore(lastPage: TResult, allPages: js.Array[TResult]): Boolean
}

object QueryOptionsPaginated {
  @scala.inline
  def apply[TResult](
    getCanFetchMore: (TResult, js.Array[TResult]) => Boolean,
    paginated: `true`,
    cacheTime: Int | Double = null,
    initialData: TResult = null,
    manual: js.UndefOr[Boolean] = js.undefined,
    onError: /* err */ js.Any => Unit = null,
    onSuccess: TResult => Unit = null,
    refetchInterval: `false` | Double = null,
    refetchIntervalInBackground: js.UndefOr[Boolean] = js.undefined,
    refetchOnWindowFocus: js.UndefOr[Boolean] = js.undefined,
    retry: Boolean | Double = null,
    retryDelay: /* retryAttempt */ Double => Double = null,
    staleTime: Int | Double = null,
    suspense: js.UndefOr[Boolean] = js.undefined
  ): QueryOptionsPaginated[TResult] = {
    val __obj = js.Dynamic.literal(getCanFetchMore = js.Any.fromFunction2(getCanFetchMore), paginated = paginated.asInstanceOf[js.Any])
    if (cacheTime != null) __obj.updateDynamic("cacheTime")(cacheTime.asInstanceOf[js.Any])
    if (initialData != null) __obj.updateDynamic("initialData")(initialData.asInstanceOf[js.Any])
    if (!js.isUndefined(manual)) __obj.updateDynamic("manual")(manual.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1(onSuccess))
    if (refetchInterval != null) __obj.updateDynamic("refetchInterval")(refetchInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(refetchIntervalInBackground)) __obj.updateDynamic("refetchIntervalInBackground")(refetchIntervalInBackground.asInstanceOf[js.Any])
    if (!js.isUndefined(refetchOnWindowFocus)) __obj.updateDynamic("refetchOnWindowFocus")(refetchOnWindowFocus.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (retryDelay != null) __obj.updateDynamic("retryDelay")(js.Any.fromFunction1(retryDelay))
    if (staleTime != null) __obj.updateDynamic("staleTime")(staleTime.asInstanceOf[js.Any])
    if (!js.isUndefined(suspense)) __obj.updateDynamic("suspense")(suspense.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryOptionsPaginated[TResult]]
  }
}

