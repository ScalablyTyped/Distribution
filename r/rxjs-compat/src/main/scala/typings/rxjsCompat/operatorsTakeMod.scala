package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsTakeMod {
  
  @JSImport("rxjs-compat/operators/take", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def take[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
}
