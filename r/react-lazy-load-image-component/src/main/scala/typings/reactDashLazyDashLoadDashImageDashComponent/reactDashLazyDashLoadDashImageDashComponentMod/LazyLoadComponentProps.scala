package typings.reactDashLazyDashLoadDashImageDashComponent.reactDashLazyDashLoadDashImageDashComponentMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LazyLoadComponentProps extends CommonProps {
  var children: ReactNode
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object LazyLoadComponentProps {
  @scala.inline
  def apply(
    afterLoad: () => _ = null,
    beforeLoad: () => _ = null,
    children: ReactNode = null,
    delayMethod: DelayMethod = null,
    delayTime: Int | Double = null,
    placeholder: ReactElement = null,
    scrollPosition: ScrollPosition = null,
    style: CSSProperties = null,
    threshold: Int | Double = null,
    useIntersectionObserver: js.UndefOr[Boolean] = js.undefined,
    visibleByDefault: js.UndefOr[Boolean] = js.undefined
  ): LazyLoadComponentProps = {
    val __obj = js.Dynamic.literal()
    if (afterLoad != null) __obj.updateDynamic("afterLoad")(js.Any.fromFunction0(afterLoad))
    if (beforeLoad != null) __obj.updateDynamic("beforeLoad")(js.Any.fromFunction0(beforeLoad))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (delayMethod != null) __obj.updateDynamic("delayMethod")(delayMethod)
    if (delayTime != null) __obj.updateDynamic("delayTime")(delayTime.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (scrollPosition != null) __obj.updateDynamic("scrollPosition")(scrollPosition)
    if (style != null) __obj.updateDynamic("style")(style)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useIntersectionObserver)) __obj.updateDynamic("useIntersectionObserver")(useIntersectionObserver)
    if (!js.isUndefined(visibleByDefault)) __obj.updateDynamic("visibleByDefault")(visibleByDefault)
    __obj.asInstanceOf[LazyLoadComponentProps]
  }
}

