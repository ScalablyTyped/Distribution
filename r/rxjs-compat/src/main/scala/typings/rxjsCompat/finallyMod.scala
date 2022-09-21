package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object finallyMod {
  
  @JSImport("rxjs-compat/operator/finally", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def `finally`[T](callback: js.Function0[Unit]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_finally")(callback.asInstanceOf[js.Any]).asInstanceOf[Any]
}
