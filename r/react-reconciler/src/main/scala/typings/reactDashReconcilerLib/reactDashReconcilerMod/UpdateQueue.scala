package typings
package reactDashReconcilerLib.reactDashReconcilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateQueue[State] extends js.Object {
  var baseState: State
  var firstCapturedEffect: Update[State] | scala.Null
  var firstCapturedUpdate: Update[State] | scala.Null
  var firstEffect: Update[State] | scala.Null
  var firstUpdate: Update[State] | scala.Null
  var lastCapturedEffect: Update[State] | scala.Null
  var lastCapturedUpdate: Update[State] | scala.Null
  var lastEffect: Update[State] | scala.Null
  var lastUpdate: Update[State] | scala.Null
}

object UpdateQueue {
  @scala.inline
  def apply[State](
    baseState: State,
    firstCapturedEffect: Update[State] = null,
    firstCapturedUpdate: Update[State] = null,
    firstEffect: Update[State] = null,
    firstUpdate: Update[State] = null,
    lastCapturedEffect: Update[State] = null,
    lastCapturedUpdate: Update[State] = null,
    lastEffect: Update[State] = null,
    lastUpdate: Update[State] = null
  ): UpdateQueue[State] = {
    val __obj = js.Dynamic.literal(baseState = baseState.asInstanceOf[js.Any])
    if (firstCapturedEffect != null) __obj.updateDynamic("firstCapturedEffect")(firstCapturedEffect)
    if (firstCapturedUpdate != null) __obj.updateDynamic("firstCapturedUpdate")(firstCapturedUpdate)
    if (firstEffect != null) __obj.updateDynamic("firstEffect")(firstEffect)
    if (firstUpdate != null) __obj.updateDynamic("firstUpdate")(firstUpdate)
    if (lastCapturedEffect != null) __obj.updateDynamic("lastCapturedEffect")(lastCapturedEffect)
    if (lastCapturedUpdate != null) __obj.updateDynamic("lastCapturedUpdate")(lastCapturedUpdate)
    if (lastEffect != null) __obj.updateDynamic("lastEffect")(lastEffect)
    if (lastUpdate != null) __obj.updateDynamic("lastUpdate")(lastUpdate)
    __obj.asInstanceOf[UpdateQueue[State]]
  }
}

