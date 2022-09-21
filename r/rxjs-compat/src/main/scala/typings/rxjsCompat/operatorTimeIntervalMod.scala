package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorTimeIntervalMod {
  
  @JSImport("rxjs-compat/operator/timeInterval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def timeInterval[T](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")().asInstanceOf[Any]
  inline def timeInterval[T](
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("timeInterval")(scheduler.asInstanceOf[js.Any]).asInstanceOf[Any]
}
