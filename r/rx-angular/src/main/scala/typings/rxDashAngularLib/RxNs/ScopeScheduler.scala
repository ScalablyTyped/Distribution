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
    `catch`: js.Function1[js.Function1[/* exception */ js.Any, scala.Boolean], rxDashCoreLib.RxNs.IScheduler],
    catchException: js.Function1[js.Function1[/* exception */ js.Any, scala.Boolean], rxDashCoreLib.RxNs.IScheduler]
  ): ScopeScheduler = {
    val __obj = js.Dynamic.literal(`catch` = `catch`)
    __obj.updateDynamic("catchException")(catchException)
    __obj.asInstanceOf[ScopeScheduler]
  }
}

