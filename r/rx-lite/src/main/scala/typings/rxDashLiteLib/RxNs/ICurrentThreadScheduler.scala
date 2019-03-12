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
    isScheduler: js.Any => scala.Boolean,
    now: () => scala.Double,
    schedule: js.Function0[scala.Unit] => rxDashCoreLib.RxNs.IDisposable,
    schedulePeriodic: (scala.Double, js.Function0[scala.Unit]) => rxDashCoreLib.RxNs.IDisposable,
    schedulePeriodicWithState: (js.Any, scala.Double, js.Function1[js.Any, js.Any]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleRecursive: js.Function1[/* action */ js.Function0[scala.Unit], scala.Unit] => rxDashCoreLib.RxNs.IDisposable,
    scheduleRecursiveWithAbsolute: (scala.Double, js.Function1[/* action */ js.Function1[/* dueTime */ scala.Double, scala.Unit], scala.Unit]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleRecursiveWithAbsoluteAndState: (js.Any, scala.Double, js.Function2[
      js.Any, 
      /* action */ js.Function2[js.Any, /* dueTime */ scala.Double, scala.Unit], 
      scala.Unit
    ]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleRecursiveWithRelative: (scala.Double, js.Function1[/* action */ js.Function1[/* dueTime */ scala.Double, scala.Unit], scala.Unit]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleRecursiveWithRelativeAndState: (js.Any, scala.Double, js.Function2[
      js.Any, 
      /* action */ js.Function2[js.Any, /* dueTime */ scala.Double, scala.Unit], 
      scala.Unit
    ]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleRecursiveWithState: (js.Any, js.Function2[js.Any, /* action */ js.Function1[js.Any, scala.Unit], scala.Unit]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleRequired: () => scala.Boolean,
    scheduleWithAbsolute: (scala.Double, js.Function0[scala.Unit]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleWithAbsoluteAndState: (js.Any, scala.Double, js.Function2[ICurrentThreadScheduler, js.Any, rxDashCoreLib.RxNs.IDisposable]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleWithRelative: (scala.Double, js.Function0[scala.Unit]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleWithRelativeAndState: (js.Any, scala.Double, js.Function2[ICurrentThreadScheduler, js.Any, rxDashCoreLib.RxNs.IDisposable]) => rxDashCoreLib.RxNs.IDisposable,
    scheduleWithState: (js.Any, js.Function2[ICurrentThreadScheduler, js.Any, rxDashCoreLib.RxNs.IDisposable]) => rxDashCoreLib.RxNs.IDisposable
  ): ICurrentThreadScheduler = {
    val __obj = js.Dynamic.literal(isScheduler = js.Any.fromFunction1(isScheduler), now = js.Any.fromFunction0(now), schedule = js.Any.fromFunction1(schedule), schedulePeriodic = js.Any.fromFunction2(schedulePeriodic), schedulePeriodicWithState = js.Any.fromFunction3(schedulePeriodicWithState), scheduleRecursive = js.Any.fromFunction1(scheduleRecursive), scheduleRecursiveWithAbsolute = js.Any.fromFunction2(scheduleRecursiveWithAbsolute), scheduleRecursiveWithAbsoluteAndState = js.Any.fromFunction3(scheduleRecursiveWithAbsoluteAndState), scheduleRecursiveWithRelative = js.Any.fromFunction2(scheduleRecursiveWithRelative), scheduleRecursiveWithRelativeAndState = js.Any.fromFunction3(scheduleRecursiveWithRelativeAndState), scheduleRecursiveWithState = js.Any.fromFunction2(scheduleRecursiveWithState), scheduleRequired = js.Any.fromFunction0(scheduleRequired), scheduleWithAbsolute = js.Any.fromFunction2(scheduleWithAbsolute), scheduleWithAbsoluteAndState = js.Any.fromFunction3(scheduleWithAbsoluteAndState), scheduleWithRelative = js.Any.fromFunction2(scheduleWithRelative), scheduleWithRelativeAndState = js.Any.fromFunction3(scheduleWithRelativeAndState), scheduleWithState = js.Any.fromFunction2(scheduleWithState))
  
    __obj.asInstanceOf[ICurrentThreadScheduler]
  }
}

