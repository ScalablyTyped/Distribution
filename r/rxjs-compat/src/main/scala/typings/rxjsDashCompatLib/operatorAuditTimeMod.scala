package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/auditTime", JSImport.Namespace)
@js.native
object operatorAuditTimeMod extends js.Object {
  def auditTime[T](`this`: rxjsLib.rxjsMod.Observable[T], duration: scala.Double): rxjsLib.rxjsMod.Observable[T] = js.native
  def auditTime[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    duration: scala.Double,
    scheduler: rxjsLib.internalTypesMod.SchedulerLike
  ): rxjsLib.rxjsMod.Observable[T] = js.native
}

