package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorTimeIntervalMod {
  
  @JSImport("rxjs-compat/operator/timeInterval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def timeInterval[T](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")().asInstanceOf[js.Any]
  inline def timeInterval[T](
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")(scheduler.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
