package typings
package rxDashLiteLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Current Thread IScheduler
trait ICurrentThreadScheduler extends IScheduler {
  def scheduleRequired(): scala.Boolean
}

object ICurrentThreadScheduler {
  @scala.inline
  def apply(
    isScheduler: js.Function1[js.Any, scala.Boolean],
    now: js.Function0[scala.Double],
    schedule: js.Function1[js.Function0[scala.Unit], rxDashCoreLib.RxNs.IDisposable],
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
    scheduleRequired: js.Function0[scala.Boolean],
    scheduleWithAbsolute: js.Function2[scala.Double, js.Function0[scala.Unit], rxDashCoreLib.RxNs.IDisposable],
    scheduleWithAbsoluteAndState: js.Function3[
      js.Any, 
      scala.Double, 
      js.Function2[ICurrentThreadScheduler, js.Any, rxDashCoreLib.RxNs.IDisposable], 
      rxDashCoreLib.RxNs.IDisposable
    ],
    scheduleWithRelative: js.Function2[scala.Double, js.Function0[scala.Unit], rxDashCoreLib.RxNs.IDisposable],
    scheduleWithRelativeAndState: js.Function3[
      js.Any, 
      scala.Double, 
      js.Function2[ICurrentThreadScheduler, js.Any, rxDashCoreLib.RxNs.IDisposable], 
      rxDashCoreLib.RxNs.IDisposable
    ],
    scheduleWithState: js.Function2[
      js.Any, 
      js.Function2[ICurrentThreadScheduler, js.Any, rxDashCoreLib.RxNs.IDisposable], 
      rxDashCoreLib.RxNs.IDisposable
    ]
  ): ICurrentThreadScheduler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isScheduler")(isScheduler)
    __obj.updateDynamic("now")(now)
    __obj.updateDynamic("schedule")(schedule)
    __obj.updateDynamic("schedulePeriodic")(schedulePeriodic)
    __obj.updateDynamic("schedulePeriodicWithState")(schedulePeriodicWithState)
    __obj.updateDynamic("scheduleRecursive")(scheduleRecursive)
    __obj.updateDynamic("scheduleRecursiveWithAbsolute")(scheduleRecursiveWithAbsolute)
    __obj.updateDynamic("scheduleRecursiveWithAbsoluteAndState")(scheduleRecursiveWithAbsoluteAndState)
    __obj.updateDynamic("scheduleRecursiveWithRelative")(scheduleRecursiveWithRelative)
    __obj.updateDynamic("scheduleRecursiveWithRelativeAndState")(scheduleRecursiveWithRelativeAndState)
    __obj.updateDynamic("scheduleRecursiveWithState")(scheduleRecursiveWithState)
    __obj.updateDynamic("scheduleRequired")(scheduleRequired)
    __obj.updateDynamic("scheduleWithAbsolute")(scheduleWithAbsolute)
    __obj.updateDynamic("scheduleWithAbsoluteAndState")(scheduleWithAbsoluteAndState)
    __obj.updateDynamic("scheduleWithRelative")(scheduleWithRelative)
    __obj.updateDynamic("scheduleWithRelativeAndState")(scheduleWithRelativeAndState)
    __obj.updateDynamic("scheduleWithState")(scheduleWithState)
    __obj.asInstanceOf[ICurrentThreadScheduler]
  }
}

