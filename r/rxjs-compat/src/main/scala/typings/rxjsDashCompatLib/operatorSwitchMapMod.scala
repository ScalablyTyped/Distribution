package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/switchMap", JSImport.Namespace)
@js.native
object operatorSwitchMapMod extends js.Object {
  def switchMap[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    project: js.Function2[/* value */ T, /* index */ scala.Double, rxjsLib.internalTypesMod.ObservableInput[R]]
  ): rxjsLib.rxjsMod.Observable[R] = js.native
}

