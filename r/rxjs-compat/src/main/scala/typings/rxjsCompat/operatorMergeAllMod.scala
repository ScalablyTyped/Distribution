package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorMergeAllMod {
  
  @JSImport("rxjs-compat/operator/mergeAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeAll[T](): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")().asInstanceOf[Observable_[T]]
  inline def mergeAll[T](concurrent: Double): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")(concurrent.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  
  inline def mergeAll_TR[T, R](): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")().asInstanceOf[Observable_[R]]
  inline def mergeAll_TR[T, R](concurrent: Double): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")(concurrent.asInstanceOf[js.Any]).asInstanceOf[Observable_[R]]
}
