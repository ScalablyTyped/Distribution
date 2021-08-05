package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object combineAllMod {
  
  @JSImport("rxjs-compat/operators/combineAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineAll[T](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("combineAll")().asInstanceOf[js.Any]
  inline def combineAll[R](project: js.Function1[/* repeated */ js.Any, R]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("combineAll")(project.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def combineAll_TR[T, R](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("combineAll")().asInstanceOf[js.Any]
  inline def combineAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("combineAll")(project.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
