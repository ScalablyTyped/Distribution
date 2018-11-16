package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/exhaustMap", JSImport.Namespace)
@js.native
object operatorExhaustMapMod extends js.Object {
  def exhaustMap[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    project: js.Function2[/* value */ T, /* index */ scala.Double, rxjsLib.internalTypesMod.ObservableInput[R]]
  ): rxjsLib.rxjsMod.Observable[R] = js.native
}

