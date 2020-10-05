package typings.rxjsCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs-compat/operators/throttleTime", JSImport.Namespace)
@js.native
object throttleTimeMod extends js.Object {
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

