package typings.reactReconciler.mod

import typings.reactReconciler.reactReconcilerNumbers.`0`
import typings.reactReconciler.reactReconcilerNumbers.`1`
import typings.reactReconciler.reactReconcilerNumbers.`2`
import typings.reactReconciler.reactReconcilerNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// react-reconciler/ReactUpdateQueue
trait Update[State] extends js.Object {
  var callback: js.Function0[_] | Null
  var expirationTime: ExpirationTime
  var next: Update[State] | Null
  var nextEffect: Update[State] | Null
  var payload: js.Any
  var tag: `0` | `1` | `2` | `3`
}

object Update {
  @scala.inline
  def apply[State](
    expirationTime: ExpirationTime,
    payload: js.Any,
    tag: `0` | `1` | `2` | `3`,
    callback: () => _ = null,
    next: Update[State] = null,
    nextEffect: Update[State] = null
  ): Update[State] = {
    val __obj = js.Dynamic.literal(expirationTime = expirationTime.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], callback = js.Any.fromFunction0(callback), next = next.asInstanceOf[js.Any], nextEffect = nextEffect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update[State]]
  }
}

