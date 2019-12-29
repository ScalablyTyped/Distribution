package typings.rxjsDashCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/windowTime", JSImport.Namespace)
@js.native
object operatorWindowTimeMod extends js.Object {
  def windowTime[T](windowTimeSpan: Double): js.Any = js.native
  def windowTime[T](
    windowTimeSpan: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double): js.Any = js.native
  def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, maxWindowSize: Double): js.Any = js.native
  def windowTime[T](
    windowTimeSpan: Double,
    windowCreationInterval: Double,
    maxWindowSize: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  def windowTime[T](
    windowTimeSpan: Double,
    windowCreationInterval: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
}

