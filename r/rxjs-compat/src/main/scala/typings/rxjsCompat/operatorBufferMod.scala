package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorBufferMod {
  
  @JSImport("rxjs-compat/operator/buffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buffer[T](closingNotifier: Observable_[Any]): Observable_[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("buffer")(closingNotifier.asInstanceOf[js.Any]).asInstanceOf[Observable_[js.Array[T]]]
}
