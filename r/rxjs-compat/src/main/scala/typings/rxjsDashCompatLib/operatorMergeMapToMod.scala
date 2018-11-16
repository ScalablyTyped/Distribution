package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/mergeMapTo", JSImport.Namespace)
@js.native
object operatorMergeMapToMod extends js.Object {
  def mergeMapTo[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    innerObservable: rxjsLib.internalTypesMod.ObservableInput[R]
  ): rxjsLib.rxjsMod.Observable[R] = js.native
  def mergeMapTo[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    innerObservable: rxjsLib.internalTypesMod.ObservableInput[R],
    concurrent: scala.Double
  ): rxjsLib.rxjsMod.Observable[R] = js.native
}

