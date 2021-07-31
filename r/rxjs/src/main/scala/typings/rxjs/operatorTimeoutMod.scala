package typings.rxjs

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorTimeoutMod {
  
  @JSImport("rxjs/operator/timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def timeout[T](due: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(due.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def timeout[T](
    due: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(due.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def timeout[T](due: Date): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(due.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def timeout[T](
    due: Date,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(due.asInstanceOf[js.Any], scheduler.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
