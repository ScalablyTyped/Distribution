package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorDefaultIfEmptyMod {
  
  @JSImport("rxjs-compat/operator/defaultIfEmpty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultIfEmpty[T](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")().asInstanceOf[js.Any]
  inline def defaultIfEmpty[T](defaultValue: T): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def defaultIfEmpty_TR[T, R](): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")().asInstanceOf[js.Any]
  inline def defaultIfEmpty_TR[T, R](defaultValue: R): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIfEmpty")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
