package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorFindIndexMod {
  
  @JSImport("rxjs-compat/operator/findIndex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findIndex[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean]): Observable_[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any]).asInstanceOf[Observable_[Double]]
  inline def findIndex[T](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean],
    thisArg: Any
  ): Observable_[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndex")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Observable_[Double]]
}
