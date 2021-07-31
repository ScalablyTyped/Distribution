package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorShareReplayMod {
  
  @JSImport("rxjs-compat/operator/shareReplay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def shareReplay[T](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")().asInstanceOf[js.Any]
  @scala.inline
  def shareReplay[T](bufferSize: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def shareReplay[T](bufferSize: Double, windowTime: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def shareReplay[T](
    bufferSize: Double,
    windowTime: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def shareReplay[T](
    bufferSize: Double,
    windowTime: Unit,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def shareReplay[T](bufferSize: Unit, windowTime: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def shareReplay[T](
    bufferSize: Unit,
    windowTime: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def shareReplay[T](
    bufferSize: Unit,
    windowTime: Unit,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def shareReplay[T](
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ShareReplayConfig */ js.Any
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("shareReplay")(config.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
