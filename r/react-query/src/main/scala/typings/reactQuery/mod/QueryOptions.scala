package typings.reactQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryOptions[TResult] extends BaseQueryOptions {
  var initialData: js.UndefOr[TResult | js.Function0[js.UndefOr[TResult]]] = js.native
  var onSettled: js.UndefOr[js.Function2[/* data */ js.UndefOr[TResult], /* error */ js.Any | Null, Unit]] = js.native
  var onSuccess: js.UndefOr[js.Function1[/* data */ TResult, Unit]] = js.native
}

object QueryOptions {
  @scala.inline
  def apply[TResult](): QueryOptions[TResult] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions[TResult]]
  }
  @scala.inline
  implicit class QueryOptionsOps[Self <: QueryOptions[_], TResult] (val x: Self with QueryOptions[TResult]) extends AnyVal {
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
    def setInitialDataFunction0(value: () => js.UndefOr[TResult]): Self = this.set("initialData", js.Any.fromFunction0(value))
    @scala.inline
    def setInitialData(value: TResult | js.Function0[js.UndefOr[TResult]]): Self = this.set("initialData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialData: Self = this.set("initialData", js.undefined)
    @scala.inline
    def setOnSettled(value: (/* data */ js.UndefOr[TResult], /* error */ js.Any | Null) => Unit): Self = this.set("onSettled", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSettled: Self = this.set("onSettled", js.undefined)
    @scala.inline
    def setOnSuccess(value: /* data */ TResult => Unit): Self = this.set("onSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
  }
  
}

