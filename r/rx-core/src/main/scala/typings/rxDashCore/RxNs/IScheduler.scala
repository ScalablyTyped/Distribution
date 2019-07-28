package typings.rxDashCore.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduler extends js.Object {
  def `catch`(handler: js.Function1[/* exception */ js.Any, Boolean]): IScheduler
  def catchException(handler: js.Function1[/* exception */ js.Any, Boolean]): IScheduler
}

object IScheduler {
  @scala.inline
  def apply(
    `catch`: js.Function1[/* exception */ js.Any, Boolean] => IScheduler,
    catchException: js.Function1[/* exception */ js.Any, Boolean] => IScheduler
  ): IScheduler = {
    val __obj = js.Dynamic.literal(catchException = js.Any.fromFunction1(catchException))
    __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
    __obj.asInstanceOf[IScheduler]
  }
}

