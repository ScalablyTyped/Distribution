package typings.reactDashVirtualizedDashAutoDashSizer.reactDashVirtualizedDashAutoDashSizerMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoSizerProps extends js.Object {
  /** Optional custom CSS class name to attach to root AutoSizer element.    */
  var className: js.UndefOr[String] = js.undefined
  /** Default height to use for initial render; useful for SSR */
  var defaultHeight: js.UndefOr[Double] = js.undefined
  /** Default width to use for initial render; useful for SSR */
  var defaultWidth: js.UndefOr[Double] = js.undefined
  /** Disable dynamic :height property */
  var disableHeight: js.UndefOr[Boolean] = js.undefined
  /** Disable dynamic :width property */
  var disableWidth: js.UndefOr[Boolean] = js.undefined
  /** Nonce of the inlined stylesheet for Content Security Policy */
  var nonce: js.UndefOr[String] = js.undefined
  /** Callback to be invoked on-resize */
  var onResize: js.UndefOr[js.Function1[/* size */ Size, Unit]] = js.undefined
  /** Optional inline style */
  var style: js.UndefOr[CSSProperties] = js.undefined
  /** Function responsible for rendering children. */
  def children(size: Size): ReactNode
}

object AutoSizerProps {
  @scala.inline
  def apply(
    children: Size => ReactNode,
    className: String = null,
    defaultHeight: Int | Double = null,
    defaultWidth: Int | Double = null,
    disableHeight: js.UndefOr[Boolean] = js.undefined,
    disableWidth: js.UndefOr[Boolean] = js.undefined,
    nonce: String = null,
    onResize: /* size */ Size => Unit = null,
    style: CSSProperties = null
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

