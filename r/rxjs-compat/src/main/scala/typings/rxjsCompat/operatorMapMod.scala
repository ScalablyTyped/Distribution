package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorMapMod {
  
  @JSImport("rxjs-compat/operator/map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R]): Observable_[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("map")(project.asInstanceOf[js.Any]).asInstanceOf[Observable_[R]]
  inline def map[T, R](project: js.Function2[/* value */ T, /* index */ Double, R], thisArg: Any): Observable_[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(project.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Observable_[R]]
}
