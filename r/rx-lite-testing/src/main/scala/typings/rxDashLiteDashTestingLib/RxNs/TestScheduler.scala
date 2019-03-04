package typings
package rxDashLiteDashTestingLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestScheduler
  extends rxDashLiteDashVirtualtimeLib.RxNs.VirtualTimeScheduler[scala.Double, scala.Double] {
  def createColdObservable[T](records: Recorded*): rxDashCoreLib.RxNs.Observable[T]
  def createHotObservable[T](records: Recorded*): rxDashCoreLib.RxNs.Observable[T]
  def createObserver[T](): MockObserver[T]
  def startWithCreate[T](create: js.Function0[rxDashCoreLib.RxNs.Observable[T]]): MockObserver[T]
  def startWithDispose[T](create: js.Function0[rxDashCoreLib.RxNs.Observable[T]], disposedAt: scala.Double): MockObserver[T]
  def startWithTiming[T](
    create: js.Function0[rxDashCoreLib.RxNs.Observable[T]],
    createdAt: scala.Double,
    subscribedAt: scala.Double,
    disposedAt: scala.Double
  ): MockObserver[T]
}

object TestScheduler {
  @scala.inline
  def apply(
    add: js.Function2[scala.Double, scala.Double, scala.Double],
    advanceBy: js.Function1[scala.Double, scala.Unit],
    advanceTo: js.Function1[scala.Double, scala.Unit],
    createColdObservable: js.Function1[/* repeated */ Recorded, rxDashCoreLib.RxNs.Observable[js.Any]],
    createHotObservable: js.Function1[/* repeated */ Recorded, rxDashCoreLib.RxNs.Observable[js.Any]],
    createObserver: js.Function0[MockObserver[js.Any]],
    getNext: js.Function0[rxDashLiteLib.RxNs.internalsNs.ScheduledItem[scala.Double]],
    isEnabled: scala.Boolean,
    isScheduler: js.Function1[js.Any, scala.Boolean],
    now: js.Function0[scala.Double],
    schedule: js.Function1[js.Function0[scala.Unit], rxDashCoreLib.RxNs.IDisposable],
    scheduleAbsolute: js.Function2[scala.Double, js.Function0[scala.Unit], rxDashCoreLib.RxNs.IDisposable],
    scheduleAbsoluteWithState: js.Function3[
      js.Any, 
      scala.Double, 
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
    scheduleRelative: js.Function2[scala.Double, js.Function0[scala.Unit], rxDashCoreLib.RxNs.IDisposable],
    scheduleRelativeWithState: js.Function3[
      js.Any, 
      scala.Double, 
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
      js.Function2[TestScheduler, js.Any, rxDashCoreLib.RxNs.IDisposable], 
      rxDashCoreLib.RxNs.IDisposable
    ],
    scheduleWithRelative: js.Function2[scala.Double, js.Function0[scala.Unit], rxDashCoreLib.RxNs.IDisposable],
    scheduleWithRelativeAndState: js.Function3[
      js.Any, 
      scala.Double, 
      js.Function2[TestScheduler, js.Any, rxDashCoreLib.RxNs.IDisposable], 
      rxDashCoreLib.RxNs.IDisposable
    ],
    scheduleWithState: js.Function2[
      js.Any, 
      js.Function2[TestScheduler, js.Any, rxDashCoreLib.RxNs.IDisposable], 
      rxDashCoreLib.RxNs.IDisposable
    ],
    sleep: js.Function1[scala.Double, scala.Unit],
    start: js.Function0[rxDashCoreLib.RxNs.IDisposable],
    startWithCreate: js.Function1[js.Function0[rxDashCoreLib.RxNs.Observable[js.Any]], MockObserver[js.Any]],
    startWithDispose: js.Function2[
      js.Function0[rxDashCoreLib.RxNs.Observable[js.Any]], 
      scala.Double, 
      MockObserver[js.Any]
    ],
    startWithTiming: js.Function4[
      js.Function0[rxDashCoreLib.RxNs.Observable[js.Any]], 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      MockObserver[js.Any]
    ],
    stop: js.Function0[scala.Unit],
    toDateTimeOffset: js.Function1[scala.Double, scala.Double],
    toRelative: js.Function1[scala.Double, scala.Double]
  ): TestScheduler = {
    val __obj = js.Dynamic.literal(add = add, advanceBy = advanceBy, advanceTo = advanceTo, createColdObservable = createColdObservable, createHotObservable = createHotObservable, createObserver = createObserver, getNext = getNext, isEnabled = isEnabled, isScheduler = isScheduler, now = now, schedule = schedule, scheduleAbsolute = scheduleAbsolute, scheduleAbsoluteWithState = scheduleAbsoluteWithState, schedulePeriodic = schedulePeriodic, schedulePeriodicWithState = schedulePeriodicWithState, scheduleRecursive = scheduleRecursive, scheduleRecursiveWithAbsolute = scheduleRecursiveWithAbsolute, scheduleRecursiveWithAbsoluteAndState = scheduleRecursiveWithAbsoluteAndState, scheduleRecursiveWithRelative = scheduleRecursiveWithRelative, scheduleRecursiveWithRelativeAndState = scheduleRecursiveWithRelativeAndState, scheduleRecursiveWithState = scheduleRecursiveWithState, scheduleRelative = scheduleRelative, scheduleRelativeWithState = scheduleRelativeWithState, scheduleWithAbsolute = scheduleWithAbsolute, scheduleWithAbsoluteAndState = scheduleWithAbsoluteAndState, scheduleWithRelative = scheduleWithRelative, scheduleWithRelativeAndState = scheduleWithRelativeAndState, scheduleWithState = scheduleWithState, sleep = sleep, start = start, startWithCreate = startWithCreate, startWithDispose = startWithDispose, startWithTiming = startWithTiming, stop = stop, toDateTimeOffset = toDateTimeOffset, toRelative = toRelative)
  
    __obj.asInstanceOf[TestScheduler]
  }
}

