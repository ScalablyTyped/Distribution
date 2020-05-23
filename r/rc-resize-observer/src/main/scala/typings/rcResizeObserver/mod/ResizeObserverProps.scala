package typings.rcResizeObserver.mod

import typings.rcResizeObserver.anon.Height
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeObserverProps extends js.Object {
  var children: ReactNode
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** Trigger if element resized. Will always trigger when first time render. */
  var onResize: js.UndefOr[js.Function1[/* size */ Height, Unit]] = js.undefined
}

object ResizeObserverProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onResize: /* size */ Height => Unit = null
  ): ResizeObserverProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    __obj.asInstanceOf[ResizeObserverProps]
  }
}

