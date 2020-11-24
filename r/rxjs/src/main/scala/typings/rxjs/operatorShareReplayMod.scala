package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/operator/shareReplay", JSImport.Namespace)
@js.native
object operatorShareReplayMod extends js.Object {
  
  def shareReplay[T](): js.Any = js.native
  def shareReplay[T](
    bufferSize: js.UndefOr[scala.Nothing],
    windowTime: js.UndefOr[scala.Nothing],
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  def shareReplay[T](bufferSize: js.UndefOr[scala.Nothing], windowTime: Double): js.Any = js.native
  def shareReplay[T](
    bufferSize: js.UndefOr[scala.Nothing],
    windowTime: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  def shareReplay[T](bufferSize: Double): js.Any = js.native
  def shareReplay[T](
    bufferSize: Double,
    windowTime: js.UndefOr[scala.Nothing],
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  def shareReplay[T](bufferSize: Double, windowTime: Double): js.Any = js.native
  def shareReplay[T](
    bufferSize: Double,
    windowTime: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  def shareReplay[T](
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ShareReplayConfig */ js.Any
  ): js.Any = js.native
}
