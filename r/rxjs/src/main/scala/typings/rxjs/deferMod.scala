package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.typesMod.ObservableInput
import typings.rxjs.typesMod.ObservedValueOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deferMod {
  
  @JSImport("rxjs/internal/observable/defer", "defer")
  @js.native
  def defer[R /* <: ObservableInput[_] | Unit */](observableFactory: js.Function0[R]): Observable[ObservedValueOf[R]] = js.native
}
