package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorTimestampMod {
  
  @JSImport("rxjs-compat/operator/timestamp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def timestamp[T](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")().asInstanceOf[js.Any]
  inline def timestamp[T](
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("timestamp")(scheduler.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
