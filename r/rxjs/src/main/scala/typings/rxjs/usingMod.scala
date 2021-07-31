package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.Unsubscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usingMod {
  
  @JSImport("rxjs/internal/observable/using", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def `using`[T](
    resourceFactory: js.Function0[Unsubscribable | Unit],
    observableFactory: js.Function1[/* resource */ Unsubscribable | Unit, ObservableInput[T] | Unit]
  ): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("using")(resourceFactory.asInstanceOf[js.Any], observableFactory.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
}
