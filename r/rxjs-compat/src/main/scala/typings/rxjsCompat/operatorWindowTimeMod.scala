package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorWindowTimeMod {
  
  @JSImport("rxjs-compat/operator/windowTime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def windowTime[T](windowTimeSpan: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def windowTime[T](
    windowTimeSpan: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def windowTime[T](windowTimeSpan: Double, windowCreationInterval: Double, maxWindowSize: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], maxWindowSize.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def windowTime[T](
    windowTimeSpan: Double,
    windowCreationInterval: Double,
    maxWindowSize: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], maxWindowSize.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def windowTime[T](
    windowTimeSpan: Double,
    windowCreationInterval: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("windowTime")(windowTimeSpan.asInstanceOf[js.Any], windowCreationInterval.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
