package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.SchedulerLike
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/timeInterval", JSImport.Namespace)
@js.native
object operatorTimeIntervalMod extends js.Object {
  def timeInterval[T](`this`: Observable[T]): Observable[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TimeInterval<T> */ _
  ] = js.native
  def timeInterval[T](`this`: Observable[T], scheduler: SchedulerLike): Observable[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TimeInterval<T> */ _
  ] = js.native
}

