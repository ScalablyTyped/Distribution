package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorRetryMod {
  
  @JSImport("rxjs-compat/operator/retry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def retry[T](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")().asInstanceOf[js.Any]
  inline def retry[T](count: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")(count.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
