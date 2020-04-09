package typings.reactQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutateOptions[TResult, TVariables] extends js.Object {
  var onError: js.UndefOr[
    js.Function3[
      /* error */ js.Any, 
      /* variables */ TVariables, 
      /* snapshotValue */ js.Any, 
      js.Promise[Unit] | Unit
    ]
  ] = js.undefined
  var onSettled: js.UndefOr[
    js.Function4[
      /* data */ js.UndefOr[TResult], 
      /* error */ js.Any | Null, 
      /* variables */ TVariables, 
      /* snapshotValue */ js.UndefOr[js.Any], 
      js.Promise[Unit] | Unit
    ]
  ] = js.undefined
  var onSuccess: js.UndefOr[
    js.Function2[/* data */ TResult, /* variables */ TVariables, js.Promise[Unit] | Unit]
  ] = js.undefined
  var throwOnError: js.UndefOr[Boolean] = js.undefined
}

object MutateOptions {
  @scala.inline
  def apply[TResult, TVariables](
    onError: (/* error */ js.Any, /* variables */ TVariables, /* snapshotValue */ js.Any) => js.Promise[Unit] | Unit = null,
    onSettled: (/* data */ js.UndefOr[TResult], /* error */ js.Any | Null, /* variables */ TVariables, /* snapshotValue */ js.UndefOr[js.Any]) => js.Promise[Unit] | Unit = null,
    onSuccess: (/* data */ TResult, /* variables */ TVariables) => js.Promise[Unit] | Unit = null,
    throwOnError: js.UndefOr[Boolean] = js.undefined
  ): MutateOptions[TResult, TVariables] = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction3(onError))
    if (onSettled != null) __obj.updateDynamic("onSettled")(js.Any.fromFunction4(onSettled))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction2(onSuccess))
    if (!js.isUndefined(throwOnError)) __obj.updateDynamic("throwOnError")(throwOnError.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutateOptions[TResult, TVariables]]
  }
}

