package typings.rxjs

import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalOperatorsRetryWhenMod {
  
  @JSImport("rxjs/internal/operators/retryWhen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def retryWhen[T](notifier: js.Function1[/* errors */ Observable[Any], Observable[Any]]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retryWhen")(notifier.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
}
