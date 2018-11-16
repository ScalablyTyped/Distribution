package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/switchMapTo", JSImport.Namespace)
@js.native
object operatorSwitchMapToMod extends js.Object {
  def switchMapTo[T, R](`this`: rxjsLib.rxjsMod.Observable[T], observable: rxjsLib.internalTypesMod.ObservableInput[R]): rxjsLib.rxjsMod.Observable[R] = js.native
  def switchMapTo[T, I, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    observable: rxjsLib.internalTypesMod.ObservableInput[I],
    resultSelector: js.Function4[
      /* outerValue */ T, 
      /* innerValue */ I, 
      /* outerIndex */ scala.Double, 
      /* innerIndex */ scala.Double, 
      R
    ]
  ): rxjsLib.rxjsMod.Observable[R] = js.native
}

