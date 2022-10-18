package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsTakeLastMod {
  
  @JSImport("rxjs-compat/operators/takeLast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def takeLast[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeLast")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
}
