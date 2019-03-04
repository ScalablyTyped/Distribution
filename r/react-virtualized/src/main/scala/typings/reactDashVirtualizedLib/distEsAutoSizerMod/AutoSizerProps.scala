package typings
package reactDashVirtualizedLib.distEsAutoSizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoSizerProps
  extends /**
  * PLEASE NOTE
  * The [key: string]: any; line is here on purpose
  * This is due to the need of force re-render of PureComponent
  * Check the following link if you want to know more
  * https://github.com/bvaughn/react-virtualized#pass-thru-props
  */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * 	Optional custom CSS class name to attach to root AutoSizer element.
    * This is an advanced property and is not typically necessary.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Height passed to child for initial render; useful for server-side rendering.
    * This value will be overridden with an accurate height after mounting.
    */
  var defaultHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Width passed to child for initial render; useful for server-side rendering.
    * This value will be overridden with an accurate width after mounting.
    */
  var defaultWidth: js.UndefOr[scala.Double] = js.undefined
  /** Disable dynamic :height property */
  var disableHeight: js.UndefOr[scala.Boolean] = js.undefined
  /** Disable dynamic :width property */
  var disableWidth: js.UndefOr[scala.Boolean] = js.undefined
  /** Nonce of the inlined stylesheet for Content Security Policy */
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  /** Callback to be invoked on-resize: ({ height, width }) */
  var onResize: js.UndefOr[js.Function1[/* info */ Size, _]] = js.undefined
  /**
    * Optional custom inline style to attach to root AutoSizer element.
    * This is an advanced property and is not typically necessary.
    */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * Function responsible for rendering children.
    * This function should implement the following signature:
    * ({ height, width }) => PropTypes.element
    */
  def children(props: Size): reactLib.reactMod.ReactNs.ReactNode
}

object AutoSizerProps {
  @scala.inline
  def apply(
    children: js.Function1[Size, reactLib.reactMod.ReactNs.ReactNode],
    StringDictionary: /**
    * PLEASE NOTE
    * The [key: string]: any; line is here on purpose
    * This is due to the need of force re-render of PureComponent
    * Check the following link if you want to know more
    * https://github.com/bvaughn/react-virtualized#pass-thru-props
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    className: java.lang.String = null,
    defaultHeight: scala.Int | scala.Double = null,
    defaultWidth: scala.Int | scala.Double = null,
    disableHeight: js.UndefOr[scala.Boolean] = js.undefined,
    disableWidth: js.UndefOr[scala.Boolean] = js.undefined,
    nonce: java.lang.String = null,
    onResize: js.Function1[/* info */ Size, _] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): AutoSizerProps = {
    val __obj = js.Dynamic.literal(children = children)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultHeight != null) __obj.updateDynamic("defaultHeight")(defaultHeight.asInstanceOf[js.Any])
    if (defaultWidth != null) __obj.updateDynamic("defaultWidth")(defaultWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHeight)) __obj.updateDynamic("disableHeight")(disableHeight)
    if (!js.isUndefined(disableWidth)) __obj.updateDynamic("disableWidth")(disableWidth)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (onResize != null) __obj.updateDynamic("onResize")(onResize)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[AutoSizerProps]
  }
}

