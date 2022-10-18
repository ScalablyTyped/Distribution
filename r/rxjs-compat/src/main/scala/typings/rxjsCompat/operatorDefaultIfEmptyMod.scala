package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorDefaultIfEmptyMod {
  
  @JSImport("rxjs-compat/operator/defaultIfEmpty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultIfEmpty[T](): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")().asInstanceOf[Observable_[T]]
  inline def defaultIfEmpty[T](defaultValue: T): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  
  inline def defaultIfEmpty_TR[T, R](): Observable_[T | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")().asInstanceOf[Observable_[T | R]]
  inline def defaultIfEmpty_TR[T, R](defaultValue: R): Observable_[T | R] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Observable_[T | R]]
}
