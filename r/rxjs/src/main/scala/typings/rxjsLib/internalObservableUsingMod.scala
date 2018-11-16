package typings
package rxjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/using", JSImport.Namespace)
@js.native
object internalObservableUsingMod extends js.Object {
  def using[T](
    resourceFactory: js.Function0[rxjsLib.internalTypesMod.Unsubscribable | scala.Unit],
    observableFactory: js.Function1[
      /* resource */ rxjsLib.internalTypesMod.Unsubscribable | scala.Unit, 
      rxjsLib.internalTypesMod.ObservableInput[T] | scala.Unit
    ]
  ): rxjsLib.internalObservableMod.Observable[T] = js.native
}

