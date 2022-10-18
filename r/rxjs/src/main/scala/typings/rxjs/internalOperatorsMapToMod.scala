package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsMapToMod {
  
  @JSImport("rxjs/internal/operators/mapTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapTo[R](value: R): OperatorFunction[Any, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapTo")(value.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[Any, R]]
  
  inline def mapTo_TR[T, R](value: R): OperatorFunction[T, R] = ^.asInstanceOf[js.Dynamic].applyDynamic("mapTo")(value.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, R]]
}
