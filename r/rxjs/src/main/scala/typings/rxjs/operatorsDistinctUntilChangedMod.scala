package typings.rxjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsDistinctUntilChangedMod {
  
  @JSImport("rxjs/operators/distinctUntilChanged", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def distinctUntilChanged[T](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilChanged")().asInstanceOf[js.Any]
  inline def distinctUntilChanged[T](compare: js.Function2[/* x */ T, /* y */ T, Boolean]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilChanged")(compare.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def distinctUntilChanged[T, K](compare: js.Function2[/* x */ K, /* y */ K, Boolean], keySelector: js.Function1[/* x */ T, K]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distinctUntilChanged")(compare.asInstanceOf[js.Any], keySelector.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
