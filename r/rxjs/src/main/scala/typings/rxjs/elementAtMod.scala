package typings.rxjs

import typings.rxjs.internalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementAtMod {
  
  @JSImport("rxjs/dist/types/internal/operators/elementAt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def elementAt[T, D](index: Double): OperatorFunction[T, T | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("elementAt")(index.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, T | D]]
  inline def elementAt[T, D](index: Double, defaultValue: D): OperatorFunction[T, T | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("elementAt")(index.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, T | D]]
}
