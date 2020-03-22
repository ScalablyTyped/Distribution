package typings.rxjsCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallThisBufferSizeWindowTimeSelectorScheduler extends js.Object {
  def apply[T](): js.Any = js.native
  def apply[T](bufferSize: Double): js.Any = js.native
  def apply[T](bufferSize: Double, windowTime: Double): js.Any = js.native
  def apply[T](
    bufferSize: Double,
    windowTime: Double,
    selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  def apply[T](
    bufferSize: Double,
    windowTime: Double,
    selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ js.Any,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
}

