package typings.rx.rxCoincidenceMod.internals

import typings.rx.Rx.Comparer
import typings.rx.Rx.IDisposable
import typings.rx.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx.coincidence", "internals.ScheduledItem")
@js.native
class ScheduledItemCls[TTime] protected ()
  extends typings.rx.Rx.internals.ScheduledItem[TTime] {
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
