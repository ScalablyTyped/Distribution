package typings.reactLazyLoadImageComponent.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react.react.ImgHTMLAttributes<std.HTMLImageElement>, 'placeholder' | 'onload'> ]: react.react.ImgHTMLAttributes<std.HTMLImageElement>[P]} */ trait LazyLoadImageProps extends CommonProps {
  /** Name of the effect to use. Requires importing CSS, see README.md. */
  var effect: js.UndefOr[Effect] = js.undefined
  /** Image src to display while the image is not visible or loaded. */
  var placeholderSrc: js.UndefOr[String] = js.undefined
  /** In some occasions (for example, when using a placeholderSrc) a wrapper span tag is rendered. This prop allows setting a class to that element. */
  var wrapperClassName: js.UndefOr[String] = js.undefined
}

object LazyLoadImageProps {
  @scala.inline
  def apply(
    afterLoad: () => _ = null,
    beforeLoad: () => _ = null,
    delayMethod: DelayMethod = null,
    delayTime: Int | Double = null,
    effect: Effect = null,
    placeholder: ReactElement = null,
    placeholderSrc: String = null,
    scrollPosition: ScrollPosition = null,
    threshold: Int | Double = null,
    useIntersectionObserver: js.UndefOr[Boolean] = js.undefined,
    visibleByDefault: js.UndefOr[Boolean] = js.undefined,
    wrapperClassName: String = null
  ): LazyLoadImageProps = {
    val __obj = js.Dynamic.literal()
    if (afterLoad != null) __obj.updateDynamic("afterLoad")(js.Any.fromFunction0(afterLoad))
    if (beforeLoad != null) __obj.updateDynamic("beforeLoad")(js.Any.fromFunction0(beforeLoad))
    if (delayMethod != null) __obj.updateDynamic("delayMethod")(delayMethod.asInstanceOf[js.Any])
    if (delayTime != null) __obj.updateDynamic("delayTime")(delayTime.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (placeholderSrc != null) __obj.updateDynamic("placeholderSrc")(placeholderSrc.asInstanceOf[js.Any])
    if (scrollPosition != null) __obj.updateDynamic("scrollPosition")(scrollPosition.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useIntersectionObserver)) __obj.updateDynamic("useIntersectionObserver")(useIntersectionObserver.asInstanceOf[js.Any])
    if (!js.isUndefined(visibleByDefault)) __obj.updateDynamic("visibleByDefault")(visibleByDefault.asInstanceOf[js.Any])
    if (wrapperClassName != null) __obj.updateDynamic("wrapperClassName")(wrapperClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazyLoadImageProps]
  }
}

