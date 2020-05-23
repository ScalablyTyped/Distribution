package typings.reactReconciler.mod

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
    val __obj = js.Dynamic.literal(baseState = baseState.asInstanceOf[js.Any], firstCapturedEffect = firstCapturedEffect.asInstanceOf[js.Any], firstCapturedUpdate = firstCapturedUpdate.asInstanceOf[js.Any], firstEffect = firstEffect.asInstanceOf[js.Any], firstUpdate = firstUpdate.asInstanceOf[js.Any], lastCapturedEffect = lastCapturedEffect.asInstanceOf[js.Any], lastCapturedUpdate = lastCapturedUpdate.asInstanceOf[js.Any], lastEffect = lastEffect.asInstanceOf[js.Any], lastUpdate = lastUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQueue[State]]
  }
}

