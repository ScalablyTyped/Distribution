package typings
package rxDashCoreLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduler extends js.Object {
  def `catch`(handler: js.Function1[/* exception */ js.Any, scala.Boolean]): IScheduler
  def catchException(handler: js.Function1[/* exception */ js.Any, scala.Boolean]): IScheduler
}

object IScheduler {
  @scala.inline
  def apply(
    `catch`: js.Function1[js.Function1[/* exception */ js.Any, scala.Boolean], IScheduler],
    catchException: js.Function1[js.Function1[/* exception */ js.Any, scala.Boolean], IScheduler]
  ): IScheduler = {
    val __obj = js.Dynamic.literal(catchException = catchException)
    __obj.updateDynamic("catch")(`catch`)
    __obj.asInstanceOf[IScheduler]
  }
}

