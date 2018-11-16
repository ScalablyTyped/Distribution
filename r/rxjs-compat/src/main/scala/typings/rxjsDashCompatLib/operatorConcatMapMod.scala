package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/concatMap", JSImport.Namespace)
@js.native
object operatorConcatMapMod extends js.Object {
  def concatMap[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    project: js.Function2[/* value */ T, /* index */ scala.Double, rxjsLib.internalTypesMod.ObservableInput[R]]
  ): rxjsLib.rxjsMod.Observable[R] = js.native
}

