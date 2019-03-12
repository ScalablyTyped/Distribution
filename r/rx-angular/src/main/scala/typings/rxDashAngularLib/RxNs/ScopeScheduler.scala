package typings
package rxDashAngularLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopeScheduler
  extends rxDashCoreLib.RxNs.IScheduler {
}

object ScopeScheduler {
  @scala.inline
  def apply(
    `catch`: js.Function1[/* exception */ js.Any, scala.Boolean] => rxDashCoreLib.RxNs.IScheduler,
    catchException: js.Function1[/* exception */ js.Any, scala.Boolean] => rxDashCoreLib.RxNs.IScheduler
  ): ScopeScheduler = {
    val __obj = js.Dynamic.literal(catchException = js.Any.fromFunction1(catchException))
    __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
    __obj.asInstanceOf[ScopeScheduler]
  }
}

