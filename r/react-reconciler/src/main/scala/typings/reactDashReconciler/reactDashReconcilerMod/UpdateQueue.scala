package typings.reactDashReconciler.reactDashReconcilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateQueue[State] extends js.Object {
  var baseState: State
  var firstCapturedEffect: Update[State] | Null
  var firstCapturedUpdate: Update[State] | Null
  var firstEffect: Update[State] | Null
  var firstUpdate: Update[State] | Null
  var lastCapturedEffect: Update[State] | Null
  var lastCapturedUpdate: Update[State] | Null
  var lastEffect: Update[State] | Null
  var lastUpdate: Update[State] | Null
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

