package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/bufferWhen", JSImport.Namespace)
@js.native
object operatorBufferWhenMod extends js.Object {
  def bufferWhen[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    closingSelector: js.Function0[rxjsLib.rxjsMod.Observable[_]]
  ): rxjsLib.rxjsMod.Observable[js.Array[T]] = js.native
}

