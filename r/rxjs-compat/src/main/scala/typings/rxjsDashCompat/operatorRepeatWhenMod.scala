package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/repeatWhen", JSImport.Namespace)
@js.native
object operatorRepeatWhenMod extends js.Object {
  def repeatWhen[T](`this`: Observable[T], notifier: js.Function1[/* notifications */ Observable[_], Observable[_]]): Observable[T] = js.native
}

