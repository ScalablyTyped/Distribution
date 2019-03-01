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
      /* scheduler */ rxDashCoreLib.RxNs.IScheduler, 
      /* state */ TState, 
      rxDashCoreLib.RxNs.IDisposable
    ]
  ): rxDashCoreLib.RxNs.IDisposable
  def scheduleRelative(dueTime: TRelative, action: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable
  def scheduleRelativeWithState[TState](
    state: TState,
    dueTime: TRelative,
    action: js.Function2[
      /* scheduler */ rxDashCoreLib.RxNs.IScheduler, 
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

object VirtualTimeScheduler {
  @scala.inline
  def apply[TAbsolute, TRelative](
    add: js.Function2[TAbsolute, TRelative, TAbsolute],
    advanceBy: js.Function1[TRelative, scala.Unit],
    advanceTo: js.Function1[TAbsolute, scala.Unit],
    getNext: js.Function0[rxDashLiteLib.RxNs.internalsNs.ScheduledItem[TAbsolute]],
    isEnabled: scala.Boolean,
    isScheduler: js.Function1[js.Any, scala.Boolean],
    now: js.Function0[scala.Double],
    schedule: js.Function1[js.Function0[scala.Unit], rxDashCoreLib.RxNs.IDisposable],
    scheduleAbsolute: js.Function2[TAbsolute, js.Function0[scala.Unit], rxDashCoreLib.RxNs.IDisposable],
    scheduleAbsoluteWithState: js.Function3[
      js.Any, 
      TAbsolute, 
      js.Function2[
        /* scheduler */ rxDashCoreLib.RxNs.IScheduler, 
        js.Any, 
        rxDashCoreLib.RxNs.IDisposable
      ], 
      rxDashCoreLib.RxNs.IDisposable
    ],
    schedulePeriodic: js.Function2[scala.Double, js.Function0[scala.Unit], rxDashCoreLib.RxNs.IDisposable],
    schedulePeriodicWithState: js.Function3[js.Any, scala.Double, js.Function1[js.Any, js.Any], rxDashCoreLib.RxNs.IDisposable],
    scheduleRecursive: js.Function1[
      js.Function1[/* action */ js.Function0[scala.Unit], scala.Unit], 
      rxDashCoreLib.RxNs.IDisposable
    ],
    scheduleRecursiveWithAbsolute: js.Function2[
      scala.Double, 
      js.Function1[/* action */ js.Function1[/* dueTime */ scala.Double, scala.Unit], scala.Unit], 
      rxDashCoreLib.RxNs.IDisposable
    ],
    scheduleRecursiveWithAbsoluteAndState: js.Function3[
      js.Any, 
      scala.Double, 
      js.Function2[
        js.Any, 
        /* action */ js.Function2[js.Any, /* dueTime */ scala.Double, scala.Unit], 
        scala.Unit
      ], 
      rxDashCoreLib.RxNs.IDisposable
    ],
    scheduleRecursiveWithRelative: js.Function2[
      scala.Double, 
      js.Function1[/* action */ js.Function1[/* dueTime */ scala.Double, scala.Unit], scala.Unit], 
      rxDashCoreLib.RxNs.IDisposable
    ],
    scheduleRecursiveWithRelativeAndState: js.Function3[
      js.Any, 
      scala.Double, 
      js.Function2[
        js.Any, 
        /* action */ js.Function2[js.Any, /* dueTime */ scala.Double, scala.Unit], 
        scala.Unit
      ], 
      rxDashCoreLib.RxNs.IDisposable
    ],
    scheduleRecursiveWithState: js.Function2[
      js.Any, 
      js.Function2[js.Any, /* action */ js.Function1[js.Any, scala.Unit], scala.Unit], 
      rxDashCoreLib.RxNs.IDisposable
    ],
    scheduleRelative: js.Function2[TRelative, js.Function0[scala.Unit], rxDashCoreLib.RxNs.IDisposable],
    scheduleRelativeWithState: js.Function3[
      js.Any, 
      TRelative, 
      js.Function2[
        /* scheduler */ rxDashCoreLib.RxNs.IScheduler, 
        js.Any, 
        rxDashCoreLib.RxNs.IDisposable
      ], 
      rxDashCoreLib.RxNs.IDisposable
    ],
    scheduleWithAbsolute: js.Function2[scala.Double, js.Function0[scala.Unit], rxDashCoreLib.RxNs.IDisposable],
    scheduleWithAbsoluteAndState: js.Function3[
      js.Any, 
      scala.Double, 
      js.Function2[VirtualTimeScheduler[TAbsolute, TRelative], js.Any, rxDashCoreLib.RxNs.IDisposable], 
      rxDashCoreLib.RxNs.IDisposable
    ],
    scheduleWithRelative: js.Function2[scala.Double, js.Function0[scala.Unit], rxDashCoreLib.RxNs.IDisposable],
    scheduleWithRelativeAndState: js.Function3[
      js.Any, 
      scala.Double, 
      js.Function2[VirtualTimeScheduler[TAbsolute, TRelative], js.Any, rxDashCoreLib.RxNs.IDisposable], 
      rxDashCoreLib.RxNs.IDisposable
    ],
    scheduleWithState: js.Function2[
      js.Any, 
      js.Function2[VirtualTimeScheduler[TAbsolute, TRelative], js.Any, rxDashCoreLib.RxNs.IDisposable], 
      rxDashCoreLib.RxNs.IDisposable
    ],
    sleep: js.Function1[TRelative, scala.Unit],
    start: js.Function0[rxDashCoreLib.RxNs.IDisposable],
    stop: js.Function0[scala.Unit],
    toDateTimeOffset: js.Function1[TAbsolute, scala.Double],
    toRelative: js.Function1[scala.Double, TRelative]
  ): VirtualTimeScheduler[TAbsolute, TRelative] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("advanceBy")(advanceBy)
    __obj.updateDynamic("advanceTo")(advanceTo)
    __obj.updateDynamic("getNext")(getNext)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.updateDynamic("isScheduler")(isScheduler)
    __obj.updateDynamic("now")(now)
    __obj.updateDynamic("schedule")(schedule)
    __obj.updateDynamic("scheduleAbsolute")(scheduleAbsolute)
    __obj.updateDynamic("scheduleAbsoluteWithState")(scheduleAbsoluteWithState)
    __obj.updateDynamic("schedulePeriodic")(schedulePeriodic)
    __obj.updateDynamic("schedulePeriodicWithState")(schedulePeriodicWithState)
    __obj.updateDynamic("scheduleRecursive")(scheduleRecursive)
    __obj.updateDynamic("scheduleRecursiveWithAbsolute")(scheduleRecursiveWithAbsolute)
    __obj.updateDynamic("scheduleRecursiveWithAbsoluteAndState")(scheduleRecursiveWithAbsoluteAndState)
    __obj.updateDynamic("scheduleRecursiveWithRelative")(scheduleRecursiveWithRelative)
    __obj.updateDynamic("scheduleRecursiveWithRelativeAndState")(scheduleRecursiveWithRelativeAndState)
    __obj.updateDynamic("scheduleRecursiveWithState")(scheduleRecursiveWithState)
    __obj.updateDynamic("scheduleRelative")(scheduleRelative)
    __obj.updateDynamic("scheduleRelativeWithState")(scheduleRelativeWithState)
    __obj.updateDynamic("scheduleWithAbsolute")(scheduleWithAbsolute)
    __obj.updateDynamic("scheduleWithAbsoluteAndState")(scheduleWithAbsoluteAndState)
    __obj.updateDynamic("scheduleWithRelative")(scheduleWithRelative)
    __obj.updateDynamic("scheduleWithRelativeAndState")(scheduleWithRelativeAndState)
    __obj.updateDynamic("scheduleWithState")(scheduleWithState)
    __obj.updateDynamic("sleep")(sleep)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("stop")(stop)
    __obj.updateDynamic("toDateTimeOffset")(toDateTimeOffset)
    __obj.updateDynamic("toRelative")(toRelative)
    __obj.asInstanceOf[VirtualTimeScheduler[TAbsolute, TRelative]]
  }
}

