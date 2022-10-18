package typings.rxjsCompat

import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorEveryMod {
  
  @JSImport("rxjs-compat/operator/every", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def every[T](predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean]): Observable_[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any]).asInstanceOf[Observable_[Boolean]]
  inline def every[T](
    predicate: js.Function3[/* value */ T, /* index */ Double, /* source */ Observable_[T], Boolean],
    thisArg: Any
  ): Observable_[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(predicate.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[Observable_[Boolean]]
}
