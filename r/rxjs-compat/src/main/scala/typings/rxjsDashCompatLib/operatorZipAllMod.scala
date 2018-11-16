package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/zipAll", JSImport.Namespace)
@js.native
object operatorZipAllMod extends js.Object {
  def zipAll[T](`this`: rxjsLib.rxjsMod.Observable[rxjsLib.internalTypesMod.ObservableInput[T]]): rxjsLib.rxjsMod.Observable[js.Array[T]] = js.native
  def zipAll[R](`this`: rxjsLib.rxjsMod.Observable[_], project: js.Function1[/* repeated */js.Any, R]): rxjsLib.rxjsMod.Observable[R] = js.native
  @JSName("zipAll")
  def zipAll_TR[T, R](`this`: rxjsLib.rxjsMod.Observable[T]): rxjsLib.rxjsMod.Observable[js.Array[R]] = js.native
  @JSName("zipAll")
  def zipAll_TR[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T | rxjsLib.internalTypesMod.ObservableInput[T]],
    project: js.Function1[/* repeated */T, R]
  ): rxjsLib.rxjsMod.Observable[R] = js.native
}

