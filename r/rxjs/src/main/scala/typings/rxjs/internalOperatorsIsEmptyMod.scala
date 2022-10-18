package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsIsEmptyMod {
  
  @JSImport("rxjs/internal/operators/isEmpty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isEmpty[T](): OperatorFunction[T, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")().asInstanceOf[OperatorFunction[T, Boolean]]
}
