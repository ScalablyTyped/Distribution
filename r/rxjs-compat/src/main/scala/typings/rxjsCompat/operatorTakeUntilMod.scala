package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorTakeUntilMod {
  
  @JSImport("rxjs-compat/operator/takeUntil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def takeUntil[T](
    notifier: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<any> */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("takeUntil")(notifier.asInstanceOf[js.Any]).asInstanceOf[Any]
}
