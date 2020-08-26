package typings.reactQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MutationOptions[TResult, TVariables] extends MutateOptions[TResult, TVariables] {
  var onMutate: js.UndefOr[js.Function1[/* variables */ TVariables, js.Promise[_] | _]] = js.native
  var useErrorBoundary: js.UndefOr[Boolean] = js.native
}

object MutationOptions {
  @scala.inline
  def apply[TResult, TVariables](): MutationOptions[TResult, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationOptions[TResult, TVariables]]
  }
  @scala.inline
  implicit class MutationOptionsOps[Self <: MutationOptions[_, _], TResult, TVariables] (val x: Self with (MutationOptions[TResult, TVariables])) extends AnyVal {
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
    def setOnMutate(value: /* variables */ TVariables => js.Promise[_] | _): Self = this.set("onMutate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMutate: Self = this.set("onMutate", js.undefined)
    @scala.inline
    def setUseErrorBoundary(value: Boolean): Self = this.set("useErrorBoundary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseErrorBoundary: Self = this.set("useErrorBoundary", js.undefined)
  }
  
}

