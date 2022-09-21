package typings.rxjsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementAtMod {
  
  @JSImport("rxjs-compat/operators/elementAt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def elementAt[T](index: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("elementAt")(index.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def elementAt[T](index: Double, defaultValue: T): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("elementAt")(index.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[Any]
}
