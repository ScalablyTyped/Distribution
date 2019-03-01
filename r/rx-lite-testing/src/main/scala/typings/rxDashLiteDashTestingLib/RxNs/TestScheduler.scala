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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("advanceBy")(advanceBy)
    __obj.updateDynamic("advanceTo")(advanceTo)
    __obj.updateDynamic("createColdObservable")(createColdObservable)
    __obj.updateDynamic("createHotObservable")(createHotObservable)
    __obj.updateDynamic("createObserver")(createObserver)
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
    __obj.updateDynamic("startWithCreate")(startWithCreate)
    __obj.updateDynamic("startWithDispose")(startWithDispose)
    __obj.updateDynamic("startWithTiming")(startWithTiming)
    __obj.updateDynamic("stop")(stop)
    __obj.updateDynamic("toDateTimeOffset")(toDateTimeOffset)
    __obj.updateDynamic("toRelative")(toRelative)
    __obj.asInstanceOf[TestScheduler]
  }
}

