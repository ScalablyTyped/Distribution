package typings.reactDndTouchBackend.interfacesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchBackendOptions extends js.Object {
  var delay: js.UndefOr[Double] = js.native
  var delayMouseStart: js.UndefOr[Double] = js.native
  var delayTouchStart: js.UndefOr[Double] = js.native
  var enableHoverOutsideTarget: js.UndefOr[Boolean] = js.native
  var enableKeyboardEvents: js.UndefOr[Boolean] = js.native
  var enableMouseEvents: js.UndefOr[Boolean] = js.native
  var enableTouchEvents: js.UndefOr[Boolean] = js.native
  var getDropTargetElementsAtPoint: js.UndefOr[
    js.Function3[
      /* x */ Double, 
      /* y */ Double, 
      /* dropTargets */ js.Array[HTMLElement], 
      js.Array[HTMLElement]
    ]
  ] = js.native
  var ignoreContextMenu: js.UndefOr[Boolean] = js.native
  var scrollAngleRanges: js.UndefOr[js.Array[AngleRange]] = js.native
  var touchSlop: js.UndefOr[Double] = js.native
}

object TouchBackendOptions {
  @scala.inline
  def apply(): TouchBackendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchBackendOptions]
  }
  @scala.inline
  implicit class TouchBackendOptionsOps[Self <: TouchBackendOptions] (val x: Self) extends AnyVal {
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDelayMouseStart(value: Double): Self = this.set("delayMouseStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayMouseStart: Self = this.set("delayMouseStart", js.undefined)
    @scala.inline
    def setDelayTouchStart(value: Double): Self = this.set("delayTouchStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayTouchStart: Self = this.set("delayTouchStart", js.undefined)
    @scala.inline
    def setEnableHoverOutsideTarget(value: Boolean): Self = this.set("enableHoverOutsideTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHoverOutsideTarget: Self = this.set("enableHoverOutsideTarget", js.undefined)
    @scala.inline
    def setEnableKeyboardEvents(value: Boolean): Self = this.set("enableKeyboardEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableKeyboardEvents: Self = this.set("enableKeyboardEvents", js.undefined)
    @scala.inline
    def setEnableMouseEvents(value: Boolean): Self = this.set("enableMouseEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableMouseEvents: Self = this.set("enableMouseEvents", js.undefined)
    @scala.inline
    def setEnableTouchEvents(value: Boolean): Self = this.set("enableTouchEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTouchEvents: Self = this.set("enableTouchEvents", js.undefined)
    @scala.inline
    def setGetDropTargetElementsAtPoint(
      value: (/* x */ Double, /* y */ Double, /* dropTargets */ js.Array[HTMLElement]) => js.Array[HTMLElement]
    ): Self = this.set("getDropTargetElementsAtPoint", js.Any.fromFunction3(value))
    @scala.inline
    def deleteGetDropTargetElementsAtPoint: Self = this.set("getDropTargetElementsAtPoint", js.undefined)
    @scala.inline
    def setIgnoreContextMenu(value: Boolean): Self = this.set("ignoreContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreContextMenu: Self = this.set("ignoreContextMenu", js.undefined)
    @scala.inline
    def setScrollAngleRangesVarargs(value: AngleRange*): Self = this.set("scrollAngleRanges", js.Array(value :_*))
    @scala.inline
    def setScrollAngleRanges(value: js.Array[AngleRange]): Self = this.set("scrollAngleRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollAngleRanges: Self = this.set("scrollAngleRanges", js.undefined)
    @scala.inline
    def setTouchSlop(value: Double): Self = this.set("touchSlop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTouchSlop: Self = this.set("touchSlop", js.undefined)
  }
  
}

