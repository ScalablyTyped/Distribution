package typings
package reactDashVirtualizedLib.distEsWindowScrollerMod

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
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Function responsible for rendering children.
    * This function should implement the following signature:
    * ({ height, isScrolling, scrollLeft, scrollTop, width, onChildScroll }) => PropTypes.element
    */
  var children: js.Function1[/* params */ WindowScrollerChildProps, reactLib.reactMod.ReactNs.ReactNode]
  /** Callback to be invoked on-resize: ({ height, width }) */
  var onResize: js.UndefOr[js.Function1[/* params */ reactDashVirtualizedLib.Anon_Height, scala.Unit]] = js.undefined
  /** Callback to be invoked on-scroll: ({ scrollLeft, scrollTop }) */
  var onScroll: js.UndefOr[js.Function1[/* params */ reactDashVirtualizedLib.Anon_ScrollTop, scala.Unit]] = js.undefined
  /** Element to attach scroll event listeners. Defaults to window. */
  var scrollElement: js.UndefOr[stdLib.Window | reactLib.Element] = js.undefined
  /**
    * Wait this amount of time after the last scroll event before resetting child `pointer-events`.
    */
  var scrollingResetTimeInterval: js.UndefOr[scala.Double] = js.undefined
  /** Height used for server-side rendering */
  var serverHeight: js.UndefOr[scala.Double] = js.undefined
  /** Width used for server-side rendering */
  var serverWidth: js.UndefOr[scala.Double] = js.undefined
}

