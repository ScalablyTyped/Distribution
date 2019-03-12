package typings
package reactDashReconcilerLib.reactDashReconcilerMod.ReactReconcilerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// react-reconciler/ReactUpdateQueue
trait Update[State] extends js.Object {
  var callback: js.Function0[_] | scala.Null
  var expirationTime: ExpirationTime
  var next: Update[State] | scala.Null
  var nextEffect: Update[State] | scala.Null
  var payload: js.Any
  var tag: reactDashReconcilerLib.reactDashReconcilerLibNumbers.`0` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`1` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`2` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`3`
}

object Update {
  @scala.inline
  def apply[State](
    expirationTime: ExpirationTime,
    payload: js.Any,
    tag: reactDashReconcilerLib.reactDashReconcilerLibNumbers.`0` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`1` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`2` | reactDashReconcilerLib.reactDashReconcilerLibNumbers.`3`,
    callback: () => _ = null,
    next: Update[State] = null,
    nextEffect: Update[State] = null
  ): Update[State] = {
    val __obj = js.Dynamic.literal(expirationTime = expirationTime, payload = payload, tag = tag.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (next != null) __obj.updateDynamic("next")(next)
    if (nextEffect != null) __obj.updateDynamic("nextEffect")(nextEffect)
    __obj.asInstanceOf[Update[State]]
  }
}

