package typings
package atReduxDashSagaDeferredLib.atReduxDashSagaDeferredMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deferred[R] extends js.Object {
  var promise: js.Promise[R]
  def reject(error: js.Any): scala.Unit
  def resolve(result: R): scala.Unit
}

object Deferred {
  @scala.inline
  def apply[R](
    promise: js.Promise[R],
    reject: js.Function1[js.Any, scala.Unit],
    resolve: js.Function1[R, scala.Unit]
  ): Deferred[R] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("promise")(promise)
    __obj.updateDynamic("reject")(reject)
    __obj.updateDynamic("resolve")(resolve)
    __obj.asInstanceOf[Deferred[R]]
  }
}

