package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsWindowCountMod {
  
  @JSImport("rxjs/internal/operators/windowCount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def windowCount[T](windowSize: Double): OperatorFunction[T, Observable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("windowCount")(windowSize.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Observable[T]]]
  inline def windowCount[T](windowSize: Double, startWindowEvery: Double): OperatorFunction[T, Observable[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("windowCount")(windowSize.asInstanceOf[js.Any], startWindowEvery.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Observable[T]]]
}
