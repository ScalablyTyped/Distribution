package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.SchedulerLike
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/timestamp", JSImport.Namespace)
@js.native
object operatorTimestampMod extends js.Object {
  def timestamp[T](`this`: Observable[T]): Observable[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Timestamp<T> */ _
  ] = js.native
  def timestamp[T](`this`: Observable[T], scheduler: SchedulerLike): Observable[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Timestamp<T> */ _
  ] = js.native
}

