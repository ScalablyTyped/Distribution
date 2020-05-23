package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/operator/bufferTime", JSImport.Namespace)
@js.native
object operatorBufferTimeMod extends js.Object {
  def bufferTime[T](bufferTimeSpan: Double): js.Any = js.native
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: js.UndefOr[Double | Null], maxBufferSize: Double): js.Any = js.native
  def bufferTime[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: js.UndefOr[Double | Null],
    maxBufferSize: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  def bufferTime[T](bufferTimeSpan: Double, bufferCreationInterval: Double): js.Any = js.native
  def bufferTime[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  def bufferTime[T](
    bufferTimeSpan: Double,
    bufferCreationInterval: Null,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  def bufferTime[T](
    bufferTimeSpan: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
}

