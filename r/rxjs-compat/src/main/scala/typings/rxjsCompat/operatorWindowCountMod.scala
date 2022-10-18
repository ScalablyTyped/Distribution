package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorWindowCountMod {
  
  @JSImport("rxjs-compat/operator/windowCount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def windowCount[T](windowSize: Double): Observable_[Observable_[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("windowCount")(windowSize.asInstanceOf[js.Any]).asInstanceOf[Observable_[Observable_[T]]]
  inline def windowCount[T](windowSize: Double, startWindowEvery: Double): Observable_[Observable_[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowCount")(windowSize.asInstanceOf[js.Any], startWindowEvery.asInstanceOf[js.Any])).asInstanceOf[Observable_[Observable_[T]]]
}
