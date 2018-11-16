package typings
package rxDashLiteDashVirtualtimeLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VirtualTimeScheduler[TAbsolute, TRelative]
  extends rxDashLiteLib.RxNs.IScheduler {
  var isEnabled: scala.Boolean
  /* protected abstract */ def add(from: TAbsolute, by: TRelative): TAbsolute
  // protected constructor(initialClock: TAbsolute, comparer: (first: TAbsolute, second: TAbsolute) => number);
  def advanceBy(time: TRelative): scala.Unit
  def advanceTo(time: TAbsolute): scala.Unit
  /* protected */ def getNext(): rxDashLiteLib.RxNs.internalsNs.ScheduledItem[TAbsolute]
  def scheduleAbsolute(dueTime: TAbsolute, action: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable
  def scheduleAbsoluteWithState[TState](
    state: TState,
    dueTime: TAbsolute,
    action: js.Function2[
      /* scheduler */ rxDashLiteLib.RxNs.IScheduler, 
      /* state */ TState, 
      rxDashCoreLib.RxNs.IDisposable
    ]
  ): rxDashCoreLib.RxNs.IDisposable
  def scheduleRelative(dueTime: TRelative, action: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable
  def scheduleRelativeWithState[TState](
    state: TState,
    dueTime: TRelative,
    action: js.Function2[
      /* scheduler */ rxDashLiteLib.RxNs.IScheduler, 
      /* state */ TState, 
      rxDashCoreLib.RxNs.IDisposable
    ]
  ): rxDashCoreLib.RxNs.IDisposable
  def sleep(time: TRelative): scala.Unit
  def start(): rxDashCoreLib.RxNs.IDisposable
  def stop(): scala.Unit
  /* protected abstract */ def toDateTimeOffset(duetime: TAbsolute): scala.Double
  /* protected abstract */ def toRelative(duetime: scala.Double): TRelative
}

