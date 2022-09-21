package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorContextMod {
  
  @JSImport("rxjs/dist/types/internal/util/errorContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def captureError(err: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("captureError")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def errorContext(cb: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("errorContext")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
