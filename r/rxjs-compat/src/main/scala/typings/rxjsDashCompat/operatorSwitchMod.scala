package typings.rxjsDashCompat

import typings.rxjs.internalTypesMod.ObservableInput
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/switch", JSImport.Namespace)
@js.native
object operatorSwitchMod extends js.Object {
  def _switch[T](`this`: Observable[ObservableInput[T]]): Observable[T] = js.native
  @JSName("_switch")
  def _switch_TR[T, R](`this`: Observable[T]): Observable[R] = js.native
}

