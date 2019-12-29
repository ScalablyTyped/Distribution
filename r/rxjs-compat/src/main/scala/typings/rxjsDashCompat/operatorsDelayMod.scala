package typings.rxjsDashCompat

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operators/delay", JSImport.Namespace)
@js.native
object operatorsDelayMod extends js.Object {
  def delay[T](delay: Double): js.Any = js.native
  def delay[T](
    delay: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  def delay[T](delay: Date): js.Any = js.native
  def delay[T](
    delay: Date,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
}

