package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorLetMod {
  
  @JSImport("rxjs-compat/operator/let", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def letProto[T, R](func: js.Function1[/* selector */ Observable_[T], Observable_[R]]): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("letProto")(func.asInstanceOf[js.Any]).asInstanceOf[Observable_[R]]
}
