package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/let", JSImport.Namespace)
@js.native
object operatorLetMod extends js.Object {
  def letProto[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    func: js.Function1[/* selector */ rxjsLib.rxjsMod.Observable[T], rxjsLib.rxjsMod.Observable[R]]
  ): rxjsLib.rxjsMod.Observable[R] = js.native
}

