package typings.reactNativeSortableList.mod

import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.PanResponderGestureState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowProps[T, K] extends js.Object {
  var active: Boolean = js.native
  var data: T = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[Double] = js.native
  var key: js.UndefOr[K] = js.native
  var toggleRowActive: js.UndefOr[
    js.Function2[
      /* event */ GestureResponderEvent, 
      /* gestureState */ js.UndefOr[PanResponderGestureState], 
      Unit
    ]
  ] = js.native
}

object RowProps {
  @scala.inline
  def apply[T, K](active: Boolean, data: T): RowProps[T, K] = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowProps[T, K]]
  }
  @scala.inline
  implicit class RowPropsOps[Self <: RowProps[_, _], T, K] (val x: Self with (RowProps[T, K])) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setKey(value: K): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setToggleRowActive(
      value: (/* event */ GestureResponderEvent, /* gestureState */ js.UndefOr[PanResponderGestureState]) => Unit
    ): Self = this.set("toggleRowActive", js.Any.fromFunction2(value))
    @scala.inline
    def deleteToggleRowActive: Self = this.set("toggleRowActive", js.undefined)
  }
  
}

