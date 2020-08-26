package typings.reactTouch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoldableProps extends js.Object {
  /** @see defineHold */
  var config: js.UndefOr[HoldableConfig] = js.native
  var onHoldComplete: js.UndefOr[js.Function0[Unit]] = js.native
  var onHoldProgress: js.UndefOr[js.Function0[Unit]] = js.native
  var onMouseDown: js.UndefOr[js.Function0[Unit]] = js.native
  var onTouchStart: js.UndefOr[js.Function0[Unit]] = js.native
}

object HoldableProps {
  @scala.inline
  def apply(): HoldableProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoldableProps]
  }
  @scala.inline
  implicit class HoldablePropsOps[Self <: HoldableProps] (val x: Self) extends AnyVal {
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
    def setConfig(value: HoldableConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setOnHoldComplete(value: () => Unit): Self = this.set("onHoldComplete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnHoldComplete: Self = this.set("onHoldComplete", js.undefined)
    @scala.inline
    def setOnHoldProgress(value: () => Unit): Self = this.set("onHoldProgress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnHoldProgress: Self = this.set("onHoldProgress", js.undefined)
    @scala.inline
    def setOnMouseDown(value: () => Unit): Self = this.set("onMouseDown", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMouseDown: Self = this.set("onMouseDown", js.undefined)
    @scala.inline
    def setOnTouchStart(value: () => Unit): Self = this.set("onTouchStart", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnTouchStart: Self = this.set("onTouchStart", js.undefined)
  }
  
}

