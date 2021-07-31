package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsObserveOnMod {
  
  @JSImport("rxjs/operators/observeOn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def observeOn[T](
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("observeOn")(scheduler.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def observeOn[T](
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any,
    delay: Double
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("observeOn")(scheduler.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
