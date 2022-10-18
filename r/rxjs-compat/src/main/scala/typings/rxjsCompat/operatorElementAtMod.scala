package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorElementAtMod {
  
  @JSImport("rxjs-compat/operator/elementAt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def elementAt[T](index: Double): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("elementAt")(index.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  inline def elementAt[T](index: Double, defaultValue: T): Observable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("elementAt")(index.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Observable_[T]]
}
