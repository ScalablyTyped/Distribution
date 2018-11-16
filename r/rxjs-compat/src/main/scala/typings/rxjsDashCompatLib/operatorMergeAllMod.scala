package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/mergeAll", JSImport.Namespace)
@js.native
object operatorMergeAllMod extends js.Object {
  def mergeAll[T](`this`: rxjsLib.rxjsMod.Observable[rxjsLib.internalTypesMod.ObservableInput[T]]): rxjsLib.rxjsMod.Observable[T] = js.native
  def mergeAll[T](
    `this`: rxjsLib.rxjsMod.Observable[rxjsLib.internalTypesMod.ObservableInput[T]],
    concurrent: scala.Double
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  @JSName("mergeAll")
  def mergeAll_TR[T, R](`this`: rxjsLib.rxjsMod.Observable[T]): rxjsLib.rxjsMod.Observable[R] = js.native
  @JSName("mergeAll")
  def mergeAll_TR[T, R](`this`: rxjsLib.rxjsMod.Observable[T], concurrent: scala.Double): rxjsLib.rxjsMod.Observable[R] = js.native
}

