package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repeatWhenMod {
  
  @JSImport("rxjs/dist/types/internal/operators/repeatWhen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def repeatWhen[T](notifier: js.Function1[/* notifications */ Observable[Unit], Observable[Any]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeatWhen")(notifier.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
}
