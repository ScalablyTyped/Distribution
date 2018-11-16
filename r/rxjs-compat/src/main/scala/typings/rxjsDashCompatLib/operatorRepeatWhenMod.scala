package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/repeatWhen", JSImport.Namespace)
@js.native
object operatorRepeatWhenMod extends js.Object {
  def repeatWhen[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    notifier: js.Function1[/* notifications */ rxjsLib.rxjsMod.Observable[_], rxjsLib.rxjsMod.Observable[_]]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
}

