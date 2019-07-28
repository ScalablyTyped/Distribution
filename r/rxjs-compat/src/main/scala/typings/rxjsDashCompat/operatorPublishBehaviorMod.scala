package typings.rxjsDashCompat

import typings.rxjs.rxjsMod.ConnectableObservable
import typings.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/publishBehavior", JSImport.Namespace)
@js.native
object operatorPublishBehaviorMod extends js.Object {
  def publishBehavior[T](`this`: Observable[T], value: T): ConnectableObservable[T] = js.native
}

