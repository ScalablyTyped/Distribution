package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/observeOn", JSImport.Namespace)
@js.native
object operatorObserveOnMod extends js.Object {
  def observeOn[T](`this`: rxjsLib.rxjsMod.Observable[T], scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.rxjsMod.Observable[T] = js.native
  def observeOn[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    scheduler: rxjsLib.internalTypesMod.SchedulerLike,
    delay: scala.Double
  ): rxjsLib.rxjsMod.Observable[T] = js.native
}

