package typings.reactLazyLoadImageComponent.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
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
    delayTime: js.UndefOr[Double] = js.undefined,
    placeholder: js.UndefOr[Null | ReactElement] = js.undefined,
    scrollPosition: ScrollPosition = null,
    style: CSSProperties = null,
    threshold: js.UndefOr[Double] = js.undefined,
    useIntersectionObserver: js.UndefOr[Boolean] = js.undefined,
    visibleByDefault: js.UndefOr[Boolean] = js.undefined
  ): LazyLoadComponentProps = {
    val __obj = js.Dynamic.literal()
    if (afterLoad != null) __obj.updateDynamic("afterLoad")(js.Any.fromFunction0(afterLoad))
    if (beforeLoad != null) __obj.updateDynamic("beforeLoad")(js.Any.fromFunction0(beforeLoad))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (delayMethod != null) __obj.updateDynamic("delayMethod")(delayMethod.asInstanceOf[js.Any])
    if (!js.isUndefined(delayTime)) __obj.updateDynamic("delayTime")(delayTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(placeholder)) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (scrollPosition != null) __obj.updateDynamic("scrollPosition")(scrollPosition.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useIntersectionObserver)) __obj.updateDynamic("useIntersectionObserver")(useIntersectionObserver.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleByDefault)) __obj.updateDynamic("visibleByDefault")(visibleByDefault.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazyLoadComponentProps]
  }
}

