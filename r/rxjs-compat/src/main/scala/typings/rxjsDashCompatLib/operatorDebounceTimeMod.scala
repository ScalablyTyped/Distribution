package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/debounceTime", JSImport.Namespace)
@js.native
object operatorDebounceTimeMod extends js.Object {
  def debounceTime[T](`this`: rxjsLib.rxjsMod.Observable[T], dueTime: scala.Double): rxjsLib.rxjsMod.Observable[T] = js.native
  def debounceTime[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    dueTime: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T] = js.native
}

