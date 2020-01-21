package typings.reactImageloader.mod

import typings.react.mod.CSSProperties
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageLoaderProps extends Props[ImageLoader] {
  /** An optional class name for the wrapper component. */
  var className: js.UndefOr[String] = js.undefined
  /** An optional object containing props for the underlying img component. */
  var imgProps: js.UndefOr[js.Any] = js.undefined
  /** An optional handler for the error event. */
  var onError: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
  /** An optional handler for the load event. */
  var onLoad: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
  /** An optional function that returns a React element to be shown while the image loads. */
  var preloader: js.UndefOr[js.Function1[/* params */ js.Any, ReactElement]] = js.undefined
  /** The URL of the image to be loaded. */
  var src: String
  /** An optional object containing styles for the wrapper component. */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /** A function that takes a props argument and returns a React element to be used as the wrapper component. Defaults to React.DOM.span. */
  var wrapper: js.UndefOr[js.Function1[/* props */ js.Any, ReactElement]] = js.undefined
}

object ImageLoaderProps {
  @scala.inline
  def apply(
    src: String,
    children: ReactNode = null,
    className: String = null,
    imgProps: js.Any = null,
    key: Key = null,
    onError: /* event */ js.Any => Unit = null,
    onLoad: /* event */ js.Any => Unit = null,
    preloader: /* params */ js.Any => ReactElement = null,
    ref: LegacyRef[ImageLoader] = null,
    style: CSSProperties = null,
    wrapper: /* props */ js.Any => ReactElement = null
  ): ImageLoaderProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (imgProps != null) __obj.updateDynamic("imgProps")(imgProps.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (preloader != null) __obj.updateDynamic("preloader")(js.Any.fromFunction1(preloader))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(js.Any.fromFunction1(wrapper))
    __obj.asInstanceOf[ImageLoaderProps]
  }
}

