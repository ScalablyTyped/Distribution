package typings.reactQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationOptions[TResult, TVariables] extends MutateOptions[TResult, TVariables] {
  var onMutate: js.UndefOr[js.Function1[/* variables */ TVariables, js.Promise[_] | _]] = js.undefined
  var useErrorBoundary: js.UndefOr[Boolean] = js.undefined
}

object MutationOptions {
  @scala.inline
  def apply[TResult, TVariables](
    onError: (/* error */ js.Any, TVariables, /* snapshotValue */ js.Any) => js.Promise[Unit] | Unit = null,
    onMutate: /* variables */ TVariables => js.Promise[_] | _ = null,
    onSettled: (/* data */ js.UndefOr[TResult], /* error */ js.Any | Null, TVariables, /* snapshotValue */ js.UndefOr[js.Any]) => js.Promise[Unit] | Unit = null,
    onSuccess: (TResult, TVariables) => js.Promise[Unit] | Unit = null,
    throwOnError: js.UndefOr[Boolean] = js.undefined,
    useErrorBoundary: js.UndefOr[Boolean] = js.undefined
  ): MutationOptions[TResult, TVariables] = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction3(onError))
    if (onMutate != null) __obj.updateDynamic("onMutate")(js.Any.fromFunction1(onMutate))
    if (onSettled != null) __obj.updateDynamic("onSettled")(js.Any.fromFunction4(onSettled))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction2(onSuccess))
    if (!js.isUndefined(throwOnError)) __obj.updateDynamic("throwOnError")(throwOnError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useErrorBoundary)) __obj.updateDynamic("useErrorBoundary")(useErrorBoundary.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationOptions[TResult, TVariables]]
  }
}

