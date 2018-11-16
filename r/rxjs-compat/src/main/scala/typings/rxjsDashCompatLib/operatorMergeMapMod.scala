package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/mergeMap", JSImport.Namespace)
@js.native
object operatorMergeMapMod extends js.Object {
  def mergeMap[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    project: js.Function2[/* value */ T, /* index */ scala.Double, rxjsLib.internalTypesMod.ObservableInput[R]]
  ): rxjsLib.rxjsMod.Observable[R] = js.native
  def mergeMap[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    project: js.Function2[/* value */ T, /* index */ scala.Double, rxjsLib.internalTypesMod.ObservableInput[R]],
    concurrent: scala.Double
  ): rxjsLib.rxjsMod.Observable[R] = js.native
}

