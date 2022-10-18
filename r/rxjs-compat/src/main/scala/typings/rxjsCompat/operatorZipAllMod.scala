package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorZipAllMod {
  
  @JSImport("rxjs-compat/operator/zipAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zipAll[T](): Observable_[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")().asInstanceOf[Observable_[js.Array[T]]]
  inline def zipAll[R](project: js.Function1[/* repeated */ Any, R]): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")(project.asInstanceOf[js.Any]).asInstanceOf[Observable_[R]]
  
  inline def zipAll_TR[T, R](): Observable_[js.Array[R]] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")().asInstanceOf[Observable_[js.Array[R]]]
  inline def zipAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")(project.asInstanceOf[js.Any]).asInstanceOf[Observable_[R]]
}
