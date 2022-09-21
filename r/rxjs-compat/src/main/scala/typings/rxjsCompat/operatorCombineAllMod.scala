package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorCombineAllMod {
  
  @JSImport("rxjs-compat/operator/combineAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineAll[T](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("combineAll")().asInstanceOf[Any]
  inline def combineAll[R](project: js.Function1[/* repeated */ Any, R]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("combineAll")(project.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def combineAll_TR[T, R](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("combineAll")().asInstanceOf[Any]
  inline def combineAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("combineAll")(project.asInstanceOf[js.Any]).asInstanceOf[Any]
}
