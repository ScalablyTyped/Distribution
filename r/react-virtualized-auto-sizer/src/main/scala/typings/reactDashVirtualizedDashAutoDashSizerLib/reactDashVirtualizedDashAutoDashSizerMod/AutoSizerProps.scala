package typings
package reactDashVirtualizedDashAutoDashSizerLib.reactDashVirtualizedDashAutoDashSizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoSizerProps extends js.Object {
  /** Optional custom CSS class name to attach to root AutoSizer element.    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Default height to use for initial render; useful for SSR */
  var defaultHeight: js.UndefOr[scala.Double] = js.undefined
  /** Default width to use for initial render; useful for SSR */
  var defaultWidth: js.UndefOr[scala.Double] = js.undefined
  /** Disable dynamic :height property */
  var disableHeight: js.UndefOr[scala.Boolean] = js.undefined
  /** Disable dynamic :width property */
  var disableWidth: js.UndefOr[scala.Boolean] = js.undefined
  /** Nonce of the inlined stylesheet for Content Security Policy */
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  /** Callback to be invoked on-resize */
  var onResize: js.UndefOr[js.Function1[/* size */ Size, scala.Unit]] = js.undefined
  /** Optional inline style */
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  /** Function responsible for rendering children. */
  def children(size: Size): reactLib.reactMod.ReactNode
}

object AutoSizerProps {
  @scala.inline
  def apply(
    children: Size => reactLib.reactMod.ReactNode,
    className: java.lang.String = null,
    defaultHeight: scala.Int | scala.Double = null,
    defaultWidth: scala.Int | scala.Double = null,
    disableHeight: js.UndefOr[scala.Boolean] = js.undefined,
    disableWidth: js.UndefOr[scala.Boolean] = js.undefined,
    nonce: java.lang.String = null,
    onResize: /* size */ Size => scala.Unit = null,
    style: reactLib.reactMod.CSSProperties = null
  ): AutoSizerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultHeight != null) __obj.updateDynamic("defaultHeight")(defaultHeight.asInstanceOf[js.Any])
    if (defaultWidth != null) __obj.updateDynamic("defaultWidth")(defaultWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHeight)) __obj.updateDynamic("disableHeight")(disableHeight)
    if (!js.isUndefined(disableWidth)) __obj.updateDynamic("disableWidth")(disableWidth)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[AutoSizerProps]
  }
}

