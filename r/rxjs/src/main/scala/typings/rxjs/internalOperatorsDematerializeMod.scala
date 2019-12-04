package typings.rxjs

import typings.rxjs.internalNotificationMod.Notification
import typings.rxjs.internalTypesMod.OperatorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/operators/dematerialize", JSImport.Namespace)
@js.native
object internalOperatorsDematerializeMod extends js.Object {
  def dematerialize[T](): OperatorFunction[Notification[T], T] = js.native
}

