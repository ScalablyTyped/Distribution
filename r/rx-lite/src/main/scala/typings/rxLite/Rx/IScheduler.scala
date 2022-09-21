package typings.rxLite.Rx

import typings.rxCore.Rx.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScheduler extends StObject {
  
  def isScheduler(value: Any): Boolean
  
  def now(): Double
  
  def schedule(action: js.Function0[Unit]): IDisposable
  
  def schedulePeriodic(period: Double, action: js.Function0[Unit]): IDisposable
  
  def schedulePeriodicWithState[TState](state: TState, period: Double, action: js.Function1[/* state */ TState, TState]): IDisposable
  
  def scheduleRecursive(action: js.Function1[/* action */ js.Function0[Unit], Unit]): IDisposable
  
  def scheduleRecursiveWithAbsolute(dueTime: Double, action: js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]): IDisposable
  
  def scheduleRecursiveWithAbsoluteAndState[TState](
    state: TState,
    dueTime: Double,
    action: js.Function2[
      /* state */ TState, 
      /* action */ js.Function2[/* state */ TState, /* dueTime */ Double, Unit], 
      Unit
    ]
  ): IDisposable
  
  def scheduleRecursiveWithRelative(dueTime: Double, action: js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]): IDisposable
  
  def scheduleRecursiveWithRelativeAndState[TState](
    state: TState,
    dueTime: Double,
    action: js.Function2[
      /* state */ TState, 
      /* action */ js.Function2[/* state */ TState, /* dueTime */ Double, Unit], 
      Unit
    ]
  ): IDisposable
  
  def scheduleRecursiveWithState[TState](
    state: TState,
    action: js.Function2[/* state */ TState, /* action */ js.Function1[/* state */ TState, Unit], Unit]
  ): IDisposable
  
  def scheduleWithAbsolute(dueTime: Double, action: js.Function0[Unit]): IDisposable
  
  def scheduleWithAbsoluteAndState[TState](
    state: TState,
    dueTime: Double,
    action: js.Function2[/* scheduler */ this.type, /* state */ TState, IDisposable]
  ): IDisposable
  
  def scheduleWithRelative(dueTime: Double, action: js.Function0[Unit]): IDisposable
  
  def scheduleWithRelativeAndState[TState](
    state: TState,
    dueTime: Double,
    action: js.Function2[/* scheduler */ this.type, /* state */ TState, IDisposable]
  ): IDisposable
  
  def scheduleWithState[TState](state: TState, action: js.Function2[/* scheduler */ this.type, /* state */ TState, IDisposable]): IDisposable
}
object IScheduler {
  
  inline def apply(
    isScheduler: Any => Boolean,
    now: () => Double,
    schedule: js.Function0[Unit] => IDisposable,
    schedulePeriodic: (Double, js.Function0[Unit]) => IDisposable,
    schedulePeriodicWithState: (Any, Double, js.Function1[Any, Any]) => IDisposable,
    scheduleRecursive: js.Function1[/* action */ js.Function0[Unit], Unit] => IDisposable,
    scheduleRecursiveWithAbsolute: (Double, js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]) => IDisposable,
    scheduleRecursiveWithAbsoluteAndState: (Any, Double, js.Function2[Any, /* action */ js.Function2[Any, /* dueTime */ Double, Unit], Unit]) => IDisposable,
    scheduleRecursiveWithRelative: (Double, js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]) => IDisposable,
    scheduleRecursiveWithRelativeAndState: (Any, Double, js.Function2[Any, /* action */ js.Function2[Any, /* dueTime */ Double, Unit], Unit]) => IDisposable,
    scheduleRecursiveWithState: (Any, js.Function2[Any, /* action */ js.Function1[Any, Unit], Unit]) => IDisposable,
    scheduleWithAbsolute: (Double, js.Function0[Unit]) => IDisposable,
    scheduleWithAbsoluteAndState: (Any, Double, js.Function2[IScheduler, Any, IDisposable]) => IDisposable,
    scheduleWithRelative: (Double, js.Function0[Unit]) => IDisposable,
    scheduleWithRelativeAndState: (Any, Double, js.Function2[IScheduler, Any, IDisposable]) => IDisposable,
    scheduleWithState: (Any, js.Function2[IScheduler, Any, IDisposable]) => IDisposable
  ): IScheduler = {
    val __obj = js.Dynamic.literal(isScheduler = js.Any.fromFunction1(isScheduler), now = js.Any.fromFunction0(now), schedule = js.Any.fromFunction1(schedule), schedulePeriodic = js.Any.fromFunction2(schedulePeriodic), schedulePeriodicWithState = js.Any.fromFunction3(schedulePeriodicWithState), scheduleRecursive = js.Any.fromFunction1(scheduleRecursive), scheduleRecursiveWithAbsolute = js.Any.fromFunction2(scheduleRecursiveWithAbsolute), scheduleRecursiveWithAbsoluteAndState = js.Any.fromFunction3(scheduleRecursiveWithAbsoluteAndState), scheduleRecursiveWithRelative = js.Any.fromFunction2(scheduleRecursiveWithRelative), scheduleRecursiveWithRelativeAndState = js.Any.fromFunction3(scheduleRecursiveWithRelativeAndState), scheduleRecursiveWithState = js.Any.fromFunction2(scheduleRecursiveWithState), scheduleWithAbsolute = js.Any.fromFunction2(scheduleWithAbsolute), scheduleWithAbsoluteAndState = js.Any.fromFunction3(scheduleWithAbsoluteAndState), scheduleWithRelative = js.Any.fromFunction2(scheduleWithRelative), scheduleWithRelativeAndState = js.Any.fromFunction3(scheduleWithRelativeAndState), scheduleWithState = js.Any.fromFunction2(scheduleWithState))
    __obj.asInstanceOf[IScheduler]
  }
  
  extension [Self <: IScheduler](x: Self) {
    
    inline def setIsScheduler(value: Any => Boolean): Self = StObject.set(x, "isScheduler", js.Any.fromFunction1(value))
    
    inline def setNow(value: () => Double): Self = StObject.set(x, "now", js.Any.fromFunction0(value))
    
    inline def setSchedule(value: js.Function0[Unit] => IDisposable): Self = StObject.set(x, "schedule", js.Any.fromFunction1(value))
    
    inline def setSchedulePeriodic(value: (Double, js.Function0[Unit]) => IDisposable): Self = StObject.set(x, "schedulePeriodic", js.Any.fromFunction2(value))
    
    inline def setSchedulePeriodicWithState(value: (Any, Double, js.Function1[Any, Any]) => IDisposable): Self = StObject.set(x, "schedulePeriodicWithState", js.Any.fromFunction3(value))
    
    inline def setScheduleRecursive(value: js.Function1[/* action */ js.Function0[Unit], Unit] => IDisposable): Self = StObject.set(x, "scheduleRecursive", js.Any.fromFunction1(value))
    
    inline def setScheduleRecursiveWithAbsolute(
      value: (Double, js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]) => IDisposable
    ): Self = StObject.set(x, "scheduleRecursiveWithAbsolute", js.Any.fromFunction2(value))
    
    inline def setScheduleRecursiveWithAbsoluteAndState(
      value: (Any, Double, js.Function2[Any, /* action */ js.Function2[Any, /* dueTime */ Double, Unit], Unit]) => IDisposable
    ): Self = StObject.set(x, "scheduleRecursiveWithAbsoluteAndState", js.Any.fromFunction3(value))
    
    inline def setScheduleRecursiveWithRelative(
      value: (Double, js.Function1[/* action */ js.Function1[/* dueTime */ Double, Unit], Unit]) => IDisposable
    ): Self = StObject.set(x, "scheduleRecursiveWithRelative", js.Any.fromFunction2(value))
    
    inline def setScheduleRecursiveWithRelativeAndState(
      value: (Any, Double, js.Function2[Any, /* action */ js.Function2[Any, /* dueTime */ Double, Unit], Unit]) => IDisposable
    ): Self = StObject.set(x, "scheduleRecursiveWithRelativeAndState", js.Any.fromFunction3(value))
    
    inline def setScheduleRecursiveWithState(value: (Any, js.Function2[Any, /* action */ js.Function1[Any, Unit], Unit]) => IDisposable): Self = StObject.set(x, "scheduleRecursiveWithState", js.Any.fromFunction2(value))
    
    inline def setScheduleWithAbsolute(value: (Double, js.Function0[Unit]) => IDisposable): Self = StObject.set(x, "scheduleWithAbsolute", js.Any.fromFunction2(value))
    
    inline def setScheduleWithAbsoluteAndState(value: (Any, Double, js.Function2[IScheduler, Any, IDisposable]) => IDisposable): Self = StObject.set(x, "scheduleWithAbsoluteAndState", js.Any.fromFunction3(value))
    
    inline def setScheduleWithRelative(value: (Double, js.Function0[Unit]) => IDisposable): Self = StObject.set(x, "scheduleWithRelative", js.Any.fromFunction2(value))
    
    inline def setScheduleWithRelativeAndState(value: (Any, Double, js.Function2[IScheduler, Any, IDisposable]) => IDisposable): Self = StObject.set(x, "scheduleWithRelativeAndState", js.Any.fromFunction3(value))
    
    inline def setScheduleWithState(value: (Any, js.Function2[IScheduler, Any, IDisposable]) => IDisposable): Self = StObject.set(x, "scheduleWithState", js.Any.fromFunction2(value))
  }
}
