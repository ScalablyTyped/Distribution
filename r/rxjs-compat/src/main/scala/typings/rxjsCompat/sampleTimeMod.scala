package typings.rxjsCompat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs-compat/operators/sampleTime", JSImport.Namespace)
@js.native
object sampleTimeMod extends js.Object {
  def sampleTime[T](period: Double): js.Any = js.native
  def sampleTime[T](
    period: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
}

