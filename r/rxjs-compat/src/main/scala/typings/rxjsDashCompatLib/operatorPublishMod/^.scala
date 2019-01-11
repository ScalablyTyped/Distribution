package typings
package rxjsDashCompatLib.operatorPublishMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/publish", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def publish[T](`this`: rxjsLib.rxjsMod.Observable[T]): rxjsLib.rxjsMod.ConnectableObservable[T] = js.native
  def publish[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    selector: js.Function1[/* source */ rxjsLib.rxjsMod.Observable[T], rxjsLib.rxjsMod.Observable[T]]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
  @JSName("publish")
  def publish_TR[T, R](
    `this`: rxjsLib.rxjsMod.Observable[T],
    selector: js.Function1[/* source */ rxjsLib.rxjsMod.Observable[T], rxjsLib.rxjsMod.Observable[R]]
  ): rxjsLib.rxjsMod.Observable[R] = js.native
}

