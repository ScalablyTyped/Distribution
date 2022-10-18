package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorSampleMod {
  
  @JSImport("rxjs-compat/operator/sample", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sample[T](notifier: Observable_[Any]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("sample")(notifier.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
}
