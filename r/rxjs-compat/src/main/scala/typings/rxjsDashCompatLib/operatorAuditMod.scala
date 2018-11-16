package typings
package rxjsDashCompatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat/operator/audit", JSImport.Namespace)
@js.native
object operatorAuditMod extends js.Object {
  def audit[T](
    `this`: rxjsLib.rxjsMod.Observable[T],
    durationSelector: js.Function1[/* value */ T, rxjsLib.internalTypesMod.SubscribableOrPromise[_]]
  ): rxjsLib.rxjsMod.Observable[T] = js.native
}

