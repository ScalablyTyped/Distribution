package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchEventInit extends EventModifierInit {
  var changedTouches: js.UndefOr[js.Array[Touch]] = js.native
  var targetTouches: js.UndefOr[js.Array[Touch]] = js.native
  var touches: js.UndefOr[js.Array[Touch]] = js.native
}

object TouchEventInit {
  @scala.inline
  def apply(): TouchEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchEventInit]
  }
  @scala.inline
  implicit class TouchEventInitOps[Self <: TouchEventInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChangedTouchesVarargs(value: Touch*): Self = this.set("changedTouches", js.Array(value :_*))
    @scala.inline
    def setChangedTouches(value: js.Array[Touch]): Self = this.set("changedTouches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangedTouches: Self = this.set("changedTouches", js.undefined)
    @scala.inline
    def setTargetTouchesVarargs(value: Touch*): Self = this.set("targetTouches", js.Array(value :_*))
    @scala.inline
    def setTargetTouches(value: js.Array[Touch]): Self = this.set("targetTouches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetTouches: Self = this.set("targetTouches", js.undefined)
    @scala.inline
    def setTouchesVarargs(value: Touch*): Self = this.set("touches", js.Array(value :_*))
    @scala.inline
    def setTouches(value: js.Array[Touch]): Self = this.set("touches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouches: Self = this.set("touches", js.undefined)
  }
  
}

