package typings.rxLite.Rx

import typings.rxCore.Rx.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Current Thread IScheduler
trait ICurrentThreadScheduler
  extends StObject
     with IScheduler {
  
  def scheduleRequired(): Boolean
}
object ICurrentThreadScheduler {
  
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
    scheduleRequired: () => Boolean,
    scheduleWithAbsolute: (Double, js.Function0[Unit]) => IDisposable,
    scheduleWithAbsoluteAndState: (Any, Double, js.Function2[ICurrentThreadScheduler, Any, IDisposable]) => IDisposable,
    scheduleWithRelative: (Double, js.Function0[Unit]) => IDisposable,
    scheduleWithRelativeAndState: (Any, Double, js.Function2[ICurrentThreadScheduler, Any, IDisposable]) => IDisposable,
    scheduleWithState: (Any, js.Function2[ICurrentThreadScheduler, Any, IDisposable]) => IDisposable
  ): ICurrentThreadScheduler = {
    val __obj = js.Dynamic.literal(isScheduler = js.Any.fromFunction1(isScheduler), now = js.Any.fromFunction0(now), schedule = js.Any.fromFunction1(schedule), schedulePeriodic = js.Any.fromFunction2(schedulePeriodic), schedulePeriodicWithState = js.Any.fromFunction3(schedulePeriodicWithState), scheduleRecursive = js.Any.fromFunction1(scheduleRecursive), scheduleRecursiveWithAbsolute = js.Any.fromFunction2(scheduleRecursiveWithAbsolute), scheduleRecursiveWithAbsoluteAndState = js.Any.fromFunction3(scheduleRecursiveWithAbsoluteAndState), scheduleRecursiveWithRelative = js.Any.fromFunction2(scheduleRecursiveWithRelative), scheduleRecursiveWithRelativeAndState = js.Any.fromFunction3(scheduleRecursiveWithRelativeAndState), scheduleRecursiveWithState = js.Any.fromFunction2(scheduleRecursiveWithState), scheduleRequired = js.Any.fromFunction0(scheduleRequired), scheduleWithAbsolute = js.Any.fromFunction2(scheduleWithAbsolute), scheduleWithAbsoluteAndState = js.Any.fromFunction3(scheduleWithAbsoluteAndState), scheduleWithRelative = js.Any.fromFunction2(scheduleWithRelative), scheduleWithRelativeAndState = js.Any.fromFunction3(scheduleWithRelativeAndState), scheduleWithState = js.Any.fromFunction2(scheduleWithState))
    __obj.asInstanceOf[ICurrentThreadScheduler]
  }
  
  extension [Self <: ICurrentThreadScheduler](x: Self) {
    
    inline def setScheduleRequired(value: () => Boolean): Self = StObject.set(x, "scheduleRequired", js.Any.fromFunction0(value))
  }
}
