package typings.reactLazyLoadImageComponent.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonProps extends js.Object {
  /** Function called after the image has been completely loaded. */
  var afterLoad: js.UndefOr[js.Function0[_]] = js.native
  /** Function called right before the placeholder is replaced with the image element. */
  var beforeLoad: js.UndefOr[js.Function0[_]] = js.native
  /* Method from lodash to use to delay the scroll/resize events. */
  var delayMethod: js.UndefOr[DelayMethod] = js.native
  /** Time in ms sent to the delayMethod. */
  var delayTime: js.UndefOr[Double] = js.native
  /** React element to use as a placeholder. Default is <span>. */
  var placeholder: js.UndefOr[ReactElement | Null] = js.native
  /** See trackWindowScroll(). */
  var scrollPosition: js.UndefOr[ScrollPosition] = js.native
  /** Threshold in pixels. So the image starts loading before it appears in the viewport. */
  var threshold: js.UndefOr[Double] = js.native
  /** Whether to use browser's IntersectionObserver when available. */
  var useIntersectionObserver: js.UndefOr[Boolean] = js.native
  /** Whether the image must be visible from the beginning. */
  var visibleByDefault: js.UndefOr[Boolean] = js.native
}

object CommonProps {
  @scala.inline
  def apply(): CommonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonProps]
  }
  @scala.inline
  implicit class CommonPropsOps[Self <: CommonProps] (val x: Self) extends AnyVal {
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
    def setAfterLoad(value: () => _): Self = this.set("afterLoad", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAfterLoad: Self = this.set("afterLoad", js.undefined)
    @scala.inline
    def setBeforeLoad(value: () => _): Self = this.set("beforeLoad", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeLoad: Self = this.set("beforeLoad", js.undefined)
    @scala.inline
    def setDelayMethod(value: DelayMethod): Self = this.set("delayMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayMethod: Self = this.set("delayMethod", js.undefined)
    @scala.inline
    def setDelayTime(value: Double): Self = this.set("delayTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelayTime: Self = this.set("delayTime", js.undefined)
    @scala.inline
    def setPlaceholder(value: ReactElement): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPlaceholderNull: Self = this.set("placeholder", null)
    @scala.inline
    def setScrollPosition(value: ScrollPosition): Self = this.set("scrollPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollPosition: Self = this.set("scrollPosition", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    @scala.inline
    def setUseIntersectionObserver(value: Boolean): Self = this.set("useIntersectionObserver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseIntersectionObserver: Self = this.set("useIntersectionObserver", js.undefined)
    @scala.inline
    def setVisibleByDefault(value: Boolean): Self = this.set("visibleByDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleByDefault: Self = this.set("visibleByDefault", js.undefined)
  }
  
}

