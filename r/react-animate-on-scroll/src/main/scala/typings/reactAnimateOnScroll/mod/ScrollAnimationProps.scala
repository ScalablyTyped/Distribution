package typings.reactAnimateOnScroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollAnimationProps extends js.Object {
  var animateIn: js.UndefOr[String] = js.native
  var animateOnce: js.UndefOr[Boolean] = js.native
  var animateOut: js.UndefOr[String] = js.native
  var className: js.UndefOr[String] = js.native
  var delay: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var initiallyVisible: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Double] = js.native
  var scrollableParentSelector: js.UndefOr[String] = js.native
  var style: js.UndefOr[js.Object] = js.native
}

object ScrollAnimationProps {
  @scala.inline
  def apply(): ScrollAnimationProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollAnimationProps]
  }
  @scala.inline
  implicit class ScrollAnimationPropsOps[Self <: ScrollAnimationProps] (val x: Self) extends AnyVal {
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
    def setAnimateIn(value: String): Self = this.set("animateIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateIn: Self = this.set("animateIn", js.undefined)
    @scala.inline
    def setAnimateOnce(value: Boolean): Self = this.set("animateOnce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateOnce: Self = this.set("animateOnce", js.undefined)
    @scala.inline
    def setAnimateOut(value: String): Self = this.set("animateOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateOut: Self = this.set("animateOut", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setInitiallyVisible(value: Boolean): Self = this.set("initiallyVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitiallyVisible: Self = this.set("initiallyVisible", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setScrollableParentSelector(value: String): Self = this.set("scrollableParentSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollableParentSelector: Self = this.set("scrollableParentSelector", js.undefined)
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

