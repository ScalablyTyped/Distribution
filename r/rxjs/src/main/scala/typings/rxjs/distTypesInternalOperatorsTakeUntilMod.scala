package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsTakeUntilMod {
  
  @JSImport("rxjs/dist/types/internal/operators/takeUntil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def takeUntil[T](notifier: ObservableInput[Any]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("takeUntil")(notifier.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
}
