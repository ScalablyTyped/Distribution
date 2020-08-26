package typings.reactQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutateOptions[TResult, TVariables] extends js.Object {
  var onError: js.UndefOr[
    js.Function3[
      /* error */ js.Any, 
      /* variables */ TVariables, 
      /* snapshotValue */ js.Any, 
      js.Promise[Unit] | Unit
    ]
  ] = js.native
  var onSettled: js.UndefOr[
    js.Function4[
      /* data */ js.UndefOr[TResult], 
      /* error */ js.Any | Null, 
      /* variables */ TVariables, 
      /* snapshotValue */ js.UndefOr[js.Any], 
      js.Promise[Unit] | Unit
    ]
  ] = js.native
  var onSuccess: js.UndefOr[
    js.Function2[/* data */ TResult, /* variables */ TVariables, js.Promise[Unit] | Unit]
  ] = js.native
  var throwOnError: js.UndefOr[Boolean] = js.native
}

object MutateOptions {
  @scala.inline
  def apply[TResult, TVariables](): MutateOptions[TResult, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutateOptions[TResult, TVariables]]
  }
  @scala.inline
  implicit class MutateOptionsOps[Self <: MutateOptions[_, _], TResult, TVariables] (val x: Self with (MutateOptions[TResult, TVariables])) extends AnyVal {
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
    def setOnError(
      value: (/* error */ js.Any, /* variables */ TVariables, /* snapshotValue */ js.Any) => js.Promise[Unit] | Unit
    ): Self = this.set("onError", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnSettled(
      value: (/* data */ js.UndefOr[TResult], /* error */ js.Any | Null, /* variables */ TVariables, /* snapshotValue */ js.UndefOr[js.Any]) => js.Promise[Unit] | Unit
    ): Self = this.set("onSettled", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnSettled: Self = this.set("onSettled", js.undefined)
    @scala.inline
    def setOnSuccess(value: (/* data */ TResult, /* variables */ TVariables) => js.Promise[Unit] | Unit): Self = this.set("onSuccess", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
    @scala.inline
    def setThrowOnError(value: Boolean): Self = this.set("throwOnError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowOnError: Self = this.set("throwOnError", js.undefined)
  }
  
}

