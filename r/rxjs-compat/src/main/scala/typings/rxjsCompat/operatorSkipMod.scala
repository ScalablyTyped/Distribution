package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorSkipMod {
  
  @JSImport("rxjs-compat/operator/skip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def skip[T](count: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("skip")(count.asInstanceOf[js.Any]).asInstanceOf[Any]
}
