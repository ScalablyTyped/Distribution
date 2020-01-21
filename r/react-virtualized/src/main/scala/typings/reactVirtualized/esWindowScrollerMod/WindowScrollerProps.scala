package typings.reactVirtualized.esWindowScrollerMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.reactVirtualized.AnonHeight
import typings.reactVirtualized.AnonScrollLeft
import typings.std.Element
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowScrollerProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ StringDictionary[js.Any] {
  /** Callback to be invoked on-resize: ({ height, width }) */
  var onResize: js.UndefOr[js.Function1[/* params */ AnonHeight, Unit]] = js.undefined
  /** Callback to be invoked on-scroll: ({ scrollLeft, scrollTop }) */
  var onScroll: js.UndefOr[js.Function1[/* params */ AnonScrollLeft, Unit]] = js.undefined
  /** Element to attach scroll event listeners. Defaults to window. */
  var scrollElement: js.UndefOr[
    (Window_ with (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis */ js.Any)) | Element
  ] = js.undefined
  /**
    * Wait this amount of time after the last scroll event before resetting child `pointer-events`.
    */
  var scrollingResetTimeInterval: js.UndefOr[Double] = js.undefined
  /** Height used for server-side rendering */
  var serverHeight: js.UndefOr[Double] = js.undefined
  /** Width used for server-side rendering */
  var serverWidth: js.UndefOr[Double] = js.undefined
  /**
    * Function responsible for rendering children.
    * This function should implement the following signature:
    * ({ height, isScrolling, scrollLeft, scrollTop, width, onChildScroll }) => PropTypes.element
    */
  def children(params: WindowScrollerChildProps): ReactNode
}

object WindowScrollerProps {
  @scala.inline
  def apply(
    children: WindowScrollerChildProps => ReactNode,
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ StringDictionary[js.Any] = null,
    onResize: /* params */ AnonHeight => Unit = null,
    onScroll: /* params */ AnonScrollLeft => Unit = null,
    scrollElement: (Window_ with (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis */ js.Any)) | Element = null,
    scrollingResetTimeInterval: Int | Double = null,
    serverHeight: Int | Double = null,
    serverWidth: Int | Double = null
  ): WindowScrollerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (scrollElement != null) __obj.updateDynamic("scrollElement")(scrollElement.asInstanceOf[js.Any])
    if (scrollingResetTimeInterval != null) __obj.updateDynamic("scrollingResetTimeInterval")(scrollingResetTimeInterval.asInstanceOf[js.Any])
    if (serverHeight != null) __obj.updateDynamic("serverHeight")(serverHeight.asInstanceOf[js.Any])
    if (serverWidth != null) __obj.updateDynamic("serverWidth")(serverWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowScrollerProps]
  }
}

