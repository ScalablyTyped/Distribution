package typings
package rxDashAngularLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopeScheduler
  extends rxDashCoreLib.RxNs.IScheduler {
}

@JSGlobal("Rx.ScopeScheduler")
@js.native
class ScopeSchedulerCls protected () extends ScopeScheduler {
  def this($scope: angularLib.angularMod.angularNs.IScope) = this()
  /* CompleteClass */
  override def `catch`(handler: js.Function1[/* exception */ js.Any, scala.Boolean]): rxDashCoreLib.RxNs.IScheduler = js.native
  /* CompleteClass */
  override def catchException(handler: js.Function1[/* exception */ js.Any, scala.Boolean]): rxDashCoreLib.RxNs.IScheduler = js.native
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

