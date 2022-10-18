package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsSequenceEqualMod {
  
  @JSImport("rxjs/dist/types/internal/operators/sequenceEqual", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sequenceEqual[T](compareTo: Observable[T]): OperatorFunction[T, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("sequenceEqual")(compareTo.asInstanceOf[js.Any]).asInstanceOf[OperatorFunction[T, Boolean]]
  inline def sequenceEqual[T](compareTo: Observable[T], comparator: js.Function2[/* a */ T, /* b */ T, Boolean]): OperatorFunction[T, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("sequenceEqual")(compareTo.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[OperatorFunction[T, Boolean]]
}
