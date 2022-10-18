package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsTakeMod {
  
  @JSImport("rxjs/internal/operators/take", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def take[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("take")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
}
