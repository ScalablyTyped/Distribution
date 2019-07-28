package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/windowWhen", JSImport.Namespace)
@js.native
object operatorWindowWhenMod extends js.Object {
  def windowWhen[T](`this`: Observable[T], closingSelector: js.Function0[Observable[_]]): Observable[Observable[T]] = js.native
}

