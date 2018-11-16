package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/retryWhen", JSImport.Namespace)
@js.native
object operatorRetryWhenMod extends js.Object {
  def retryWhen[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    notifier: js.Function1[/* errors */ rxjsLib.rxjsMod.Observable[_], rxjsLib.rxjsMod.Observable[_]]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
}

