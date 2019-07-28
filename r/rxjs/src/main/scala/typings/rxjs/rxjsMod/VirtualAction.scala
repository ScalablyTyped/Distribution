package typings.rxjs.rxjsMod

import typings.rxjs.internalTypesMod.SchedulerAction
import typings.rxjs.rxjsNumbers.`-1`
import typings.rxjs.rxjsNumbers.`0`
import typings.rxjs.rxjsNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "VirtualAction")
@js.native
class VirtualAction[T] protected ()
  extends typings.rxjs.internalSchedulerVirtualTimeSchedulerMod.VirtualAction[T] {
  def this(
    scheduler: typings.rxjs.internalSchedulerVirtualTimeSchedulerMod.VirtualTimeScheduler,
    work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit]
  ) = this()
  def this(
    scheduler: typings.rxjs.internalSchedulerVirtualTimeSchedulerMod.VirtualTimeScheduler,
    work: js.ThisFunction1[/* this */ SchedulerAction[T], /* state */ js.UndefOr[T], Unit],
    index: Double
  ) = this()
}

/* static members */
@JSImport("rxjs", "VirtualAction")
@js.native
object VirtualAction extends js.Object {
  def sortActions[T](
    a: typings.rxjs.internalSchedulerVirtualTimeSchedulerMod.VirtualAction[T],
    b: typings.rxjs.internalSchedulerVirtualTimeSchedulerMod.VirtualAction[T]
  ): `1` | `0` | `-1` = js.native
}

