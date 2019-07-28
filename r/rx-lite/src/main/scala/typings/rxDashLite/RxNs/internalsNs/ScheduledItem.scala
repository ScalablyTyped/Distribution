package typings.rxDashLite.RxNs.internalsNs

import typings.rxDashCore.RxNs.IDisposable
import typings.rxDashLite.RxNs.IScheduler
import typings.rxDashLite.RxNs.SingleAssignmentDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.internals.ScheduledItem")
@js.native
class ScheduledItem[TTime] protected () extends js.Object {
  def this(
    scheduler: IScheduler,
    state: js.Any,
    action: js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable],
    dueTime: TTime
  ) = this()
  def this(
    scheduler: IScheduler,
    state: js.Any,
    action: js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable],
    dueTime: TTime,
    comparer: js.Function2[/* x */ TTime, /* y */ TTime, Double]
  ) = this()
  var disposable: SingleAssignmentDisposable = js.native
  var dueTime: TTime = js.native
  var scheduler: IScheduler = js.native
  var state: TTime = js.native
  def action(scheduler: IScheduler, state: js.Any): IDisposable = js.native
  def compareTo(other: ScheduledItem[TTime]): Double = js.native
  def comparer(x: TTime, y: TTime): Double = js.native
  def invoke(): Unit = js.native
  def invokeCore(): IDisposable = js.native
  def isCancelled(): Boolean = js.native
}

