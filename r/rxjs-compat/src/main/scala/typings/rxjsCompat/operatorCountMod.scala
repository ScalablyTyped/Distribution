package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorCountMod {
  
  @JSImport("rxjs-compat/operator/count", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def count[T](): Observable_[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[Observable_[Double]]
  inline def count[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean]): Observable_[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(predicate.asInstanceOf[js.Any]).asInstanceOf[Observable_[Double]]
}
