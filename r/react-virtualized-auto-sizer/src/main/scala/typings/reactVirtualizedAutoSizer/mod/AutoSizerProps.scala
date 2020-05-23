package typings.reactVirtualizedAutoSizer.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
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
    defaultHeight: js.UndefOr[Double] = js.undefined,
    defaultWidth: js.UndefOr[Double] = js.undefined,
    disableHeight: js.UndefOr[Boolean] = js.undefined,
    disableWidth: js.UndefOr[Boolean] = js.undefined,
    nonce: String = null,
    onResize: /* size */ Size => Unit = null,
    style: CSSProperties = null
  ): AutoSizerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultHeight)) __obj.updateDynamic("defaultHeight")(defaultHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultWidth)) __obj.updateDynamic("defaultWidth")(defaultWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHeight)) __obj.updateDynamic("disableHeight")(disableHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableWidth)) __obj.updateDynamic("disableWidth")(disableWidth.get.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoSizerProps]
  }
}

