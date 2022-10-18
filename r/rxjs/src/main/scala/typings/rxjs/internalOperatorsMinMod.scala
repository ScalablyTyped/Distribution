package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsMinMod {
  
  @JSImport("rxjs/internal/operators/min", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def min[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def min[T](comparer: js.Function2[/* x */ T, /* y */ T, Double]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(comparer.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
}
