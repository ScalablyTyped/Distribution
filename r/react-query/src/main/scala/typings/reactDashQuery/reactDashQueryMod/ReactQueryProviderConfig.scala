package typings.reactDashQuery.reactDashQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactQueryProviderConfig extends js.Object {
  var cacheTime: js.UndefOr[Double] = js.undefined
  var refetchAllOnWindowFocus: js.UndefOr[Boolean] = js.undefined
  var refetchInterval: js.UndefOr[Boolean] = js.undefined
  var retry: js.UndefOr[Double] = js.undefined
  var retryDelay: js.UndefOr[js.Function1[/* attempt */ Double, Double]] = js.undefined
  var staleTime: js.UndefOr[Double] = js.undefined
  var suspense: js.UndefOr[Boolean] = js.undefined
}

object ReactQueryProviderConfig {
  @scala.inline
  def apply(
    cacheTime: Int | Double = null,
    refetchAllOnWindowFocus: js.UndefOr[Boolean] = js.undefined,
    refetchInterval: js.UndefOr[Boolean] = js.undefined,
    retry: Int | Double = null,
    retryDelay: /* attempt */ Double => Double = null,
    staleTime: Int | Double = null,
    suspense: js.UndefOr[Boolean] = js.undefined
  ): ReactQueryProviderConfig = {
    val __obj = js.Dynamic.literal()
    if (cacheTime != null) __obj.updateDynamic("cacheTime")(cacheTime.asInstanceOf[js.Any])
    if (!js.isUndefined(refetchAllOnWindowFocus)) __obj.updateDynamic("refetchAllOnWindowFocus")(refetchAllOnWindowFocus)
    if (!js.isUndefined(refetchInterval)) __obj.updateDynamic("refetchInterval")(refetchInterval)
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (retryDelay != null) __obj.updateDynamic("retryDelay")(js.Any.fromFunction1(retryDelay))
    if (staleTime != null) __obj.updateDynamic("staleTime")(staleTime.asInstanceOf[js.Any])
    if (!js.isUndefined(suspense)) __obj.updateDynamic("suspense")(suspense)
    __obj.asInstanceOf[ReactQueryProviderConfig]
  }
}

