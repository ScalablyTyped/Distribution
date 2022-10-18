package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorConcatAllMod {
  
  @JSImport("rxjs-compat/operator/concatAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatAll[T](): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatAll")().asInstanceOf[Observable_[T]]
  
  inline def concatAll_TR[T, R](): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatAll")().asInstanceOf[Observable_[R]]
}
