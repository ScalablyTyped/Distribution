package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/defaultIfEmpty", JSImport.Namespace)
@js.native
object operatorDefaultIfEmptyMod extends js.Object {
  def defaultIfEmpty[T](`this`: rxjsLib.rxjsMod.Observable[T]): rxjsLib.rxjsMod.Observable[T] = js.native
  def defaultIfEmpty[T](`this`: rxjsLib.rxjsMod.Observable[T], defaultValue: T): rxjsLib.rxjsMod.Observable[T] = js.native
  @JSName("defaultIfEmpty")
  def defaultIfEmpty_TR[T, R](`this`: rxjsLib.rxjsMod.Observable[T]): rxjsLib.rxjsMod.Observable[T | R] = js.native
  @JSName("defaultIfEmpty")
  def defaultIfEmpty_TR[T, R](`this`: rxjsLib.rxjsMod.Observable[T], defaultValue: R): rxjsLib.rxjsMod.Observable[T | R] = js.native
}

