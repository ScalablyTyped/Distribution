package typings
package rxjsLib.rxjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "VirtualAction")
@js.native
class VirtualAction[T] protected ()
  extends rxjsLib.internalSchedulerVirtualTimeSchedulerMod.VirtualAction[T] {
  def this(scheduler: rxjsLib.internalSchedulerVirtualTimeSchedulerMod.VirtualTimeScheduler, work: js.ThisFunction1[
      /* this */ rxjsLib.internalTypesMod.SchedulerAction[T], 
      /* state */ js.UndefOr[T], 
      scala.Unit
    ]) = this()
  def this(scheduler: rxjsLib.internalSchedulerVirtualTimeSchedulerMod.VirtualTimeScheduler, work: js.ThisFunction1[
      /* this */ rxjsLib.internalTypesMod.SchedulerAction[T], 
      /* state */ js.UndefOr[T], 
      scala.Unit
    ], index: scala.Double) = this()
}

/* static members */
@JSImport("rxjs", "VirtualAction")
@js.native
object VirtualAction extends js.Object {
  def sortActions[T](
    a: rxjsLib.internalSchedulerVirtualTimeSchedulerMod.VirtualAction[T],
    b: rxjsLib.internalSchedulerVirtualTimeSchedulerMod.VirtualAction[T]
  ): rxjsLib.rxjsLibNumbers.`1` | rxjsLib.rxjsLibNumbers.`0` | rxjsLib.rxjsLibNumbers.`-1` = js.native
}

