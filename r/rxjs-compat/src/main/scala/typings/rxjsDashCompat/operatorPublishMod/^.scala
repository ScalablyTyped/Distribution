package typings.rxjsDashCompat.operatorPublishMod

import typings.rxjs.rxjsMod.ConnectableObservable
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/publish", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def publish[T](`this`: Observable[T]): ConnectableObservable[T] = js.native
  def publish[T](`this`: Observable[T], selector: js.Function1[/* source */ Observable[T], Observable[T]]): Observable[T] = js.native
  @JSName("publish")
  def publish_TR[T, R](`this`: Observable[T], selector: js.Function1[/* source */ Observable[T], Observable[R]]): Observable[R] = js.native
}

