package typings.reactReconciler.mod

import typings.reactReconciler.reactReconcilerNumbers.`0`
import typings.reactReconciler.reactReconcilerNumbers.`1`
import typings.reactReconciler.reactReconcilerNumbers.`2`
import typings.reactReconciler.reactReconcilerNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// react-reconciler/ReactUpdateQueue
@js.native
trait Update[State] extends js.Object {
  var callback: js.Function0[_] | Null = js.native
  var expirationTime: ExpirationTime = js.native
  var next: Update[State] | Null = js.native
  var nextEffect: Update[State] | Null = js.native
  var payload: js.Any = js.native
  var tag: `0` | `1` | `2` | `3` = js.native
}

object Update {
  @scala.inline
  def apply[State](expirationTime: ExpirationTime, payload: js.Any, tag: `0` | `1` | `2` | `3`): Update[State] = {
    val __obj = js.Dynamic.literal(expirationTime = expirationTime.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Update[State]]
  }
  @scala.inline
  implicit class UpdateOps[Self <: Update[_], State] (val x: Self with Update[State]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpirationTime(value: ExpirationTime): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayload(value: js.Any): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: `0` | `1` | `2` | `3`): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallback(value: () => _): Self = this.set("callback", js.Any.fromFunction0(value))
    @scala.inline
    def setCallbackNull: Self = this.set("callback", null)
    @scala.inline
    def setNext(value: Update[State]): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextNull: Self = this.set("next", null)
    @scala.inline
    def setNextEffect(value: Update[State]): Self = this.set("nextEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextEffectNull: Self = this.set("nextEffect", null)
  }
  
}

