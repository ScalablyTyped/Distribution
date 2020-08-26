package typings.reactQuery.mod

import typings.reactQuery.reactQueryBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactQueryProviderConfig extends BaseQueryOptions {
  @JSName("onError")
  var onError_ReactQueryProviderConfig: js.UndefOr[js.Function2[/* err */ js.Any, /* snapshotValue */ js.UndefOr[js.Any], Unit]] = js.native
  var onMutate: js.UndefOr[js.Function1[/* variables */ js.Any, js.Promise[_] | _]] = js.native
  var onSettled: js.UndefOr[
    js.Function3[
      /* data */ js.UndefOr[js.Any], 
      /* error */ js.Any | Null, 
      /* snapshotValue */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  var onSuccess: js.UndefOr[js.Function2[/* data */ js.Any, /* variables */ js.UndefOr[js.Any], Unit]] = js.native
  var queryKeySerializerFn: js.UndefOr[
    js.Function1[
      /* queryKey */ js.UndefOr[
        js.Array[QueryKeyPart] | String | `false` | (js.Function0[js.UndefOr[js.Array[QueryKeyPart] | String | `false`]])
      ], 
      (js.Tuple2[String, js.Array[QueryKeyPart]]) | js.Array[js.Any]
    ]
  ] = js.native
  var refetchAllOnWindowFocus: js.UndefOr[Boolean] = js.native
  var throwOnError: js.UndefOr[Boolean] = js.native
  /** Defaults to the value of `suspense` if not defined otherwise */
  var useErrorBoundary: js.UndefOr[Boolean] = js.native
}

object ReactQueryProviderConfig {
  @scala.inline
  def apply(): ReactQueryProviderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactQueryProviderConfig]
  }
  @scala.inline
  implicit class ReactQueryProviderConfigOps[Self <: ReactQueryProviderConfig] (val x: Self) extends AnyVal {
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
    def setOnError(value: (/* err */ js.Any, /* snapshotValue */ js.UndefOr[js.Any]) => Unit): Self = this.set("onError", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnMutate(value: /* variables */ js.Any => js.Promise[_] | _): Self = this.set("onMutate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMutate: Self = this.set("onMutate", js.undefined)
    @scala.inline
    def setOnSettled(
      value: (/* data */ js.UndefOr[js.Any], /* error */ js.Any | Null, /* snapshotValue */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onSettled", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnSettled: Self = this.set("onSettled", js.undefined)
    @scala.inline
    def setOnSuccess(value: (/* data */ js.Any, /* variables */ js.UndefOr[js.Any]) => Unit): Self = this.set("onSuccess", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
    @scala.inline
    def setQueryKeySerializerFn(
      value: /* queryKey */ js.UndefOr[
          js.Array[QueryKeyPart] | String | `false` | (js.Function0[js.UndefOr[js.Array[QueryKeyPart] | String | `false`]])
        ] => (js.Tuple2[String, js.Array[QueryKeyPart]]) | js.Array[js.Any]
    ): Self = this.set("queryKeySerializerFn", js.Any.fromFunction1(value))
    @scala.inline
    def deleteQueryKeySerializerFn: Self = this.set("queryKeySerializerFn", js.undefined)
    @scala.inline
    def setRefetchAllOnWindowFocus(value: Boolean): Self = this.set("refetchAllOnWindowFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefetchAllOnWindowFocus: Self = this.set("refetchAllOnWindowFocus", js.undefined)
    @scala.inline
    def setThrowOnError(value: Boolean): Self = this.set("throwOnError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowOnError: Self = this.set("throwOnError", js.undefined)
    @scala.inline
    def setUseErrorBoundary(value: Boolean): Self = this.set("useErrorBoundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseErrorBoundary: Self = this.set("useErrorBoundary", js.undefined)
  }
  
}

