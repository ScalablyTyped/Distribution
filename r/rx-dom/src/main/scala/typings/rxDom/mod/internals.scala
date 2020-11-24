package typings.rxDom.mod

import typings.rx.Rx.Comparer
import typings.rx.Rx.IDisposable
import typings.rx.Rx.IScheduler
import typings.rx.Rx.internals.AbstractObserverStatic
import typings.rx.Rx.internals.PriorityQueueStatic
import typings.rx.Rx.internals.SchedulePeriodicRecursiveStatic
import typings.rx.Rx.internals.ScheduledItemStatic
import typings.rx.anon.GetDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx-dom", "internals")
@js.native
object internals extends js.Object {
  
  var AbstractObserver: AbstractObserverStatic = js.native
  
  var PriorityQueue: PriorityQueueStatic = js.native
  
  var SchedulePeriodicRecursive: SchedulePeriodicRecursiveStatic = js.native
  
  var ScheduledItem: ScheduledItemStatic = js.native
  
  var addProperties: js.Function2[/* obj */ js.Any, /* repeated */ js.Any, Unit] = js.native
  
  var addRef: js.Function2[
    /* xs */ typings.rx.Rx.Observable[js.Any], 
    /* r */ GetDisposable, 
    typings.rx.Rx.Observable[js.Any]
  ] = js.native
  
  var bindCallback: js.Function3[/* func */ js.Function, /* thisArg */ js.Any, /* argCount */ Double, js.Function] = js.native
  
  var inherits: js.Function2[/* child */ js.Any, /* parent */ js.Any, Unit] = js.native
  
  var isEqual: js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean] = js.native
  
  @js.native
  class AbstractObserverCls[T] ()
    extends typings.rx.mod.internals.AbstractObserverCls[T]
  
  @js.native
  class PriorityQueueCls[T] protected ()
    extends typings.rx.mod.internals.PriorityQueueCls[T] {
    def this(capacity: Double) = this()
  }
  
  @js.native
  class SchedulePeriodicRecursiveCls protected ()
    extends typings.rx.mod.internals.SchedulePeriodicRecursiveCls {
    def this(scheduler: js.Any, state: js.Any, period: js.Any, action: js.Any) = this()
  }
  
  @js.native
  class ScheduledItemCls[TTime] protected ()
    extends typings.rx.mod.internals.ScheduledItemCls[TTime] {
    def this(
      scheduler: IScheduler,
      state: js.Any,
      action: js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable],
      dueTime: TTime
    ) = this()
    def this(
      scheduler: IScheduler,
      state: js.Any,
      action: js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable],
      dueTime: TTime,
      comparer: Comparer[TTime, Double]
    ) = this()
  }
}
