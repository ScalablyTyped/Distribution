package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorRepeatMod {
  
  @JSImport("rxjs-compat/operator/repeat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def repeat[T](): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")().asInstanceOf[Observable_[T]]
  inline def repeat[T](count: Double): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(count.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
}
