package typings.reactDashQuery.reactDashQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactQueryProviderConfig extends js.Object {
  var cacheTime: Double
  var refetchAllOnWindowFocus: Boolean
  var refetchInterval: Boolean
  var retry: Double
  var staleTime: Double
  var suspense: Boolean
  def retryDelay(attempt: Double): Double
}

object ReactQueryProviderConfig {
  @scala.inline
  def apply(
    cacheTime: Double,
    refetchAllOnWindowFocus: Boolean,
    refetchInterval: Boolean,
    retry: Double,
    retryDelay: Double => Double,
    staleTime: Double,
    suspense: Boolean
  ): ReactQueryProviderConfig = {
    val __obj = js.Dynamic.literal(cacheTime = cacheTime, refetchAllOnWindowFocus = refetchAllOnWindowFocus, refetchInterval = refetchInterval, retry = retry, retryDelay = js.Any.fromFunction1(retryDelay), staleTime = staleTime, suspense = suspense)
  
    __obj.asInstanceOf[ReactQueryProviderConfig]
  }
}

