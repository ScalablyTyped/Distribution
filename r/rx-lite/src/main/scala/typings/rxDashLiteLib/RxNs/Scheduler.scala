package typings
package rxDashLiteLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.Scheduler")
@js.native
class SchedulerCls protected () extends Scheduler {
  def this(now: js.Function0[scala.Double], schedule: js.Function2[
      /* state */ js.Any, 
      /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, rxDashCoreLib.RxNs.IDisposable], 
      rxDashCoreLib.RxNs.IDisposable
    ], scheduleRelative: js.Function3[
      /* state */ js.Any, 
      /* dueTime */ scala.Double, 
      /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, rxDashCoreLib.RxNs.IDisposable], 
      rxDashCoreLib.RxNs.IDisposable
    ], scheduleAbsolute: js.Function3[
      /* state */ js.Any, 
      /* dueTime */ scala.Double, 
      /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, rxDashCoreLib.RxNs.IDisposable], 
      rxDashCoreLib.RxNs.IDisposable
    ]) = this()
  /* CompleteClass */
  override def isScheduler(value: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def now(): scala.Double = js.native
  /* CompleteClass */
  override def schedule(action: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def schedulePeriodic(period: scala.Double, action: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def schedulePeriodicWithState[TState](state: TState, period: scala.Double, action: js.Function1[/* state */ TState, TState]): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleRecursive(action: js.Function1[/* action */ js.Function0[scala.Unit], scala.Unit]): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleRecursiveWithAbsolute(
    dueTime: scala.Double,
    action: js.Function1[/* action */ js.Function1[/* dueTime */ scala.Double, scala.Unit], scala.Unit]
  ): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleRecursiveWithAbsoluteAndState[TState](
    state: TState,
    dueTime: scala.Double,
    action: js.Function2[
      /* state */ TState, 
      /* action */ js.Function2[/* state */ TState, /* dueTime */ scala.Double, scala.Unit], 
      scala.Unit
    ]
  ): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleRecursiveWithRelative(
    dueTime: scala.Double,
    action: js.Function1[/* action */ js.Function1[/* dueTime */ scala.Double, scala.Unit], scala.Unit]
  ): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleRecursiveWithRelativeAndState[TState](
    state: TState,
    dueTime: scala.Double,
    action: js.Function2[
      /* state */ TState, 
      /* action */ js.Function2[/* state */ TState, /* dueTime */ scala.Double, scala.Unit], 
      scala.Unit
    ]
  ): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleRecursiveWithState[TState](
    state: TState,
    action: js.Function2[
      /* state */ TState, 
      /* action */ js.Function1[/* state */ TState, scala.Unit], 
      scala.Unit
    ]
  ): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleWithAbsolute(dueTime: scala.Double, action: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleWithAbsoluteAndState[TState](
    state: TState,
    dueTime: scala.Double,
    action: js.Function2[/* scheduler */ this.type, /* state */ TState, rxDashCoreLib.RxNs.IDisposable]
  ): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleWithRelative(dueTime: scala.Double, action: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleWithRelativeAndState[TState](
    state: TState,
    dueTime: scala.Double,
    action: js.Function2[/* scheduler */ this.type, /* state */ TState, rxDashCoreLib.RxNs.IDisposable]
  ): rxDashCoreLib.RxNs.IDisposable = js.native
  /* CompleteClass */
  override def scheduleWithState[TState](
    state: TState,
    action: js.Function2[/* scheduler */ this.type, /* state */ TState, rxDashCoreLib.RxNs.IDisposable]
  ): rxDashCoreLib.RxNs.IDisposable = js.native
}

