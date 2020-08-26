package typings.reactQuery.mod

import typings.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseQueryOptions extends js.Object {
  var cacheTime: js.UndefOr[Double] = js.native
  /**
    * Set this to `true` to disable automatic refetching when the query mounts or changes query keys.
    * To refetch the query, use the `refetch` method returned from the `useQuery` instance.
    */
  var manual: js.UndefOr[Boolean] = js.native
  var onError: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.native
  var refetchInterval: js.UndefOr[`false` | Double] = js.native
  var refetchIntervalInBackground: js.UndefOr[Boolean] = js.native
  var refetchOnMount: js.UndefOr[Boolean] = js.native
  var refetchOnWindowFocus: js.UndefOr[Boolean] = js.native
  /**
    * If `false`, failed queries will not retry by default.
    * If `true`, failed queries will retry infinitely.
    * If set to an integer number, e.g. 3, failed queries will retry until the failed query count meets that number.
    */
  var retry: js.UndefOr[Boolean | Double] = js.native
  var retryDelay: js.UndefOr[js.Function1[/* retryAttempt */ Double, Double]] = js.native
  var staleTime: js.UndefOr[Double] = js.native
  var suspense: js.UndefOr[Boolean] = js.native
}

object BaseQueryOptions {
  @scala.inline
  def apply(): BaseQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseQueryOptions]
  }
  @scala.inline
  implicit class BaseQueryOptionsOps[Self <: BaseQueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCacheTime(value: Double): Self = this.set("cacheTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheTime: Self = this.set("cacheTime", js.undefined)
    @scala.inline
    def setManual(value: Boolean): Self = this.set("manual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManual: Self = this.set("manual", js.undefined)
    @scala.inline
    def setOnError(value: /* err */ js.Any => Unit): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setRefetchInterval(value: `false` | Double): Self = this.set("refetchInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefetchInterval: Self = this.set("refetchInterval", js.undefined)
    @scala.inline
    def setRefetchIntervalInBackground(value: Boolean): Self = this.set("refetchIntervalInBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefetchIntervalInBackground: Self = this.set("refetchIntervalInBackground", js.undefined)
    @scala.inline
    def setRefetchOnMount(value: Boolean): Self = this.set("refetchOnMount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefetchOnMount: Self = this.set("refetchOnMount", js.undefined)
    @scala.inline
    def setRefetchOnWindowFocus(value: Boolean): Self = this.set("refetchOnWindowFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefetchOnWindowFocus: Self = this.set("refetchOnWindowFocus", js.undefined)
    @scala.inline
    def setRetry(value: Boolean | Double): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    @scala.inline
    def setRetryDelay(value: /* retryAttempt */ Double => Double): Self = this.set("retryDelay", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRetryDelay: Self = this.set("retryDelay", js.undefined)
    @scala.inline
    def setStaleTime(value: Double): Self = this.set("staleTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaleTime: Self = this.set("staleTime", js.undefined)
    @scala.inline
    def setSuspense(value: Boolean): Self = this.set("suspense", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuspense: Self = this.set("suspense", js.undefined)
  }
  
}

