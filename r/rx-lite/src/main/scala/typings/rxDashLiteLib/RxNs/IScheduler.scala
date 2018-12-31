package typings
package rxDashLiteLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheduler extends js.Object {
  def isScheduler(value: js.Any): scala.Boolean
  def now(): scala.Double
  def schedule(action: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable
  def schedulePeriodic(period: scala.Double, action: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable
  def schedulePeriodicWithState[TState](state: TState, period: scala.Double, action: js.Function1[/* state */ TState, TState]): rxDashCoreLib.RxNs.IDisposable
  def scheduleRecursive(action: js.Function1[/* action */ js.Function0[scala.Unit], scala.Unit]): rxDashCoreLib.RxNs.IDisposable
  def scheduleRecursiveWithAbsolute(
    dueTime: scala.Double,
    action: js.Function1[/* action */ js.Function1[/* dueTime */ scala.Double, scala.Unit], scala.Unit]
  ): rxDashCoreLib.RxNs.IDisposable
  def scheduleRecursiveWithAbsoluteAndState[TState](
    state: TState,
    dueTime: scala.Double,
    action: js.Function2[
      /* state */ TState, 
      /* action */ js.Function2[/* state */ TState, /* dueTime */ scala.Double, scala.Unit], 
      scala.Unit
    ]
  ): rxDashCoreLib.RxNs.IDisposable
  def scheduleRecursiveWithRelative(
    dueTime: scala.Double,
    action: js.Function1[/* action */ js.Function1[/* dueTime */ scala.Double, scala.Unit], scala.Unit]
  ): rxDashCoreLib.RxNs.IDisposable
  def scheduleRecursiveWithRelativeAndState[TState](
    state: TState,
    dueTime: scala.Double,
    action: js.Function2[
      /* state */ TState, 
      /* action */ js.Function2[/* state */ TState, /* dueTime */ scala.Double, scala.Unit], 
      scala.Unit
    ]
  ): rxDashCoreLib.RxNs.IDisposable
  def scheduleRecursiveWithState[TState](
    state: TState,
    action: js.Function2[
      /* state */ TState, 
      /* action */ js.Function1[/* state */ TState, scala.Unit], 
      scala.Unit
    ]
  ): rxDashCoreLib.RxNs.IDisposable
  def scheduleWithAbsolute(dueTime: scala.Double, action: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable
  def scheduleWithAbsoluteAndState[TState](
    state: TState,
    dueTime: scala.Double,
    action: js.Function2[/* scheduler */ this.type, /* state */ TState, rxDashCoreLib.RxNs.IDisposable]
  ): rxDashCoreLib.RxNs.IDisposable
  def scheduleWithRelative(dueTime: scala.Double, action: js.Function0[scala.Unit]): rxDashCoreLib.RxNs.IDisposable
  def scheduleWithRelativeAndState[TState](
    state: TState,
    dueTime: scala.Double,
    action: js.Function2[/* scheduler */ this.type, /* state */ TState, rxDashCoreLib.RxNs.IDisposable]
  ): rxDashCoreLib.RxNs.IDisposable
  def scheduleWithState[TState](
    state: TState,
    action: js.Function2[/* scheduler */ this.type, /* state */ TState, rxDashCoreLib.RxNs.IDisposable]
  ): rxDashCoreLib.RxNs.IDisposable
}

