package typings.reactDashQuery.reactDashQueryMod

import typings.reactDashQuery.reactDashQueryNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrefetchQueryOptions[TResult] extends QueryOptions[TResult] {
  var force: js.UndefOr[Boolean] = js.undefined
}

object PrefetchQueryOptions {
  @scala.inline
  def apply[TResult](
    cacheTime: Int | Double = null,
    force: js.UndefOr[Boolean] = js.undefined,
    getCanFetchMore: (/* lastPage */ Double, /* allPages */ Double) => Boolean = null,
    manual: js.UndefOr[Boolean] = js.undefined,
    onError: /* err */ js.Any => Unit = null,
    onSucess: TResult => Unit = null,
    paginated: js.UndefOr[Boolean] = js.undefined,
    refetchInterval: `false` | Double = null,
    retry: Boolean | Double = null,
    retryDelay: /* retryAttempt */ Double => Double = null,
    staleTime: Int | Double = null,
    suspense: js.UndefOr[Boolean] = js.undefined
  ): PrefetchQueryOptions[TResult] = {
    val __obj = js.Dynamic.literal()
    if (cacheTime != null) __obj.updateDynamic("cacheTime")(cacheTime.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (getCanFetchMore != null) __obj.updateDynamic("getCanFetchMore")(js.Any.fromFunction2(getCanFetchMore))
    if (!js.isUndefined(manual)) __obj.updateDynamic("manual")(manual)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onSucess != null) __obj.updateDynamic("onSucess")(js.Any.fromFunction1(onSucess))
    if (!js.isUndefined(paginated)) __obj.updateDynamic("paginated")(paginated)
    if (refetchInterval != null) __obj.updateDynamic("refetchInterval")(refetchInterval.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (retryDelay != null) __obj.updateDynamic("retryDelay")(js.Any.fromFunction1(retryDelay))
    if (staleTime != null) __obj.updateDynamic("staleTime")(staleTime.asInstanceOf[js.Any])
    if (!js.isUndefined(suspense)) __obj.updateDynamic("suspense")(suspense)
    __obj.asInstanceOf[PrefetchQueryOptions[TResult]]
  }
}

