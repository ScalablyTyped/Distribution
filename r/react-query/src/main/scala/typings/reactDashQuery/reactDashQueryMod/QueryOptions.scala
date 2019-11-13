package typings.reactDashQuery.reactDashQueryMod

import typings.reactDashQuery.reactDashQueryNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryOptions[TResult] extends js.Object {
  var cacheTime: js.UndefOr[Double] = js.undefined
  var getCanFetchMore: js.UndefOr[js.Function2[/* lastPage */ Double, /* allPages */ Double, Boolean]] = js.undefined
  var manual: js.UndefOr[Boolean] = js.undefined
  var onError: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.undefined
  var onSucess: js.UndefOr[js.Function1[/* data */ TResult, Unit]] = js.undefined
  var paginated: js.UndefOr[Boolean] = js.undefined
  var refetchInterval: js.UndefOr[`false` | Double] = js.undefined
  var retry: js.UndefOr[Boolean | Double] = js.undefined
  var retryDelay: js.UndefOr[js.Function1[/* retryAttempt */ Double, Double]] = js.undefined
  var staleTime: js.UndefOr[Double] = js.undefined
  var suspense: js.UndefOr[Boolean] = js.undefined
}

object QueryOptions {
  @scala.inline
  def apply[TResult](
    cacheTime: Int | Double = null,
    getCanFetchMore: (/* lastPage */ Double, /* allPages */ Double) => Boolean = null,
    manual: js.UndefOr[Boolean] = js.undefined,
    onError: /* err */ js.Any => Unit = null,
    onSucess: /* data */ TResult => Unit = null,
    paginated: js.UndefOr[Boolean] = js.undefined,
    refetchInterval: `false` | Double = null,
    retry: Boolean | Double = null,
    retryDelay: /* retryAttempt */ Double => Double = null,
    staleTime: Int | Double = null,
    suspense: js.UndefOr[Boolean] = js.undefined
  ): QueryOptions[TResult] = {
    val __obj = js.Dynamic.literal()
    if (cacheTime != null) __obj.updateDynamic("cacheTime")(cacheTime.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[QueryOptions[TResult]]
  }
}

