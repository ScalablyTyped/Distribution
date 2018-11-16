package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/windowWhen", JSImport.Namespace)
@js.native
object operatorWindowWhenMod extends js.Object {
  def windowWhen[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    closingSelector: js.Function0[rxjsLib.rxjsMod.Observable[_]]
  ): rxjsLib.rxjsMod.Observable[rxjsLib.rxjsMod.Observable[T]] = js.native
}

