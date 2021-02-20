package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.MonoTypeOperatorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryWhenMod {
  
  @JSImport("rxjs/internal/operators/retryWhen", "retryWhen")
  @js.native
  def retryWhen[T](notifier: js.Function1[/* errors */ Observable[_], Observable[_]]): MonoTypeOperatorFunction[T] = js.native
}
