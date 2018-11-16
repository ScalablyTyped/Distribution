package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/sequenceEqual", JSImport.Namespace)
@js.native
object operatorSequenceEqualMod extends js.Object {
  def sequenceEqual[T](`this`: rxjsLib.rxjsMod.Observable[T], compareTo: rxjsLib.rxjsMod.Observable[T]): rxjsLib.rxjsMod.Observable[scala.Boolean] = js.native
  def sequenceEqual[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    compareTo: rxjsLib.rxjsMod.Observable[T],
    comparor: js.Function2[/* a */ T, /* b */ T, scala.Boolean]
  ): rxjsLib.rxjsMod.Observable[scala.Boolean] = js.native
}

