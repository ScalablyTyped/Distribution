package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.SchedulerLike
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/auditTime", JSImport.Namespace)
@js.native
object operatorAuditTimeMod extends js.Object {
  def auditTime[T](`this`: Observable[T], duration: Double): Observable[T] = js.native
  def auditTime[T](`this`: Observable[T], duration: Double, scheduler: SchedulerLike): Observable[T] = js.native
}

