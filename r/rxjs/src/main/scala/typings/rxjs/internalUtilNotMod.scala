package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalUtilNotMod {
  
  @JSImport("rxjs/internal/util/not", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def not[T](pred: js.Function2[/* value */ T, /* index */ Double, Boolean], thisArg: Any): js.Function2[/* value */ T, /* index */ Double, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("not")(pred.asInstanceOf[js.Any], thisArg.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* value */ T, /* index */ Double, Boolean]]
}
