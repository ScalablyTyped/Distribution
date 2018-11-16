package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/windowToggle", JSImport.Namespace)
@js.native
object operatorWindowToggleMod extends js.Object {
  def windowToggle[T, O](
    `this`: rxjsLib.rxjsMod.Observable[T],
    openings: rxjsLib.rxjsMod.Observable[O],
    closingSelector: js.Function1[/* openValue */ O, rxjsLib.rxjsMod.Observable[_]]
  ): rxjsLib.rxjsMod.Observable[rxjsLib.rxjsMod.Observable[T]] = js.native
}

