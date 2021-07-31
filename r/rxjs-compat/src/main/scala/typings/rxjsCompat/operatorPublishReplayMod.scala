package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorPublishReplayMod {
  
  @JSImport("rxjs-compat/operator/publishReplay", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def publishReplay[T](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")().asInstanceOf[js.Any]
  @scala.inline
  def publishReplay[T](bufferSize: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def publishReplay[T](bufferSize: Double, windowTime: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def publishReplay[T](
    bufferSize: Double,
    windowTime: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def publishReplay[T](
    bufferSize: Double,
    windowTime: Double,
    selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ js.Any,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def publishReplay[T](
    bufferSize: Double,
    windowTime: Double,
    selector: Unit,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def publishReplay[T](
    bufferSize: Double,
    windowTime: Unit,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def publishReplay[T](
    bufferSize: Double,
    windowTime: Unit,
    selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ js.Any,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def publishReplay[T](
    bufferSize: Double,
    windowTime: Unit,
    selector: Unit,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def publishReplay[T](bufferSize: Unit, windowTime: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def publishReplay[T](
    bufferSize: Unit,
    windowTime: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def publishReplay[T](
    bufferSize: Unit,
    windowTime: Double,
    selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ js.Any,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def publishReplay[T](
    bufferSize: Unit,
    windowTime: Double,
    selector: Unit,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def publishReplay[T](
    bufferSize: Unit,
    windowTime: Unit,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def publishReplay[T](
    bufferSize: Unit,
    windowTime: Unit,
    selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<T> */ js.Any,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def publishReplay[T](
    bufferSize: Unit,
    windowTime: Unit,
    selector: Unit,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def publishReplay_TR[T, R](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")().asInstanceOf[js.Any]
  @scala.inline
  def publishReplay_TR[T, R](bufferSize: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def publishReplay_TR[T, R](bufferSize: Double, windowTime: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def publishReplay_TR[T, R](
    bufferSize: Double,
    windowTime: Double,
    selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperatorFunction<T, R> */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def publishReplay_TR[T, R](
    bufferSize: Double,
    windowTime: Unit,
    selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperatorFunction<T, R> */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def publishReplay_TR[T, R](bufferSize: Unit, windowTime: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def publishReplay_TR[T, R](
    bufferSize: Unit,
    windowTime: Double,
    selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperatorFunction<T, R> */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def publishReplay_TR[T, R](
    bufferSize: Unit,
    windowTime: Unit,
    selector: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OperatorFunction<T, R> */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("publishReplay")(bufferSize.asInstanceOf[js.Any], windowTime.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
