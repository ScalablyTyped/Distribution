package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/catch", JSImport.Namespace)
@js.native
object operatorCatchMod extends js.Object {
  def _catch[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    selector: js.Function2[
      /* err */ js.Any, 
      /* caught */ rxjsLib.rxjsMod.Observable[T], 
      rxjsLib.internalTypesMod.ObservableInput[R]
    ]
  ): rxjsLib.rxjsMod.Observable[T | R] = js.native
}

