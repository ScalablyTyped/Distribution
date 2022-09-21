package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zipAllMod {
  
  @JSImport("rxjs-compat/operators/zipAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zipAll[T](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")().asInstanceOf[Any]
  inline def zipAll[R](project: js.Function1[/* repeated */ Any, R]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")(project.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def zipAll_TR[T, R](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")().asInstanceOf[Any]
  inline def zipAll_TR[T, R](project: js.Function1[/* repeated */ T, R]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("zipAll")(project.asInstanceOf[js.Any]).asInstanceOf[Any]
}
