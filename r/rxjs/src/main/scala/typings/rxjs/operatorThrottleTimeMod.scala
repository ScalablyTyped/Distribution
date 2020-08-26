package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/operator/throttleTime", JSImport.Namespace)
@js.native
object operatorThrottleTimeMod extends js.Object {
  def throttleTime[T](duration: Double): js.Any = js.native
  def throttleTime[T](
    duration: Double,
    scheduler: js.UndefOr[scala.Nothing],
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThrottleConfig */ js.Any
  ): js.Any = js.native
  def throttleTime[T](
    duration: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  def throttleTime[T](
    duration: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any,
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThrottleConfig */ js.Any
  ): js.Any = js.native
}

