package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Notification
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/materialize", JSImport.Namespace)
@js.native
object operatorMaterializeMod extends js.Object {
  def materialize[T](`this`: Observable[T]): Observable[Notification[T]] = js.native
}

