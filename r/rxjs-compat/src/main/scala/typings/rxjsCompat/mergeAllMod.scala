package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeAllMod {
  
  @JSImport("rxjs-compat/operators/mergeAll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeAll[T](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")().asInstanceOf[Any]
  inline def mergeAll[T](concurrent: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")(concurrent.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def mergeAll_TR[T, R](): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")().asInstanceOf[Any]
  inline def mergeAll_TR[T, R](concurrent: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeAll")(concurrent.asInstanceOf[js.Any]).asInstanceOf[Any]
}
