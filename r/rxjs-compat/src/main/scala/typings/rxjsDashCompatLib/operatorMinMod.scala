package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/min", JSImport.Namespace)
@js.native
object operatorMinMod extends js.Object {
  def min[T](`this`: rxjsLib.rxjsMod.Observable[T]): rxjsLib.rxjsMod.Observable[T] = js.native
  def min[T](`this`: rxjsLib.rxjsMod.Observable[T], comparer: js.Function2[/* x */ T, /* y */ T, scala.Double]): rxjsLib.rxjsMod.Observable[T] = js.native
}

