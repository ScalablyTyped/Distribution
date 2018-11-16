package typings
package rxDashLiteLib.RxNs.internalsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.internals.ScheduledItem")
@js.native
class ScheduledItem[TTime] protected () extends js.Object {
  def this(scheduler: rxDashLiteLib.RxNs.IScheduler, state: js.Any, action: js.Function2[
      /* scheduler */ rxDashLiteLib.RxNs.IScheduler, 
      /* state */ js.Any, 
      rxDashCoreLib.RxNs.IDisposable
    ], dueTime: TTime) = this()
  def this(scheduler: rxDashLiteLib.RxNs.IScheduler, state: js.Any, action: js.Function2[
      /* scheduler */ rxDashLiteLib.RxNs.IScheduler, 
      /* state */ js.Any, 
      rxDashCoreLib.RxNs.IDisposable
    ], dueTime: TTime, comparer: js.Function2[/* x */ TTime, /* y */ TTime, scala.Double]) = this()
  var disposable: rxDashLiteLib.RxNs.SingleAssignmentDisposable = js.native
  var dueTime: TTime = js.native
  var scheduler: rxDashLiteLib.RxNs.IScheduler = js.native
  var state: TTime = js.native
  def action(scheduler: rxDashLiteLib.RxNs.IScheduler, state: js.Any): rxDashCoreLib.RxNs.IDisposable = js.native
  def compareTo(other: ScheduledItem[TTime]): scala.Double = js.native
  def comparer(x: TTime, y: TTime): scala.Double = js.native
  def invoke(): scala.Unit = js.native
  def invokeCore(): rxDashCoreLib.RxNs.IDisposable = js.native
  def isCancelled(): scala.Boolean = js.native
}

