package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.Notification
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/dematerialize", JSImport.Namespace)
@js.native
object operatorDematerializeMod extends js.Object {
  def dematerialize[T](`this`: Observable[Notification[T]]): Observable[T] = js.native
}

