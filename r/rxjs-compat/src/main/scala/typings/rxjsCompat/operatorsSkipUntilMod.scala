package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object operatorsSkipUntilMod {
  
  @JSImport("rxjs-compat/operators/skipUntil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def skipUntil[T](notifier: ObservableInput[Any]): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("skipUntil")(notifier.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
}
