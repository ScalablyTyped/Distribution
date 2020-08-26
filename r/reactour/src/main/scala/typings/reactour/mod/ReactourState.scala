package typings.reactour.mod

import typings.std.MutationObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactourState extends js.Object {
  var bottom: Double = js.native
  var current: Double = js.native
  var focusUnlocked: Boolean = js.native
  var h: Double = js.native
  var height: Double = js.native
  var helperHeight: js.UndefOr[Double] = js.native
  var helperPosition: js.UndefOr[ReactourStepPosition] = js.native
  var helperWidth: js.UndefOr[Double] = js.native
  var inDOM: Boolean = js.native
  var isOpen: Boolean = js.native
  var left: Double = js.native
  var observer: MutationObserver | Null = js.native
  var right: Double = js.native
  var top: Double = js.native
  var w: Double = js.native
  var width: Double = js.native
}

object ReactourState {
  @scala.inline
  def apply(
    bottom: Double,
    current: Double,
    focusUnlocked: Boolean,
    h: Double,
    height: Double,
    inDOM: Boolean,
    isOpen: Boolean,
    left: Double,
    right: Double,
    top: Double,
    w: Double,
    width: Double
  ): ReactourState = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], focusUnlocked = focusUnlocked.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], inDOM = inDOM.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactourState]
  }
  @scala.inline
  implicit class ReactourStateOps[Self <: ReactourState] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusUnlocked(value: Boolean): Self = this.set("focusUnlocked", value.asInstanceOf[js.Any])
    @scala.inline
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setInDOM(value: Boolean): Self = this.set("inDOM", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setHelperHeight(value: Double): Self = this.set("helperHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelperHeight: Self = this.set("helperHeight", js.undefined)
    @scala.inline
    def setHelperPosition(value: ReactourStepPosition): Self = this.set("helperPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelperPosition: Self = this.set("helperPosition", js.undefined)
    @scala.inline
    def setHelperWidth(value: Double): Self = this.set("helperWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHelperWidth: Self = this.set("helperWidth", js.undefined)
    @scala.inline
    def setObserver(value: MutationObserver): Self = this.set("observer", value.asInstanceOf[js.Any])
    @scala.inline
    def setObserverNull: Self = this.set("observer", null)
  }
  
}

