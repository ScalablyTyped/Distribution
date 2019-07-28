package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.SchedulerLike
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/shareReplay", JSImport.Namespace)
@js.native
object operatorShareReplayMod extends js.Object {
  def shareReplay[T](`this`: Observable[T]): Observable[T] = js.native
  def shareReplay[T](`this`: Observable[T], bufferSize: Double): Observable[T] = js.native
  def shareReplay[T](`this`: Observable[T], bufferSize: Double, windowTime: Double): Observable[T] = js.native
  def shareReplay[T](`this`: Observable[T], bufferSize: Double, windowTime: Double, scheduler: SchedulerLike): Observable[T] = js.native
  def shareReplay[T](
    `this`: Observable[T],
    config: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ShareReplayConfig */ js.Any
  ): Observable[T] = js.native
}

